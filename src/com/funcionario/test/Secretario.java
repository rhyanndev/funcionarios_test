/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.funcionario.test;

import java.time.Year;


public class Secretario extends Funcionario { 
    
    private static final double SALARIOBASE = 7000.0;
    private static final double BONUSPORANO = 1000.0;
 
    
     public Secretario(String nome, int mesContratacao, int anoContratacao) {
        super(nome, mesContratacao, anoContratacao);

    }
     
      @Override
    public double getSalario(int mes, int ano) {
        if (ano < dataContratacao.getAno() || (ano == dataContratacao.getAno() && mes < dataContratacao.getMes())) {
            throw new IllegalArgumentException("Data fornecida é anterior à data de contratação.");
        }

        int anosDeServico = ano - dataContratacao.getAno();
        
        double salario = SALARIOBASE;
        
        if (anosDeServico > 0) {
        salario += (anosDeServico * BONUSPORANO);
    }

        return salario;
    }
    
    @Override
    public boolean recebeBeneficio(int mes, int ano) {
        return true;
    }
    
    @Override
    public double getBeneficio(int mes, int ano){
        double porcentagem = 0.2;
        return getSalario(mes, ano) * porcentagem;
    }

    @Override
    public void exibirInformacoesDoFuncionario(int mes, int ano) {
        System.out.println("\nCargo: Secretário");
        System.out.println("Nome: " + nome);
        System.out.println("Data de Contratação: " + dataContratacao.getMes() + "/" + dataContratacao.getAno());
        System.out.println("Salário em " + mes + "/" + ano + ": R$ " + getSalario(mes, ano));
        System.out.println("Benefício em " + mes + "/" + ano + ": R$ " + getBeneficio(mes, ano));
    }

}
