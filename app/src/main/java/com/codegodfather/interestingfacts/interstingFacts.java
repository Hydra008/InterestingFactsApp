package com.codegodfather.interestingfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class interstingFacts extends AppCompatActivity {
    // Declaring member variables
    private TextView mFactView;
    private Button mShowFactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intersting_facts);

        //Assigning the views from layout file to corresponding variables
        mFactView= (TextView) findViewById(R.id.factTextView);
        mShowFactButton= (Button) findViewById(R.id.showFactButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] facts = {"Chuck Berry is Considered as the Father of Rock and Roll",
                            "Jimi hendrix could play guitar with his tongue",
                            "Rcok Music has been dominating music industry since last 50 years",
                            "Led Zepplin,Pink Floyd, Deep Purple, and Black Sabbath were the bands that led foundation for Heavy Metal",
                            "The Velvet Underground band motivated 40 other bands to be formed in 1970s"};
                //The button was clicked lets update the fact
                String fact = "";
                //Add Randomization to select facts randomly
                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(facts.length);
                fact= facts[randomNumber]; //string overpowers the int and hence removes the error

                //Updating the screen
                mFactView.setText(fact);
            }
        };

        mShowFactButton.setOnClickListener(listener);
    }
}
