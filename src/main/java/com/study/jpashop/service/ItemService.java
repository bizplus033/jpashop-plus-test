package com.study.jpashop.service;

import com.study.jpashop.domain.Item;
import com.study.jpashop.domain.item.Book;
import com.study.jpashop.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    @Transactional
    public void saveItem(Item item) {
        itemRepository.save(item);
    }

    public List<Item> findItems() {
        return itemRepository.findAll();
    }

    public Item findOne(Long itemId) {
        return itemRepository.findOne(itemId);
    }
    @Transactional
    public void updateItem(UpdateItemForm updateItemForm) {
        Book item = (Book) itemRepository.findOne(updateItemForm.getId());
        item.update(updateItemForm.getName(), updateItemForm.getPrice(), updateItemForm.getStockQuantity());
    }
}
