# Material-Play-Pause-Button
This is a sample implementation of Android Material Play Pause Button Animation.

# **Features**
+ Change Button Color.
+ Change Button Animation Time.

# **How To use**
Copy **MaterialPlayPauseButton.java** to the project.

In Layout xml,
```xml
            <com.scriptedpapers.mediabutton.MaterialPlayPauseButton
                    android:id="@+id/materialPlayPauseButton"
                    android:layout_width="250dp"
                    android:layout_height="250dp"/>
```

In View,
```
            materialPlayPauseButton.setColor(Color.WHITE);
            materialPlayPauseButton.setAnimDuration(300);

            // Set To Play State
            materialPlayPauseButton.setToPlay();

            // Set To pause State
            materialPlayPauseButton.setToPause();
```

**Button States**
```
    materialPlayPauseButton.getState();
```

+ MaterialPlayPauseButton.PLAY
+ MaterialPlayPauseButton.PAUSE

# **Output**
![alt tag](https://github.com/maheswaranapk/Material-Play-Pause-Button/blob/master/Output/Material-Play-Pause-Button.gif)
