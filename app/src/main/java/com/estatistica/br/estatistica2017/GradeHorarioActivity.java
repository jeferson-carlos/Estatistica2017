package com.estatistica.br.estatistica2017;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.estatistica.br.estatistica2017.entidade.Disciplina;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jeferson.carlos on 22/03/2017.
 */

public class GradeHorarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade_horaria);
        bindRecyclerView();
    }

    private void bindRecyclerView() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setAdapter(new ListAdapterDisciplina(this, mock()));
    }

    private List<Disciplina> mock() {
        List<Disciplina> disciplinaList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                Disciplina disciplina = new Disciplina();
                disciplina.setDiaSemana("SEGUNDA-FEIRA");
                disciplina.setNome("Metodologia Científica I");
                disciplina.setHorario("19h às 20:40h");
                disciplina.setCodigo("SME0825");
                disciplinaList.add(disciplina);

                disciplina = new Disciplina();
                disciplina.setDiaSemana("SEGUNDA-FEIRA");
                disciplina.setNome("Tópicos de Matemática");
                disciplina.setHorario("21h às 22:40h");
                disciplina.setCodigo("SMA0805");
                disciplinaList.add(disciplina);
            } else if (i == 1) {
                Disciplina disciplina = new Disciplina();
                disciplina.setDiaSemana("TERCA-FEIRA");
                disciplina.setNome("Direcionamento Acadêmico I");
                disciplina.setHorario("18h às 18:50h");
                disciplina.setCodigo("SME0890");
                disciplinaList.add(disciplina);

                disciplina = new Disciplina();
                disciplina.setDiaSemana("TERCA-FEIRA");
                disciplina.setNome("Cálculo I");
                disciplina.setHorario("19h às 20:40h");
                disciplina.setCodigo("SMA0801 ");
                disciplinaList.add(disciplina);

                disciplina = new Disciplina();
                disciplina.setDiaSemana("TERCA-FEIRA");
                disciplina.setNome("Análise Exploratória de Dados");
                disciplina.setHorario("21h às 22:40h");
                disciplina.setCodigo("SME0803");
                disciplinaList.add(disciplina);
            } else if (i == 2) {
                Disciplina disciplina = new Disciplina();
                disciplina.setDiaSemana("QUARTA-FEIRA");
                disciplina.setNome("Geometria Analítica");
                disciplina.setHorario("19h às 20:40h");
                disciplina.setCodigo("SMA0800");
                disciplinaList.add(disciplina);

                disciplina = new Disciplina();
                disciplina.setDiaSemana("QUARTA-FEIRA");
                disciplina.setNome("Cálculo I");
                disciplina.setHorario("21h às 22:40h");
                disciplina.setCodigo("SMA0801");
                disciplinaList.add(disciplina);
            } else if (i == 3) {
                Disciplina disciplina = new Disciplina();
                disciplina.setDiaSemana("QUINTA-FEIRA");
                disciplina.setNome("Análise Exploratória de Dados");
                disciplina.setHorario("19h às 20:40h");
                disciplina.setCodigo("SMA0803");
                disciplinaList.add(disciplina);

                disciplina = new Disciplina();
                disciplina.setDiaSemana("QUINTA-FEIRA");
                disciplina.setNome("Geometria Analítica");
                disciplina.setHorario("21h às 22:40h");
                disciplina.setCodigo("SMA0800");
                disciplinaList.add(disciplina);
            } else if (i == 4) {
                Disciplina disciplina = new Disciplina();
                disciplina.setDiaSemana("SEXTA-FEIRA");
                disciplina.setNome("Tópicos de Matemática");
                disciplina.setHorario("19h às 20:40h");
                disciplina.setCodigo("SMA0805");
                disciplinaList.add(disciplina);

                disciplina = new Disciplina();
                disciplina.setDiaSemana("SEXTA-FEIRA");
                disciplina.setNome("Cálculo I");
                disciplina.setHorario("21h às 22:40h");
                disciplina.setCodigo("SMA0801");
                disciplinaList.add(disciplina);
            }
        }
        return disciplinaList;
    }
}
