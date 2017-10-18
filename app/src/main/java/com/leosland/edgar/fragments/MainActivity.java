package com.leosland.edgar.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements TopFragment.ToolbarListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onButtonClick(String text) {
        // Get Fragment B
        BottomFragment bottomFragment = new BottomFragment();
        getSupportFragmentManager().findFragmentById(R.id.fragment_bottom);
        TextView textView = (TextView) findViewById(R.id.editable_text);
        bottomFragment.changeText(textView, text);
    }
}
