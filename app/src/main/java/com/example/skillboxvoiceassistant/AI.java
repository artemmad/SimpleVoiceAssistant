package com.example.skillboxvoiceassistant;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class AI {
    public static String getAnswer(String question)
    {
        ArrayList<String> answers = new ArrayList<>();

        question = question.toLowerCase();
        if(question.contains("привет")) answers.add("И вам привет");

        if(question.contains("как дела")) answers.add("Все ок");

        if(question.contains("сколько времени")) {
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

            String time = timeFormat.format(new Date());

            answers.add("Точное время: "+ time+ " сэр");
        }

        if (answers.size()>0){
            return String.join(",",answers);
        }
        else return "Ok";
    }
}
