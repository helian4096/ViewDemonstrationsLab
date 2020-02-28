package com.premjithsiddharth.viewdemonstrationslab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;

import java.util.Timer;

public class MainActivity extends AppCompatActivity {
    int[] files;
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_1);
        files = new int[]{R.layout.layout_1, R.layout.layout_2, R.layout.layout_3, R.layout.layout_4, R.layout.layout_5, R.layout.layout_6, R.layout.layout_7};
        count = 0;
    }
    public void clickThrough(View v){
        count = (count++)%(files.length);
        setContentView(files[count]);
    }

}
