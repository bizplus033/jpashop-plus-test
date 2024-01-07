package com.study.jpashop.repository;

import com.study.jpashop.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

@ExtendWith(SpringExtension.class)
//@RunWith(SpringRunner.class) // junit4 버전!
@SpringBootTest
class MemberRepositoryTest {
    @Autowired MemberRepository memberRepository;

//    @Test
//    @Transactional
//    @Rollback(false)
//    public void testMember() {
//        Member member = new Member();
//        member.setUsername("memberA");
//        Long savedId = memberRepository.save(member);
//
//        Member findMember = memberRepository.find(savedId);
//
//        Assertions.assertThat(findMember.getId()).isEqualTo(member.getId());
//        Assertions.assertThat(findMember.getUsername()).isEqualTo(member.getUsername());
//        Assertions.assertThat(findMember).isEqualTo(member); // JPA 엔티티 동일성 보장
//
//
//    }
}