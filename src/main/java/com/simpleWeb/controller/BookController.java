package com.simpleWeb.controller;

import com.simpleWeb.model.Book;
import com.simpleWeb.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    private static int counter = 0;

    @Autowired
    BookService bookService;

    @GetMapping("/book")
    private List<Book> getAllStudent()
    {
        return bookService.getAllBooks();
    }
    //creating a get mapping that retrieves the detail of a specific student
    @GetMapping("/book/{id}")
    private Book getBook(@PathVariable("id") int id)
    {
        return bookService.getBookById(id);
    }

    @DeleteMapping("/book/{id}")
    private void deleteBook(@PathVariable("id") int id)
    {
        bookService.delete(id);
    }

    @PostMapping("/book")
    private int saveBook(@RequestBody Book book)
    {
        bookService.saveOrUpdate(book);
        return book.getId();
    }

}
