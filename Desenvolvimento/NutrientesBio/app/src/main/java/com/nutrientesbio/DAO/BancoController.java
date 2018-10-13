package com.nutrientesbio.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.nutrientesbio.Model.Nutriente;

import java.util.ArrayList;

/**
 * Created by Luciano on 04/09/2016.
 */
public class BancoController {
    private SQLiteDatabase db;
    private CriaBanco banco;

    public BancoController(Context context) {
        banco = new CriaBanco(context);
    }

    public String insereDado(String nome, String descricao) {
        ContentValues valores;
        long resultado;

        db = banco.getWritableDatabase();
        valores = new ContentValues();
        valores.put(CriaBanco.NOME, nome);
        valores.put(CriaBanco.DESCRICAO, descricao);

        resultado = db.insert(CriaBanco.TABELA, null, valores);
        db.close();

        if (resultado == -1)
            return "Erro ao inserir registro";
        else {
            return "Registro Inserido com sucesso";
        }

    }

    public Cursor carregaDados() {
        Cursor cursor;
        String[] campos = {banco.ID, banco.NOME};
        db = banco.getReadableDatabase();
        cursor = db.query(banco.TABELA, campos, null, null, null, null, null, null);

        if (cursor != null) {
            cursor.moveToFirst();
        }

        db.close();
        return cursor;
    }

    public ArrayList<Nutriente> consultarNutrientes() {
        ArrayList<Nutriente> nutrientes = new ArrayList<>();
        try {
            Cursor c;
            String[] campos = {banco.NOME, banco.DESCRICAO};
            db = banco.getReadableDatabase();
            c = db.query(banco.TABELA, campos, null, null, null, null, "nome", null);

            c.moveToFirst();
            while (!c.isAfterLast()) {
                Nutriente map = new Nutriente();
                map.setNome(c.getString(c.getColumnIndex("nome")));
                map.setDescricao(c.getString(c.getColumnIndex("descricao")));

                nutrientes.add(map);
                c.moveToNext();
            }
            c.close();

        } catch (
                Exception e
                )

        {
            Log.d("Main", e.getMessage());
        }

        db.close();
        return nutrientes;
    }
}
