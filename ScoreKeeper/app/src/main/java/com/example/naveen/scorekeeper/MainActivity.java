package com.example.naveen.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int g1 = 0, g2 = 0, f1 = 0, f2 = 0, p1 = 0, p2 = 0, s1 = 0, s2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * team A
     */
    public void t_a_g(View view) {
        g1 += 1;
        display_tag(g1);
    }

    public void t_a_f(View view) {
        f1 += 1;
        display_taf(f1);
    }

    public void t_a_p(View view) {
        p1 += 1;
        display_tap(p1);
    }

    public void t_a_s(View view) {
        s1 += 1;
        display_tas(s1);
    }

    public void display_tag(int goal) {
        TextView number = (TextView) findViewById(R.id.tga);
        number.setText(String.valueOf(goal));
    }

    public void display_taf(int foul) {
        TextView number = (TextView) findViewById(R.id.tfa);
        number.setText(String.valueOf(foul));
    }

    public void display_tap(int penalty) {
        TextView number = (TextView) findViewById(R.id.tpa);
        number.setText(String.valueOf(penalty));
    }

    public void display_tas(int save) {
        TextView number = (TextView) findViewById(R.id.tsa);
        number.setText(String.valueOf(save));
    }


    /**
     * team B
     */
    public void t_b_g(View view) {
        g2 += 1;
        display_tbg(g2);
    }

    public void t_b_f(View view) {
        f2 += 1;
        display_tbf(f2);
    }

    public void t_b_p(View view) {
        p2 += 1;
        display_tbp(p2);
    }

    public void t_b_s(View view) {
        s2 += 1;
        display_tbs(s2);
    }

    public void display_tbg(int goal) {
        TextView number = (TextView) findViewById(R.id.tgb);
        number.setText(String.valueOf(goal));
    }

    public void display_tbf(int foul) {
        TextView number = (TextView) findViewById(R.id.tfb);
        number.setText(String.valueOf(foul));
    }

    public void display_tbp(int penalty) {
        TextView number = (TextView) findViewById(R.id.tpb);
        number.setText(String.valueOf(penalty));
    }

    public void display_tbs(int save) {
        TextView number = (TextView) findViewById(R.id.tsb);
        number.setText(String.valueOf(save));
    }


    public void reset(View view) {
        g1 = 0;
        f1 = 0;
        p1 = 0;
        s1 = 0;
        g2 = 0;
        f2 = 0;
        p2 = 0;
        s2 = 0;
        display_tag(g1);
        display_tbg(g2);
        display_taf(f1);
        display_tbf(f2);
        display_tap(p1);
        display_tbp(p2);
        display_tas(s1);
        display_tbs(s2);
    }


}
