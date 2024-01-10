package com.study.jpashop.runner;

import com.study.jpashop.domain.Address;
import com.study.jpashop.domain.Member;
import com.study.jpashop.domain.item.Book;
import com.study.jpashop.service.ItemService;
import com.study.jpashop.service.MemberService;
import com.study.jpashop.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.Comment;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DummyDataRunner implements CommandLineRunner {

    private final MemberService memberService;
    private final ItemService itemService;
    private final OrderService orderService;
    @Override
    public void run(String... args) throws Exception {
        createDummyMembers();
        createDummyBooks();
    }

    private void createDummyMembers() {
        Address address1 = new Address("부천시", "부천로397", "21423");
        Address address2 = new Address("서울시", "아차산로24", "14253");
        Address address3 = new Address("부산시", "해운대로261", "25712");

        Member member1 = new Member(null, "조민규", address1, null);
        Member member2 = new Member(null, "김영한", address2, null);
        Member member3 = new Member(null, "백기선", address3, null);

        memberService.join(member1);
        memberService.join(member2);
        memberService.join(member3);
    }

    private void createDummyBooks() {
        Book book1 = new Book("JPA 1", 1000, 10, "김영한", "989123");
        Book book2 = new Book("스프링 1", 2000, 20, "토비", "1249104");
        Book book3 = new Book("클린 코드", 3000, 30, "밥 아저씨", "673546");

        itemService.saveItem(book1);
        itemService.saveItem(book2);
        itemService.saveItem(book3);
    }
}
