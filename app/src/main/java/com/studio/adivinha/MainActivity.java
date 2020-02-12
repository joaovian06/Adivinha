package com.studio.adivinha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public ViewHolder mViewHolder = new ViewHolder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.buttonPlay = findViewById(R.id.button_play);
        this.mViewHolder.textShow = findViewById(R.id.text_show);

        //this.mViewHolder.textShow.setText("Texto alterado");

        this.mViewHolder.buttonPlay.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Random randomic = new Random();

        int randomNum = randomic.nextInt(10);

        this.mViewHolder.textShow.setText("Numero escolhido: " + randomNum);
    }

    private static class ViewHolder {
        TextView textChoose;
        Button buttonPlay;
        TextView textShow;
    }

}
