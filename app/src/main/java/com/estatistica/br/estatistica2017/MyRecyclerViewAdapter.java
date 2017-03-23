package com.estatistica.br.estatistica2017;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.estatistica.br.estatistica2017.entidade.Provas;

import java.util.ArrayList;

/**
 * Created by jeferson.carlos on 23/03/2017.
 */

public class MyRecyclerViewAdapter extends RecyclerView
        .Adapter<MyRecyclerViewAdapter
        .DataObjectHolder> {
    private static String LOG_TAG = "MyRecyclerViewAdapter";
    private ArrayList<Provas> mDataset;
    private static MyClickListener myClickListener;

    public static class DataObjectHolder extends RecyclerView.ViewHolder
            implements View
            .OnClickListener {
        TextView CodigoDisciplina;
        TextView NomeDisciplina;
        TextView NomeProfessor;
        TextView ProvaMaisProxima;

        public DataObjectHolder(View itemView) {
            super(itemView);
            CodigoDisciplina = (TextView) itemView.findViewById(R.id.CodigoDisciplina);
            NomeDisciplina = (TextView) itemView.findViewById(R.id.NomeDisciplina);
            NomeProfessor = (TextView)itemView.findViewById(R.id.NomeProfessor);
            ProvaMaisProxima = (TextView)itemView.findViewById(R.id.ProvaMaisProxima);
            Log.i(LOG_TAG, "Adding Listener");
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            myClickListener.onItemClick(getAdapterPosition(), v);
        }
    }

    public void setOnItemClickListener(MyClickListener myClickListener) {
        this.myClickListener = myClickListener;
    }

    public MyRecyclerViewAdapter(ArrayList<Provas> myDataset) {
        mDataset = myDataset;
    }

    @Override
    public DataObjectHolder onCreateViewHolder(ViewGroup parent,
                                               int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_cardview, parent, false);

        DataObjectHolder dataObjectHolder = new DataObjectHolder(view);
        return dataObjectHolder;
    }

    @Override
    public void onBindViewHolder(DataObjectHolder holder, int position) {
        holder.CodigoDisciplina.setText(mDataset.get(position).getCodigoDisciplina());
        holder.NomeDisciplina.setText(mDataset.get(position).getNomeDisciplina());
        holder.NomeProfessor.setText(mDataset.get(position).getNomeProfessor());
        holder.ProvaMaisProxima.setText(mDataset.get(position).getProvaMaisProxima());
    }

    public void addItem(Provas dataObj, int index) {
        mDataset.add(index, dataObj);
        notifyItemInserted(index);
    }

    public void deleteItem(int index) {
        mDataset.remove(index);
        notifyItemRemoved(index);
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public interface MyClickListener {
        public void onItemClick(int position, View v);
    }
}
