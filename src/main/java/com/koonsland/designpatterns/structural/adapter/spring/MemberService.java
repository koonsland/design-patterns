package com.koonsland.designpatterns.structural.adapter.spring;

public class MemberService {
    public Member findByEmail(String email) {
        // 실제는 DB의 Repository에서 조회함
        return new Member(email, email);
    }
}
