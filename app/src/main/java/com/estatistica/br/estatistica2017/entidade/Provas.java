package com.estatistica.br.estatistica2017.entidade;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by jeferson.carlos on 23/03/2017.
 */

public class Provas implements Parcelable {
    private String CodigoDisciplina;
    private String NomeDisciplina;
    private String NomeProfessor;
    private String ProvaMaisProxima;

    public Provas(String text1, String text2, String text3, String text4){
        CodigoDisciplina = text1;
        NomeDisciplina = text2;
        NomeProfessor = text3;
        ProvaMaisProxima = text4;
    }

    public String getProvaMaisProxima() {
        return ProvaMaisProxima;
    }

    public void setProvaMaisProxima(String provaMaisProxima) {
        ProvaMaisProxima = provaMaisProxima;
    }

    public String getNomeProfessor() {
        return NomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        NomeProfessor = nomeProfessor;
    }

    public String getCodigoDisciplina() {
        return CodigoDisciplina;
    }

    public void setCodigoDisciplina(String codigoDisciplina) {
        CodigoDisciplina = codigoDisciplina;
    }

    public String getNomeDisciplina() {
        return NomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        NomeDisciplina = nomeDisciplina;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.CodigoDisciplina);
        dest.writeString(this.NomeDisciplina);
        dest.writeString(this.NomeProfessor);
        dest.writeString(this.ProvaMaisProxima);
    }

    protected Provas(Parcel in) {
        this.CodigoDisciplina = in.readString();
        this.NomeDisciplina = in.readString();
        this.NomeProfessor = in.readString();
        this.ProvaMaisProxima = in.readString();
    }

    public static final Creator<Provas> CREATOR = new Creator<Provas>() {
        @Override
        public Provas createFromParcel(Parcel source) {
            return new Provas(source);
        }

        @Override
        public Provas[] newArray(int size) {
            return new Provas[size];
        }
    };
}
