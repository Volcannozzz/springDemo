package com.volcanno.spring.cache;

import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * 一个简单的实现
 *
 * @author vayne
 * @date 2020-2-12 00:19:49
 */
@Component
public class SimpleBookRepository implements BookRepository {

    @Override
    @Cacheable("books")
    public Book getBookByIsbn(String isbn) {
        syncOperation();
        return new Book(isbn, "Some book");
    }

    @Override
    @CachePut("books")
    public Book updateBook(String isbn) {
        return new Book("hello ,", "cache.");
    }

    private void syncOperation() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            throw new IllegalStateException(e);
        }
    }
}
