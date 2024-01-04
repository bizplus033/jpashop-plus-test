package com.study.jpashop.java_basic_convention;
/**
 * 관련된 메서드끼리 묶어주세요
 * */
public class RelatedMethod {
    public void a() {
        b();
        c();
    }

    public void b() {
        // a()에서 호출하므로 a() 바로 아래에
    }

    public void c(){
        // a()에서 호출하므로 a() 바로 아래에
    }

    public void d() {
        // a()와 관련 없으므로 a() 와 멀리
    }
}
