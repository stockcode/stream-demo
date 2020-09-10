package com.example.stream.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Dish {
    private String name;
    private boolean ok;
    private Integer calories;
    private Type type;

    public enum Type {
        FISH,
        MEAT,
        OTHER
    }
}
