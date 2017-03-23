package com.estatistica.br.estatistica2017;

import android.content.Context;
import android.view.LayoutInflater;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.estatistica.br.estatistica2017.entidade.Disciplina;

import java.util.List;
import java.util.Objects;

/**
 * Created by jeferson.carlos on 22/03/2017.
 */

public class ListAdapterDisciplina extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final Context mContext;
    private final List<Disciplina> mList;

    public ListAdapterDisciplina(Context context, List<Disciplina> list) {
        mContext = context;
        mList = list;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_itens_recyclerview, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        ViewHolder holder = (ViewHolder) viewHolder;
        Disciplina disciplina = mList.get(position);
        holder.txtCodigoDisciplina.setText(disciplina.getCodigo());
        holder.txtHorario.setText(disciplina.getHorario());
        holder.txtNomeDisciplina.setText(disciplina.getNome());
        holder.txtDiasemana.setText(disciplina.getDiaSemana());
    }

    @Override
    public int getItemCount() {
        return mList != null ? mList.size() : 0;
    }

    public Context getContext() {
        return mContext;
    }

    private class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView txtHorario;
        private final TextView txtCodigoDisciplina;
        private final TextView txtNomeDisciplina;
        private final TextView txtDiasemana;

        public ViewHolder(View itemView) {
            super(itemView);
            txtHorario = (TextView) itemView.findViewById(R.id.txtHorario);
            txtCodigoDisciplina = (TextView) itemView.findViewById(R.id.txtCodigoDisciplina);
            txtNomeDisciplina = (TextView) itemView.findViewById(R.id.txtNomeDisciplina);
            txtDiasemana = (TextView) itemView.findViewById(R.id.txtDiaSemana);
        }
    }
}
