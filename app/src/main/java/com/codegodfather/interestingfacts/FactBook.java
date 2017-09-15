package com.codegodfather.interestingfacts;

import java.util.Random;

/**
 * Created by godfather on 2017-09-15.
 */

class FactBook {
   private  String[] facts = {"Chuck Berry is Considered as the Father of Rock and Roll",
            "Jimi hendrix could play guitar with his tongue",
            "Rcok Music has been dominating music industry since last 50 years",
            "Led Zepplin,Pink Floyd, Deep Purple, and Black Sabbath were the bands that led foundation for Heavy Metal",
            "The Velvet Underground band motivated 40 other bands to be formed in 1970s"};

    //Method - GetFact
    String getFact()
    {
        String fact = "";
        //Add Randomization to select facts randomly
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);
        return facts[randomNumber]; //string overpowers the int and hence removes the error
    }
}
