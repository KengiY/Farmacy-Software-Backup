/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.farmacysoftware.G_Scorte;

/**
 *
 * @author 39329
 */
public class Farmaco {
    
    private String nome;
    private String tipo; //0 da banco - 1 non da banco
    private String quantita;

    public Farmaco(String nome, String tipo, String quantita) {
        this.nome = nome;
        this.tipo = tipo;
        this.quantita= quantita;
    }

    
    
    public String getNome() {return nome;}

    public String getTipo() {return tipo;}
    
    public String getQuantita(){return quantita;}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setQuantita(String quantita) {
        this.quantita = quantita;
    }
    
    
}
