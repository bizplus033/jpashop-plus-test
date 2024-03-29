package com.study.jpashop.web;

import com.study.jpashop.domain.Item;
import com.study.jpashop.domain.item.Book;
import com.study.jpashop.service.ItemService;
import com.study.jpashop.service.UpdateItemForm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/items")
public class ItemController {

    private final ItemService itemService;

    @GetMapping("/new")
    public String createForm(Model model) {
        model.addAttribute("form", new BookForm());
        return "items/createItemForm";
    }

    @PostMapping("/new")
    public String create(BookForm form) {
        Book book = form.toEntity();
        itemService.saveItem(book);
        return "redirect:/items";
    }

    /**
     * 상품 목록
     * */
    @GetMapping
    public String list(Model model) {
        List<Item> items = itemService.findItems();
        model.addAttribute("items", items);
        return "items/itemList";
    }

    /**
     * 상품 수정 폼
     * */
    @GetMapping("/{itemId}/edit")
    public String updateItemForm(@PathVariable("itemId") Long itemId, Model model) {
        Item item = itemService.findOne(itemId);
        Book book = (Book) item;

        BookForm form = new BookForm();
        form.setId(book.getId());
        form.setName(book.getName());
        form.setPrice(book.getPrice());
        form.setStockQuantity(book.getStockQuantity());
        form.setAuthor(book.getAuthor());
        form.setIsbn(book.getIsbn());

        model.addAttribute("form", form);
        return "items/updateItemForm";
    }

    /**
     * 상품 수정 -> 권장 코드
     * */
    @PostMapping(value = "/{itemId}/edit")
    public String updateItem(@PathVariable Long itemId, @ModelAttribute("form") BookForm form) {
//        itemService.updateItem(itemId, form.getName(), form.getPrice(), form.getStockQuantity());
        UpdateItemForm updateItemForm = new UpdateItemForm(itemId, form.getName(), form.getPrice(), form.getStockQuantity());
        itemService.updateItem(updateItemForm);
        return "redirect:/items";
    }
}
