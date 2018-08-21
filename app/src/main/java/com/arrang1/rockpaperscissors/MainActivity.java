package com.arrang1.rockpaperscissors;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import java.util.Random;




public class MainActivity extends AppCompatActivity {
    private ProgressDialog progress;
    Button brock, bpaper, bscissor;
    TextView userchoice, matchupchoice, results;
    TextView userpic, matchuppic, versuspic;
    TextView banner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        brock = findViewById(R.id.buttonRock);
        bpaper = findViewById(R.id.buttonPaper);
        bscissor = findViewById(R.id.buttonScissors);
        userchoice = findViewById(R.id.textViewUserAnswer);
        matchupchoice = findViewById(R.id.textViewMatchup);
        results = findViewById(R.id.textViewStatus);
        banner = findViewById(R.id.textViewtop);

        brock.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){

                userchoice.setText("Rock");
                battle("Rock");
            }
        });
        bpaper.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){

                userchoice.setText("Paper");
                battle("Paper");
            }
        });
        bscissor.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){

                userchoice.setText("Scissors");
                battle("Scissors");
            }
        });
    }
    public void battle(String yourAnswer){
        String opponentAnswer = getRandom();

        if (yourAnswer.equals("Rock")){
            switch(opponentAnswer){
                case "Rock":
                    results.setText("Draw");
                    break;

                case "Paper":
                    results.setText("Lose");
                    break;

                case "Scissors":
                    results.setText("Win");
                    break;

            }
        }
        else if (yourAnswer.equals("Paper")){
            switch(opponentAnswer){
                case "Rock":
                    results.setText("Win");
                    break;

                case "Paper":
                    results.setText("Draw");
                    break;

                case "Scissors":
                    results.setText("Lose");
                    break;

            }
        }
        else if (yourAnswer.equals("Scissors")){
            switch(opponentAnswer){
                case "Rock":
                    results.setText("Lose");
                    break;

                case "Paper":
                    results.setText("Win");
                    break;

                case "Scissors":
                    results.setText("Draw");
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
        matchupchoice.setText(randomAnswer);
        return randomAnswer;
    }
}
