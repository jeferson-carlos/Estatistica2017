package com.estatistica.br.estatistica2017;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.estatistica.br.estatistica2017.entidade.Provas;

import java.util.ArrayList;

/**
 * Created by jeferson.carlos on 23/03/2017.
 */

public class CardViewActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private static String LOG_TAG = "CardViewActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view_recycleview);

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new MyRecyclerViewAdapter(getDataSet());
        mRecyclerView.setAdapter(mAdapter);

        // Code to Add an item with default animation
        //((MyRecyclerViewAdapter) mAdapter).addItem(obj, index);

        // Code to remove an item with default animation
        //((MyRecyclerViewAdapter) mAdapter).deleteItem(index);
    }


    @Override
    protected void onResume() {
        super.onResume();
        ((MyRecyclerViewAdapter) mAdapter).setOnItemClickListener(new MyRecyclerViewAdapter
                .MyClickListener() {
            @Override
            public void onItemClick(int position, View v) {
                Log.i(LOG_TAG, " Clicked on Item " + position);
            }
        });
    }

    private ArrayList<Provas> getDataSet() {
        ArrayList results = new ArrayList<Provas>();
        for (int index = 0; index < 6; index++) {
            if (index == 0) {
                Provas obj = new Provas("SME0825",
                        " - Metodologia Científica I",
                        "Docente: Washington Luiz Marar",
                        "Data mais próxima: 19/06/2017");
                results.add(index, obj);
            } else if (index == 1) {
                Provas obj = new Provas("SMA0805",
                        " - Tópicos de Matemática",
                        "Docente: Adalberto Panobianco Bergamasco",
                        "Data mais próxima: 31/03/2017");
                results.add(index, obj);
            } else if (index == 2) {
                Provas obj = new Provas("SME0890",
                        " - Direcionamento Acadêmico I",
                        "Docente: Francisco Louzada Neto",
                        "");
                results.add(index, obj);
            } else if (index == 3) {
                Provas obj = new Provas("SMA0801",
                        " - Cálculo I",
                        "Docente: Carlos Alberto Maquera Apaza",
                        "Data mais próxima: 05/05/2017");
                results.add(index, obj);
            } else if (index == 4) {
                Provas obj = new Provas("SME0803",
                        " - Análise Exploratória de Dados",
                        "Docente: Katiane Silva Conceição",
                        "Data mais próxima: 04/05/2017");
                results.add(index, obj);
            } else if (index == 4) {
                Provas obj = new Provas("SMA0800",
                        " - Geometria Analítica",
                        "Docente: Alexandre Ananin",
                        "Data mais próxima: 10/05/2017");
                results.add(index, obj);
            }
        }
        return results;
    }
}
