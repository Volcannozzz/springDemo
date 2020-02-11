package com.volcanno.spring.cache;

import lombok.Getter;
import lombok.Setter;

/**
 * @author vayne
 * @date 2020-2-12 00:17:19
 * 实体类
 */
public class Book {

    @Getter
    @Setter
    private String isbn;

    @Getter
    @Setter
    private String name;

    public Book(String isbn, String name) {
        this.isbn = isbn;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
