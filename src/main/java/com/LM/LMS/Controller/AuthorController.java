package com.LM.LMS.Controller;

import com.LM.LMS.Models.Author;
import com.LM.LMS.RequestDto.AuthorRequestDto;
import com.LM.LMS.ResponseDto.AuthorResponseDto;
import com.LM.LMS.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @PostMapping("/create")
    public String createAuthor(@RequestBody()AuthorRequestDto authorRequestDto){

        return authorService.createAuthor(authorRequestDto);
    }

    @GetMapping("/findBy/{name}")
    public List<AuthorResponseDto> findByName(@PathVariable("name")String name){

        return authorService.findAuthorByName(name);
    }
}

