/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.funcionario.test;


import java.time.Year;


public abstract class Funcionario {
    
    protected String nome;
    protected DataContratacao dataContratacao;
    protected double beneficio;
    

     public Funcionario(String nome, int mesContratacao, int anoContratacao) {
        this.nome = nome;
        this.dataContratacao = new DataContratacao(mesContratacao, anoContratacao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public DataContratacao getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(DataContratacao dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public abstract double getBeneficio(int mes, int ano);
    
    public abstract boolean recebeBeneficio(int mes, int ano);
  
    public abstract double getSalario(int mes, int ano);
    
    
    public abstract void exibirInformacoesDoFuncionario(int mes, int ano);

}
