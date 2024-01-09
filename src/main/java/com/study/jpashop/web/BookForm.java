package com.study.jpashop.web;

import com.study.jpashop.domain.Item;
import com.study.jpashop.domain.item.Book;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookForm {

    private Long id;

    private String name;
    private int price;
    private int stockQuantity;

    private String author;
    private String isbn;

    public Book toEntity() {
        Book book = new Book();
        book.setName(this.getName());
        book.setPrice(this.getPrice());
        book.setStockQuantity(this.getStockQuantity());
        book.setAuthor(this.author);
        book.setIsbn(isbn);
        return book;
    }
}
