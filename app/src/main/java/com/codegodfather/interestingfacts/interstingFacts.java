package com.codegodfather.interestingfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class interstingFacts extends AppCompatActivity {
    private FactBook factBook = new FactBook();
    private ColorWheel colorWheel = new ColorWheel();
    // Declaring member variables
    private TextView mFactView;
    private Button mShowFactButton;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intersting_facts);

        //Assigning the views from layout file to corresponding variables
        mFactView= (TextView) findViewById(R.id.factTextView);
        mShowFactButton= (Button) findViewById(R.id.showFactButton);
        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            String fact = factBook.getFact();


                //Updating the screen
                mFactView.setText(fact);
                int color = colorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                mShowFactButton.setTextColor(color);
            }
        };

        mShowFactButton.setOnClickListener(listener);
    }
}
