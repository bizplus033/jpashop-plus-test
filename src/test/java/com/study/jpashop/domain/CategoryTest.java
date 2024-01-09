package com.study.jpashop.domain;

import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;
@ExtendWith(SpringExtension.class)
@SpringBootTest
class CategoryTest {

    @Autowired
    EntityManager em;

    @Test
    @Transactional
    @Rollback(value = false)
    public void testCategory() {
        Category parent = new Category();
        parent.setName("스릴러");

        Category child = new Category();
        child.setName("오컬트");
        child.setParent(parent);

        Category child2 = new Category();
        child2.setName("서스펜스");
        child2.setParent(parent);

        Category child3 = new Category();
        child3.setName("미스터리");
        child3.setParent(parent);

        em.persist(parent);
        em.persist(child);
        em.persist(child2);
        em.persist(child3);

        em.flush(); // 변경 사항을 데이터베이스에 반영
    }

}