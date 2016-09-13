package com.example.rafael.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void movedatboi(View view) {
        ImageView datboi = (ImageView) findViewById(R.id.datboi);
        Button come = (Button) findViewById(R.id.come);
        Button go = (Button) findViewById(R.id.go);


        datboi.setVisibility(View.VISIBLE);
        datboi.animate().translationYBy(3000f).setDuration(2000);


        come.setEnabled(false);
        come.setVisibility(View.INVISIBLE);


        go.setEnabled(true);
        go.setVisibility(View.VISIBLE); }

    public void resetImages(View view) {
        Button come = (Button) findViewById(R.id.come);
        Button go = (Button) findViewById(R.id.go);
        ImageView datboi = (ImageView) findViewById(R.id.datboi);

        datboi.animate().translationYBy(-3000);


        go.setEnabled(false);
        go.setVisibility(View.INVISIBLE);


        come.setEnabled(true);
        come.setVisibility(View.VISIBLE); }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Hide dat boi before it all starts!
        ImageView datboi = (ImageView) findViewById(R.id.datboi);
        datboi.setTranslationY(-3000);
    }
}
