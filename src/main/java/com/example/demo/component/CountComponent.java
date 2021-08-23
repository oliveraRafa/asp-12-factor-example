package com.example.demo.component;

import org.springframework.stereotype.Component;

@Component
public class CountComponent {

    private int count = 0;

    public int getCount() {
        return count;
    }

    public void updateCount() {
        count++;
    }
}
