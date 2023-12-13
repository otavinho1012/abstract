/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cumepassa.classesmetodosabstratos.Classes;

/**
 *
 * @author otavio.almeida
 */
public abstract class Contribuentes {
    protected String nome;
    protected Double renda;
    
    
    public Contribuentes(){
    }
    
    public Contribuentes(String nome, Double renda){
        this.nome = nome;
        this.renda = renda;
    }

    //criando um método abstract
    public abstract Double calcImposto();
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRenda() {
        return renda;
    }

    public void setRenda(Double renda) {
        this.renda = renda;
    }
    
    
}
