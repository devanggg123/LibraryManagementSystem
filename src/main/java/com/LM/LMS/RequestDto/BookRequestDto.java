package com.LM.LMS.RequestDto;


import com.LM.LMS.Enums.Genre;
import lombok.Data;


@Data
public class BookRequestDto {


    private String name;

    private Genre genre;

    private int authorId;

}
