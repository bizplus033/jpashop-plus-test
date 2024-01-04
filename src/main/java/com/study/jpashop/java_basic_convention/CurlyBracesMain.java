package com.study.jpashop.java_basic_convention;
/**
 * 중괄호
 * 중괄호는 어떠한 상황에서도 생략하지 않는다.
 * */
public class CurlyBracesMain {
    public void methodV1(int type) {
        if (type == 1) {
            System.out.println("1번 메서드입니다."); // 한 줄이어도 생략하지 않는다.
        }
        if (type == 2) {
            System.out.println("2번 메서드입니다.");
        }
    }
    public void methodV2() {
        int count = 0;
        while (true) {
            if (count == 1) {
                break;
            }
            count++;
        }
    }
}
