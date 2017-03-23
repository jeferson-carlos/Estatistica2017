package com.estatistica.br.estatistica2017.entidade;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by jeferson.carlos on 22/03/2017.
 */

public class Disciplina implements Parcelable {

    private String mHorario;
    private String mNome;
    private String mCodigo;
    private String mDiaSemana;

    public String getHorario() {
        return mHorario;
    }

    public void setHorario(String mHorario) {
        this.mHorario = mHorario;
    }

    public String getNome() {
        return mNome;
    }

    public void setNome(String mNome) {
        this.mNome = mNome;
    }

    public String getCodigo() {
        return mCodigo;
    }

    public void setCodigo(String mCodigo) {
        this.mCodigo = mCodigo;
    }

    public String getDiaSemana() {
        return mDiaSemana;
    }

    public void setDiaSemana(String mDiaSemana) {
        this.mDiaSemana = mDiaSemana;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.mHorario);
        dest.writeString(this.mNome);
        dest.writeString(this.mCodigo);
        dest.writeString(this.mDiaSemana);
    }

    public Disciplina() {
    }

    protected Disciplina(Parcel in) {
        this.mHorario = in.readString();
        this.mNome = in.readString();
        this.mCodigo = in.readString();
        this.mDiaSemana = in.readString();
    }

    public static final Creator<Disciplina> CREATOR = new Creator<Disciplina>() {
        @Override
        public Disciplina createFromParcel(Parcel source) {
            return new Disciplina(source);
        }

        @Override
        public Disciplina[] newArray(int size) {
            return new Disciplina[size];
        }
    };
}
