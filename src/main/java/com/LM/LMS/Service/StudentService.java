package com.LM.LMS.Service;

import com.LM.LMS.Enums.CardStatus;
import com.LM.LMS.Models.Card;
import com.LM.LMS.Models.Student;
import com.LM.LMS.Repository.StudentRepository;
import com.LM.LMS.RequestDto.StudentRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;


    @Autowired
    CardService cardService;

    public String createStudent(StudentRequestDto studentRequestDto){

        //Step pending here :
        //Convert Dto to Entity ??

        Student student = new Student();
        student.setAge(studentRequestDto.getAge());
        student.setCountry(studentRequestDto.getCountry());
        student.setEmail(studentRequestDto.getEmail());
        student.setName(studentRequestDto.getName());


        Card newCard = cardService.createCard(student);


        //For that bidirectional relation
        student.setCard(newCard);

        studentRepository.save(student);
        //cardRepository.save() will automatically be taken of.

        return "Successfully added student and card";


    }


}
