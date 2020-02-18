package com.volcanno.spring.cache;

/**
 * @author vayne
 * @date 2020-2-12 00:18:33
 */
public interface BookRepository {
    /**
     * 根据isbn查询Book
     *
     * @param isbn isbn
     * @return book
     */
    Book getBookByIsbn(String isbn);

    /**
     *
     * @param isbn isbn
     * @return
     */
    Book updateBook(String isbn);
}
