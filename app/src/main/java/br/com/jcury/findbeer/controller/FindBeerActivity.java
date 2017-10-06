package br.com.jcury.findbeer.controller;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import br.com.jcury.findbeer.R;

/**
 * Created by jcury on 04/10/2017.
 */

public class FindBeerActivity  extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.find_beer_view);
    }

    public void onClickFindBeer(View v){
        TextView cerveja = (TextView) findViewById(R.id.beer_brand);
        Spinner color = (Spinner) findViewById(R.id.beer_color);
        String cor =  String.valueOf(color.getSelectedItem());
        cerveja.setText(cor);
    }

}
