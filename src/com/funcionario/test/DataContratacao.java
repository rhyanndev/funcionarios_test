/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.funcionario.test;


public class DataContratacao {
    
    private int mes;
    private int ano;


    public DataContratacao(int mes, int ano) {
        this.mes = mes;
        this.ano = ano;
    }
    
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    @Override
    public String toString() {
        return mes + "/" + ano;
    }
    
    

}
