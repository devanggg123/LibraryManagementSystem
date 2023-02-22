package com.LM.LMS.Service;

import com.LM.LMS.Convertors.BookConvertor;
import com.LM.LMS.Models.Author;
import com.LM.LMS.Models.Book;
import com.LM.LMS.Repository.AuthorRepository;
import com.LM.LMS.Repository.BookRepository;
import com.LM.LMS.RequestDto.BookRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    BookRepository bookRepository;

    public String createBook(BookRequestDto bookRequestDto){

        Book book = BookConvertor.convertDtoToEntity(bookRequestDto);

        //I need to set the AuthorEntity :

        int authorId = bookRequestDto.getAuthorId();

        //Getting the author Entity
        Author author  = authorRepository.findById(authorId).get();

        book.setAuthor(author);

        //That book list also needs to be updated

        List<Book> currentListOfBooks = author.getBooksWritten();
        currentListOfBooks.add(book);
        author.setBooksWritten(currentListOfBooks);

        //Save the author
        authorRepository.save(author);

        //Save the book
        //This function will automatically be called by the parent save

        return "succesfully added book";

    }

}
