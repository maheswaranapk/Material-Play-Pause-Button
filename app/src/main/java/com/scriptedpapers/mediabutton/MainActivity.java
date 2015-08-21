package com.scriptedpapers.mediabutton;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.scriptedpapers.mediabutton.R;

public class MainActivity extends AppCompatActivity {

    MaterialPlayPauseButton materialPlayPauseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        materialPlayPauseButton = (MaterialPlayPauseButton) findViewById(R.id.materialPlayPauseButton);

        materialPlayPauseButton.setColor(Color.WHITE);

        materialPlayPauseButton.setAnimDuration(300);

        materialPlayPauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (materialPlayPauseButton.getState() == MaterialPlayPauseButton.PAUSE) {
                    materialPlayPauseButton.setToPlay();
                } else if (materialPlayPauseButton.getState() == MaterialPlayPauseButton.PLAY) {
                    materialPlayPauseButton.setToPause();
                }

            }
        });
    }
}
