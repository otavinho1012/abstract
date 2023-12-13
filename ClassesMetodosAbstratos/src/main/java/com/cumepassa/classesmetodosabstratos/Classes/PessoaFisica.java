/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cumepassa.classesmetodosabstratos.Classes;

/**
 *
 * @author otavio.almeida
 */
public final class PessoaFisica extends Contribuentes {
    private Double gastosSaude;

    public PessoaFisica(){
    }
    
    // aqui como funciona a classificação de atributos? como isso é salvo? como isso é salvo no banco de Dados?
    public PessoaFisica(String nome, Double renda,Double gastosSaude){
        super(nome,renda);
        this.gastosSaude = gastosSaude;
    }
    
    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }
   
    @Override
    public Double calcImposto() 
         /* fiz algo extremamente grande pra nada!!! sendo que o imposto apenas
            pagaria os 50% dos gastoes e não que os 15% 
            do valor do imposto que abateria os gastos!!
            melhorar essa questão de lógica!! e prestar mais atenção no enunciado
            
            */
          
        if (getRenda() < 20000.00) {
            Double impostoGasto = 0.0;
            Double imposto = (renda * 15.0) / 100;

            if (getGastosSaude() > 0) {
                impostoGasto = (gastosSaude * 50.0) / 100 - imposto;
            }
            // aqui ele me obriga a inicializar o impostoGasto, por que imagina se ele não vai no if¹
            Double conta = (renda - imposto) + (gastosSaude - impostoGasto);
            return conta;
        } else {
            Double impostoGasto = 0.0;
            Double imposto = (renda * 25.0) / 100;

            if (getGastosSaude() > 0) {
                impostoGasto = (gastosSaude * 50.0) / 100 - imposto;
            }
            // aqui ele me obriga a inicializar o impostoGasto, por que imagina se ele não vai no if¹
            Double conta = (renda - imposto) + (gastosSaude - impostoGasto);
            return conta;
        }
    }
}
