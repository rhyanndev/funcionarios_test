/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.funcionario.test;

import java.time.Year;
import java.util.List;


public class Vendedor extends Funcionario {
    
    private static final double SALARIOBASE = 12000.0;
    private static final double BONUSPORANO = 1800.0;
    private List<Venda> vendasNoMes;
            
     public Vendedor(String nome, int mesContratacao, int anoContratacao, List<Venda> vendasNoMes) {
        super(nome, mesContratacao, anoContratacao);
        this.vendasNoMes = vendasNoMes;
     
    }
     
     public int getTotalVendasNoMes(int mes, int ano) {
    int totalVendas = 0;
    for (Venda venda : vendasNoMes) {
        if (venda.getMes() == mes && venda.getAno() == ano) {
            totalVendas+= venda.getValorVendido();

        }
    }
    return totalVendas;
}
     
    @Override
    public double getSalario(int mes, int ano) {
        if (ano < dataContratacao.getAno() || (ano == dataContratacao.getAno() && mes < dataContratacao.getMes())) {
            throw new IllegalArgumentException("Data fornecida é anterior à data de contratação!");
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
        for (Venda venda : vendasNoMes) {
        if (venda.getMes() == mes && venda.getAno() == ano) {
            return true; 
        }
    }
    return false; // Se não houver vendas no mês e ano, o vendedor não recebe benefícios
    }
    
    
    public double getBeneficio(int mes, int ano) {
        for (Venda venda : vendasNoMes) {
            if (venda.getMes() == mes && venda.getAno() == ano) {
                return venda.getValorVendido() * 0.3;
            }
        }
        return 0.0;
    }

    @Override
    public void exibirInformacoesDoFuncionario(int mes, int ano) {
        System.out.println("\nCargo: Vendedor");
        System.out.println("Nome: " + nome);
        System.out.println("Data de Contratação: " + dataContratacao.getMes() + "/" + dataContratacao.getAno());
        System.out.println("Salário em " + mes + "/" + ano + ": R$ " + getSalario(mes, ano));
        System.out.println("Benefício em " + mes + "/" + ano + ": R$ " + getBeneficio(mes, ano));
    }


    
    
}
