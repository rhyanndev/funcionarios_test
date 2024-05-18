/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.funcionario.test;

import java.time.Year;


public class Secretario extends Funcionario {
    
    private static final double salarioBase = 7000.0;
    private static final double bonusPorAno = 1000.0;
    private int anoContratacaoSalario;
    
     public Secretario(String nome, int mesContratacao, int anoContratacao) {
        super(nome, mesContratacao, anoContratacao);
        this.anoContratacaoSalario = anoContratacao;
    }
     

     @Override
    public double getSalario() {
        int anosDeServico = Year.now().getValue() - anoContratacaoSalario;
        return salarioBase + (anosDeServico * bonusPorAno);
    }
    
    @Override
    public double getBeneficio(){
        double porcentagem = 0.2;
        return getSalario() * porcentagem;
    }

    @Override
    public void exibirInformacoesDoFuncionario() {
        System.out.println("Cargo: Secretário");
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$" + getSalario());
        System.out.println("Benefício: R$" + getBeneficio());
    }

}
