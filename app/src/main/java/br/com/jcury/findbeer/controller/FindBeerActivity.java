package br.com.jcury.findbeer.controller;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

import br.com.jcury.findbeer.R;
import br.com.jcury.findbeer.model.BeerExpert;

/**
 * Created by jcury on 04/10/2017.
 */

public class FindBeerActivity  extends AppCompatActivity{

    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.find_beer_view);
    }

    public void onClickFindBeer(View v){
        TextView marcas = (TextView) findViewById(R.id.beer_brand);
        Spinner cores = (Spinner) findViewById(R.id.beer_color);
        String cor =  String.valueOf(cores.getSelectedItem());
        List<String> listMarcas = expert.getBrands(cor);

        StringBuilder listaMarcasFormatada = new StringBuilder();
        for(String m : listMarcas){
            listaMarcasFormatada.append(m).append("\n");
        }

        marcas.setText(listaMarcasFormatada);
    }

}
