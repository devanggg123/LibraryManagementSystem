package com.LM.LMS.ResponseDto;

import com.LM.LMS.Enums.Genre;
import lombok.Builder;

@Builder
public class BookResponseDto {

    String name;
    Genre genre;

}
