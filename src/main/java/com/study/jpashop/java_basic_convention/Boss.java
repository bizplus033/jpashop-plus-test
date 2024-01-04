package com.study.jpashop.java_basic_convention;
import java.util.Objects;
/**
 * 자바 기본 컨벤션을 따른 클래스 구조
 * */
public class Boss {
    public static final String PUBLIC_BOSS_NAME = "보스";
    protected static final String PUBLIC_BOSS_NAME2 = "보스";
    static final String PACKAGE_PRIVATE_BOSS_NAME = "보스";
    private static final String PRIVATE_BOSS_NAME = "보스";
    public static String bossName = "보스";
    public int publicHp;
    public Boss() {
    }
    public Boss(int publicHp) {
        this.publicHp = publicHp;
    }
    public static void staticAttack() {
        // ...
    }
    public void attack() {
        // ...
    }
    public int getPublicHp() {
        return publicHp;
    }
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final Boss boss = (Boss) o;
        return publicHp == boss.publicHp;
    }
    @Override
    public int hashCode() {
        return Objects.hash(publicHp);
    }
    @Override
    public String toString() {
        return "Boss{" +
                "publicHp=" + publicHp +
                '}';
    }
}
