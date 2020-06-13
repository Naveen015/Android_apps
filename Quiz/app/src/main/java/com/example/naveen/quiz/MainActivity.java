package com.example.naveen.quiz;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.os.Handler;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

class Utils {
    public interface DelayCallback{
        void afterDelay();
    }

    public static void delay(int secs, final DelayCallback delayCallback){
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
    int score = 0, secs = 3, q1 = 1, q2A = 1, q2B = 1, q2C = 1, q2D = 1, q3 = 1, q4 = 1, q5 = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.opt1A:
                if (checked) {
                    if (q1 == 2) {
                        score -= 1;
                        q1--;
                    }
                    break;
                }
            case R.id.opt1B:
                if (checked) {
                    if (q1 == 1) {
                        score += 1;
                        q1++;
                    }
                    break;
                }
            case R.id.opt1C:
                if (checked) {
                    if (q1 == 2) {
                        score -= 1;
                        q1--;
                    }
                    break;
                }
            case R.id.opt1D:
                if (checked) {
                    if (q1 == 2) {
                        score -= 1;
                        q1--;
                    }
                    break;
                }
            case R.id.opt3A:
                if (checked) {
                    if (q3 == 1) {
                        score += 1;
                        q3++;
                    }
                    break;
                }
            case R.id.opt3B:
                if (checked) {
                    if (q3 == 2) {
                        score -= 1;
                        q3--;
                    }
                    break;
                }
            case R.id.opt3C:
                if (checked) {
                    if (q3 == 2) {
                        score -= 1;
                        q3--;
                    }
                    break;
                }
            case R.id.opt3D:
                if (checked) {
                    if (q3 == 2) {
                        score -= 1;
                        q3--;
                    }
                    break;
                }
            case R.id.opt4A:
                if (checked) {
                    if (q4 == 2) {
                        score -= 1;
                        q4--;
                    }
                    break;
                }
            case R.id.opt4B:
                if (checked) {
                    if (q4 == 2) {
                        score -= 1;
                        q4--;
                    }
                    break;
                }
            case R.id.opt4C:
                if (checked) {
                    if (q4 == 2) {
                        score -= 1;
                        q4--;
                    }
                    break;
                }
            case R.id.opt4D:
                if (checked) {
                    if (q4 == 1) {
                        score += 1;
                        q4++;
                    }
                    break;
                }
            case R.id.opt5A:
                if (checked) {
                    if (q5 == 2) {
                        score -= 1;
                        q5--;
                    }
                    break;
                }
            case R.id.opt5B:
                if (checked) {
                    if (q5 == 2) {
                        score -= 1;
                        q5--;
                    }
                    break;
                }
            case R.id.opt5C:
                if (checked) {
                    if (q5 == 1) {
                        score += 1;
                        q5++;
                    }
                    break;
                }
            case R.id.opt5D:
                if (checked) {
                    if (q5 == 2) {
                        score -= 1;
                        q5--;
                    }
                    break;
                }
        }
    }

    public void onCheckBoxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.opt2A:
                if (checked) {
                    if (q2A==1)
                        q2A++;
                    break;
                }
                else if (q2A==2) {
                    q2A--;
                    if(q2B==2)
                        score--;
                    break;
                }
            case R.id.opt2B:
                if (checked) {
                    if (q2B==1)
                        q2B++;
                    break;
                }
                else if (q2B==2) {
                    q2B--;
                    if(q2A==2)
                        score--;
                    break;
                }
            case R.id.opt2C:
                if (checked) {
                    if (q2C==1) {
                        q2C++;
                        if (q2A == 2 && q2B ==2 && q2D !=2)
                            score -= 1;
                    }
                    break;
                }
                else if (q2C==2) {
                    q2C--;
                    break;
                }
            case R.id.opt2D:
                if (checked) {
                    if (q2D==1) {
                        q2D++;
                        if (q2A == 2 && q2B ==2 && q2C != 2)
                            score -= 1;
                    }
                    break;
                }
                else if (q2D==2) {
                    q2D--;
                    break;
                }
        }
        if((q2A==2) && (q2B==2) && (q2C!=2) && (q2D!=2)) {
            score += 1;
        }

    }

    public void submit(View view) {
        Toast.makeText(MainActivity.this, "Score : " + score, Toast.LENGTH_SHORT).show();
        Utils.delay(secs, new Utils.DelayCallback() {
            @Override
            public void afterDelay() {
                score = 0;
                q1 = 1;
                q2A = 1;
                q2B = 1;
                q2C = 1;
                q2D = 1;
                q3 = 1;
                q4 = 1;
                q5 = 1;
                EditText editText = (EditText) findViewById(R.id.Name);
                editText.setText("");
                RadioGroup radioGroup1 = (RadioGroup) findViewById(R.id.opt1);
                radioGroup1.clearCheck();
                CheckBox checkBox1 = (CheckBox) findViewById(R.id.opt2A);
                checkBox1.setChecked(false);
                CheckBox checkBox2 = (CheckBox) findViewById(R.id.opt2B);
                checkBox2.setChecked(false);
                CheckBox checkBox3 = (CheckBox) findViewById(R.id.opt2C);
                checkBox3.setChecked(false);
                CheckBox checkBox4 = (CheckBox) findViewById(R.id.opt2D);
                checkBox4.setChecked(false);
                RadioGroup radioGroup3 = (RadioGroup) findViewById(R.id.opt3);
                radioGroup3.clearCheck();
                RadioGroup radioGroup4 = (RadioGroup) findViewById(R.id.opt4);
                radioGroup4.clearCheck();
                RadioGroup radioGroup5 = (RadioGroup) findViewById(R.id.opt5);
                radioGroup5.clearCheck();
            }
        });
    }
}

