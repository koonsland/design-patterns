package com.koonsland.designpatterns.structural.adapter.spring;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class AdapterLoginService {

    public String login(String email, String password) {
        UserDetailsService memberUserDetailsService = new MemberUserDetailsService(new MemberService());
        UserDetails userDetails = memberUserDetailsService.loadUserByUsername(email);
        if (!userDetails.getPassword().equals(password)) {
            throw new IllegalStateException("로그인에 실패했어요.");
        }

        return userDetails.getUsername();
    }
}
