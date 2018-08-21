package com.arrang.rockpaperscissors;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;
import java.util.Random;




public class MainActivity extends AppCompatActivity {
    private ProgressDialog progress;
    ImageButton brock, bpaper, bscissor;
    ImageView userchoice, matchupchoice;
    ImageView results;
    TextView useranswer, matchupanswer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        brock = findViewById(R.id.buttonRock);
        bpaper = findViewById(R.id.buttonPaper);
        bscissor = findViewById(R.id.buttonScissors);
        userchoice = findViewById(R.id.imageViewUserPicture);
        matchupchoice = findViewById(R.id.imageViewMatchupPicture);
        results = findViewById(R.id.textViewStatus);
        useranswer = findViewById(R.id.textViewUserAnswer);
        matchupanswer = findViewById(R.id.textViewMatchup);

        brock.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){

                useranswer.setText("Rock");
                battle("Rock");
            }
        });
        bpaper.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){

                useranswer.setText("Paper");
                battle("Paper");
            }
        });
        bscissor.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){

                useranswer.setText("Scissors");
                battle("Scissors");
            }
        });
    }
    public void battle(String yourAnswer){
        String opponentAnswer = getRandom();

        if (yourAnswer.equals("Rock")){
            userchoice.setImageResource(R.drawable.rockfigurepic);
            switch(opponentAnswer){
                case "Rock":
                    //results.setText("Draw");
                    results.setImageResource(R.drawable.drawiconfixed);
                    matchupchoice.setImageResource(R.drawable.rockfigurepic);
                    break;

                case "Paper":
                    //results.setText("Lose");
                    results.setImageResource(R.drawable.youloseiconfix);
                    matchupchoice.setImageResource(R.drawable.paperfigurepic);
                    break;

                case "Scissors":
                    //results.setText("Win");
                    results.setImageResource(R.drawable.youwinicon);
                    matchupchoice.setImageResource(R.drawable.scissorsfigurepic);
                    break;

            }
        }
        else if (yourAnswer.equals("Paper")){
            userchoice.setImageResource(R.drawable.paperfigurepic);
            switch(opponentAnswer){
                case "Rock":
                    //results.setText("Win");
                    results.setImageResource(R.drawable.youwinicon);
                    matchupchoice.setImageResource(R.drawable.rockfigurepic);
                    break;

                case "Paper":
                    //results.setText("Draw");
                    results.setImageResource(R.drawable.drawiconfixed);
                    matchupchoice.setImageResource(R.drawable.paperfigurepic);
                    break;

                case "Scissors":
                    //results.setText("Lose");
                    results.setImageResource(R.drawable.youloseiconfix);
                    matchupchoice.setImageResource(R.drawable.scissorsfigurepic);
                    break;

            }
        }
        else if (yourAnswer.equals("Scissors")){
            userchoice.setImageResource(R.drawable.scissorsfigurepic);
            switch(opponentAnswer){
                case "Rock":
                    //results.setText("Lose");
                    results.setImageResource(R.drawable.youloseiconfix);
                    matchupchoice.setImageResource(R.drawable.rockfigurepic);
                    break;

                case "Paper":
                    //results.setText("Win");
                    results.setImageResource(R.drawable.youwinicon);
                    matchupchoice.setImageResource(R.drawable.paperfigurepic);
                    break;

                case "Scissors":
                    //results.setText("Draw");
                    results.setImageResource(R.drawable.drawiconfixed);
                    matchupchoice.setImageResource(R.drawable.scissorsfigurepic);
                    break;

            }
        }


    }
    public String getRandom(){
        Random rand = new Random();
        int random = rand.nextInt(3);
        String randomAnswer = new String();
        if (random == 0){
            randomAnswer = "Rock";
        }
        else if(random == 1){
            randomAnswer = "Paper";
        }
        else if(random == 2){
            randomAnswer = "Scissors";
        }
        //matchupchoice.setText(randomAnswer);
        matchupanswer.setText(randomAnswer);
        return randomAnswer;
    }
}
