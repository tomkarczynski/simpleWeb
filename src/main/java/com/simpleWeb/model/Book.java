package com.simpleWeb.model;

import javax.persistence.*;

@Entity
@Table(name = "book_table")
public class Book {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column
    private int id;
    @Column
    private String title;
    @Column
    private String author;
    @Column
    private int pages;

    protected Book() {}

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return String.format(
                "BookObject[id=%d, title='%s', author='%s', pages='%s']",
                id, title, author, pages);
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }
}
