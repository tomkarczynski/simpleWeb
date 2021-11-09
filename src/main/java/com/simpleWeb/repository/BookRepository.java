package com.simpleWeb.repository;

import java.util.List;

import com.simpleWeb.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer>
{
}
