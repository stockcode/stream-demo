package com.example.stream;

import com.example.stream.entity.Dish;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
class StreamApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testStream() {
//        List<Integer> integers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
//        integers.stream().filter(i -> i % 2 == 0).forEach(System.out::println);

        List<Dish> specialMenu = Arrays.asList(
                new Dish("seasonal fruit", true, 120, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER)
        );

        List<Dish> filteredMenu = specialMenu.stream()
                .filter(dish -> dish.getCalories() < 320)
                .collect(Collectors.toList());

        List<Dish> slicedMenu1 = specialMenu.stream()
                .takeWhile( dish -> dish.getCalories() < 320)
                .collect(Collectors.toList());

        slicedMenu1.forEach(System.out::println);
    }

}
