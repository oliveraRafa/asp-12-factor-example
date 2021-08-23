package com.example.demo.component;

import org.springframework.stereotype.Component;

@Component
public class CountComponent {

    private int count;

    public int getCount() {
        return count;
    }

    public int updateCount() {
        return count + 1;
    }
}
