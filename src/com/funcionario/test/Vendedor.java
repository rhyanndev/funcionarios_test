/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.funcionario.test;

import java.time.Year;


public class Vendedor extends Funcionario {
    
    private static final double salarioBase = 12000.0;
    private static final double bonusPorAno = 1800.0;
    private double vendasPorMes;
    private int anoContratacaoSalario;
    private int mesContratacaoSalario;
    private double salario; // Variável para armazenar o salário calculado
            
     public Vendedor(String nome, int mesContratacao, int anoContratacao, double vendasPorMes) {
        super(nome, mesContratacao, anoContratacao);
        this.vendasPorMes = vendasPorMes;
        this.anoContratacaoSalario = anoContratacao;
        this.mesContratacaoSalario = mesContratacao;
        this.salario = getSalario(mesContratacao, anoContratacao); // Calcular o salário no momento da criação
    }

    // @Override
    //public double getSalario() {
      //  int anosDeServico = Year.now().getValue() - anoContratacaoSalario;
      //  return salarioBase + (anosDeServico * bonusPorAno);
    //}
    
     @Override
    public double getSalario(int mes, int ano) {
    int anosDeServico = ano - anoContratacaoSalario;
    double salario = salarioBase;
    
    // Verifica se o funcionário completou pelo menos 1 ano de serviço até o mês/ano especificado
    if (ano > anoContratacaoSalario || (ano == anoContratacaoSalario && mes > mesContratacaoSalario)) {
        anosDeServico--; // Desconta o ano de contratação se o funcionário não completou um ano inteiro
    }
    
    // Adiciona o bônus por ano ao salário se o funcionário completou pelo menos 1 ano de serviço
    if (anosDeServico > 0) {
        salario += (anosDeServico * bonusPorAno);
    }
    
    return salario;
    }
    
    @Override
    public double getBeneficio(){
        return vendasPorMes * 0.3;
    }

    @Override
    public void exibirInformacoesDoFuncionario() {
        System.out.println("Cargo: Vendedor");
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$" + salario);
        System.out.println("Benefício: R$" + getBeneficio());
    }

    
    
}
