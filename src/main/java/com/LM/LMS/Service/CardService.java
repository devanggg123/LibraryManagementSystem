package com.LM.LMS.Service;

import com.LM.LMS.Enums.CardStatus;
import com.LM.LMS.Models.Card;
import com.LM.LMS.Models.Student;
import org.springframework.stereotype.Service;

@Service
public class CardService {


    public Card createCard(Student student){

        Card newCard = new Card();


        newCard.setCardStatus(CardStatus.ACTIVATED);
        newCard.setStudent(student); //For that new foreign key column

        return newCard;
    }


    //findById
    //



}

