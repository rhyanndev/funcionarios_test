/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.funcionario.test;

import java.time.Year;


public class Gerente extends Funcionario {
    
    private static final double salarioBase = 20000.0;
    private static final double bonusPorAno = 3000.0;
    private int anoContratacaoSalario;
    
     public Gerente(String nome, int mesContratacao, int anoContratacao) {
        super(nome, mesContratacao, anoContratacao);
        this.anoContratacaoSalario = anoContratacao;
    }

     @Override
    public double getSalario() {
        int anosDeServico = Year.now().getValue() - anoContratacaoSalario;
        return salarioBase + (anosDeServico * bonusPorAno);
    }
    
    @Override
    public double getBeneficio() {
        // Gerente não recebe benefício, então retorna zero
        return 0.0;
    }

    @Override
    public void exibirInformacoesDoFuncionario() {
        System.out.println("Cargo: Secretário");
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$" + getSalario());
    }


}
