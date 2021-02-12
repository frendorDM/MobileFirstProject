package com.example.firstlesson;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import static com.example.firstlesson.R.color.Black;
import static com.example.firstlesson.R.color.Blue;
import static com.example.firstlesson.R.color.Indigo;
import static com.example.firstlesson.R.color.Orange;
import static com.example.firstlesson.R.color.Red;
import static com.example.firstlesson.R.color.Violet;
import static com.example.firstlesson.R.color.White;
import static com.example.firstlesson.R.color.Yellow;
import static com.example.firstlesson.R.color.grey;

public class MainActivity extends AppCompatActivity {
private LinearLayout LampGreen, LampYellow, LampRed, LampOrange,LampBlue,LampIndigo,LampViolet,LampBlack,LampWhite;
private Button buttonStartStop;
private Boolean isStartStop = false;
private int counter=0;
int speedGame =80;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LampGreen = findViewById(R.id.LampGreen);
        LampYellow = findViewById(R.id.LampYellow);
        LampRed = findViewById(R.id.LampRed);
        LampOrange = findViewById(R.id.LampOrange);
        LampBlue = findViewById(R.id.LampBlue);
        LampIndigo = findViewById(R.id.LampIndigo);
        LampViolet = findViewById(R.id.LapmViolet);
        LampBlack = findViewById(R.id.LapmBlack);
        LampWhite = findViewById(R.id.LampWhite);
        buttonStartStop = findViewById(R.id.buttonStartStop);

    }

    public void OnClickStart(View view) {
        if(!isStartStop) {
            buttonStartStop.setText("Stop");
            isStartStop=true;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (isStartStop) {
                        switch (++counter){
                            case 1:
                                SetAllGrey();
                                LampGreen.setBackgroundColor(getResources().getColor(R.color.Green));
                                break;
                            case 2:
                                SetAllGrey();
                                LampYellow.setBackgroundColor(getResources().getColor(Yellow));
                                break;
                            case 3:
                                SetAllGrey();
                                LampRed.setBackgroundColor(getResources().getColor(Red));
                                break;
                            case 4:
                                SetAllGrey();
                                LampOrange.setBackgroundColor(getResources().getColor(Orange));
                                break;
                            case 5:
                                SetAllGrey();
                                LampBlue.setBackgroundColor(getResources().getColor(Blue));
                                break;
                            case 6:
                                SetAllGrey();
                                LampViolet.setBackgroundColor(getResources().getColor(Violet));
                                break;
                            case 7:
                                SetAllGrey();
                                LampIndigo.setBackgroundColor(getResources().getColor(Indigo));
                                break;
                            case 8:
                                SetAllGrey();
                                LampBlack.setBackgroundColor(getResources().getColor(Black));
                                break;
                            case 9:
                                SetAllGrey();
                                LampWhite.setBackgroundColor(getResources().getColor(White));
                                counter =0;
                                break;
                        }
                        try {
                            Thread.sleep(speedGame);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                }
            }).start();

        }
        else {
         isStartStop=false;
         buttonStartStop.setText("Start");
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        isStartStop=false;
    }

    public void SetAllGrey()
    {
        LampGreen.setBackgroundColor(getResources().getColor(grey));
        LampYellow.setBackgroundColor(getResources().getColor(grey));
        LampRed.setBackgroundColor(getResources().getColor(grey));
        LampOrange.setBackgroundColor(getResources().getColor(grey));
        LampBlue.setBackgroundColor(getResources().getColor(grey));
        LampViolet.setBackgroundColor(getResources().getColor(grey));
        LampIndigo.setBackgroundColor(getResources().getColor(grey));
        LampBlack.setBackgroundColor(getResources().getColor(grey));
        LampWhite.setBackgroundColor(getResources().getColor(grey));
    }
}