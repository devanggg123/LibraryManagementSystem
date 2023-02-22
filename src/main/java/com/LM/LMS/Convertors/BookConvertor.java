package com.LM.LMS.Convertors;

import com.LM.LMS.Models.Book;
import com.LM.LMS.RequestDto.BookRequestDto;

public class BookConvertor {


    public static Book convertDtoToEntity(BookRequestDto bookRequestDto){

        Book book = Book.builder().name(bookRequestDto.getName()).genre(bookRequestDto.getGenre()) .build();

        return book;
    }


}

