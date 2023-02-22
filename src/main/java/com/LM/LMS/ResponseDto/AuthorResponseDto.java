package com.LM.LMS.ResponseDto;

import com.LM.LMS.Models.Book;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class AuthorResponseDto {

    private int id;

    private String name;

    private int age;

    private String country;

    private String email;

}

