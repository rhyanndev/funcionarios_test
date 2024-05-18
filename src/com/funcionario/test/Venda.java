/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.funcionario.test;


public class Venda {
    
    private Vendedor vendedor;
    private double valorVendido;
    private int mes;
    private int ano;

    
    public Venda(Vendedor vendedor, double valorVendido, int mes, int ano) {
        this.vendedor = vendedor;
        this.valorVendido = valorVendido;
        this.mes = mes;
        this.ano = ano;
    }
    
    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public double getValorVendido() {
        return valorVendido;
    }

    public void setValorVendido(double valorVendido) {
        this.valorVendido = valorVendido;
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
    
    public void exibirInformacoesDaVenda(){
        System.out.println("Cargo: Vendedor");
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Valor vendido no mês " + getMes() + " no ano " + getAno());
        System.out.println("Valor da venda: R$" + getValorVendido());
    }
   
    
    
}
