package com.example.naveen.quiz;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


class Utils {

    public interface DelayCallback {
        void afterDelay();
    }

    public static void delay(int secs, final DelayCallback delayCallback) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                delayCallback.afterDelay();
            }
        }, secs * 1000);
    }
}

public class MainActivity extends AppCompatActivity {
    int i = 1;
    String ques, opt_A, opt_B, opt_C, opt_D;
    int answer, cAnswer;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ques = "'OS' computer abbreviation usually means?";
        opt_A = "Order of Significance";
        opt_B = "Open Software";
        opt_C = "Operating System";
        opt_D = "Optical Sensr";
        answer = 3;
        displayQues(ques, opt_A, opt_B, opt_C, opt_D);
    }

    void getQues() {
        if (i == 2) {
            ques = "Which of the following is used in pencils?";
            opt_A = "Graphite";
            opt_B = "Silicon";
            opt_C = "Charcoal";
            opt_D = "Phosphorous";
            answer = 1;
            displayQues(ques, opt_A, opt_B, opt_C, opt_D);
        } else if (i == 3) {
            ques = "Which is the longest river on earth?";
            opt_A = "Ganga";
            opt_B = "Amazon";
            opt_C = "Nile";
            opt_D = "Cauvery";
            answer = 3;
            displayQues(ques, opt_A, opt_B, opt_C, opt_D);
        } else if (i == 4) {
            ques = "Which animal is referred as the ship of the desert?";
            opt_A = "Horse";
            opt_B = "Camel";
            opt_C = "Fox";
            opt_D = "Giraffee";
            answer = 2;
            displayQues(ques, opt_A, opt_B, opt_C, opt_D);
        } else if (i == 5) {
            ques = "Which is the coldest location on earth?";
            opt_A = "Green Land";
            opt_B = "Arbenia";
            opt_C = "Canada";
            opt_D = "East Antarctica";
            answer = 4;
            displayQues(ques, opt_A, opt_B, opt_C, opt_D);
        }
    }

    public void buttonA(View view) {
        cAnswer = 1;
        checkAnswer();
    }

    public void buttonB(View view) {
        cAnswer = 2;
        checkAnswer();
    }

    public void buttonC(View view) {
        cAnswer = 3;
        checkAnswer();
    }

    public void buttonD(View view) {
        cAnswer = 4;
        checkAnswer();
    }

    void checkAnswer() {
        if (cAnswer == answer) {
            if (i <= 5)
                Toast.makeText(MainActivity.this, "Your answer is correct", Toast.LENGTH_SHORT).show();
            score += 1;
            i++;
            if (i <= 5) {
                TextView textScore = (TextView) findViewById(R.id.score);
                textScore.setText(score + "/5");
            }
            if (i == 6) {
                TextView textScore = (TextView) findViewById(R.id.score);
                textScore.setText("Your Score is " + score + "/5\nThank You!");
            }
            Utils.delay(2, new Utils.DelayCallback() {
                @Override
                public void afterDelay() {
                    getQues();
                }
            });
        } else {
            if (i <= 5)
                Toast.makeText(MainActivity.this, "Wrong answer", Toast.LENGTH_SHORT).show();
            i++;
            Utils.delay(2, new Utils.DelayCallback() {
                @Override
                public void afterDelay() {
                    getQues();
                }
            });
        }
    }

    void displayQues(String ques, String opt_A, String opt_B, String opt_C, String opt_D) {
        TextView textQues = (TextView) findViewById(R.id.question);
        textQues.setText(ques);
        TextView textOptA = (TextView) findViewById(R.id.opt_a_answer);
        textOptA.setText(opt_A);
        TextView textOptB = (TextView) findViewById(R.id.opt_b_answer);
        textOptB.setText(opt_B);
        TextView textOptC = (TextView) findViewById(R.id.opt_c_answer);
        textOptC.setText(opt_C);
        TextView textOptD = (TextView) findViewById(R.id.opt_d_answer);
        textOptD.setText(opt_D);
        TextView textScore = (TextView) findViewById(R.id.score);
        textScore.setText(score + "/5");
    }

    public void reset(View view) {
        i = 1;
        score = 0;
        ques = "'OS' computer abbreviation usually means?";
        opt_A = "Order of Significance";
        opt_B = "Open Software";
        opt_C = "Operating System";
        opt_D = "Optical Sensr";
        answer = 3;
        displayQues(ques, opt_A, opt_B, opt_C, opt_D);
        EditText name = (EditText) findViewById(R.id.name);
        name.setText("");
    }


}
