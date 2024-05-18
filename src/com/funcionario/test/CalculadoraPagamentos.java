/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.funcionario.test;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class CalculadoraPagamentos {
    
    public static double calcularTotalSalarioeBeneficio(List<Funcionario> funcionarios, int mes, int ano) {
        double totalPago = 0.0;
        
        for (Funcionario funcionario : funcionarios) {
            //Verifica se o funcionário está na empresa há pelo menos um mês/ano
            if (funcionario.getDataContratacao().getAno() < ano || 
                (funcionario.getDataContratacao().getAno() == ano && funcionario.getDataContratacao().getMes() <= mes)) {
                //Se sim, adiciona o salário e o benefício do funcionário ao total pago
                totalPago += funcionario.getSalario(mes, ano) + funcionario.getBeneficio(mes, ano);
            }
        }
        
        return totalPago;
    }
    
    
    public static double calcularTotalSalario(List<Funcionario> funcionarios, int mes, int ano) {
    double totalSalarios = 0.0;
    
    
    for (Funcionario funcionario : funcionarios) {
        if (funcionario.getDataContratacao().getAno() < ano || 
            (funcionario.getDataContratacao().getAno() == ano && funcionario.getDataContratacao().getMes() <= mes)) {
            //Adiciona apenas o salário do funcionário ao total de salários
            totalSalarios += funcionario.getSalario(mes, ano);
        }
    }
    
    return totalSalarios;
}
    
    
    
    public static double calcularTotalBeneficios(List<Funcionario> funcionarios, int mes, int ano) {
        double totalBeneficios = 0.0;

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getDataContratacao().getAno() < ano ||
                    (funcionario.getDataContratacao().getAno() == ano && funcionario.getDataContratacao().getMes() <= mes)) {
                // Verifica se o funcionário recebe benefícios
                if (funcionario.recebeBeneficio(mes, ano)) {
                    totalBeneficios += funcionario.getBeneficio(mes, ano);
                }
            }
        }

        return totalBeneficios;
    }
    
    
     public static Funcionario funcionarioComMaiorPagamento(List<Funcionario> funcionarios, int mes, int ano) {
        double maiorPagamento = Double.MIN_VALUE;
        Funcionario funcionarioComMaiorPagamento = null;

        for (Funcionario funcionario : funcionarios) {
            double pagamentoTotal = funcionario.getSalario(mes, ano) + funcionario.getBeneficio(mes, ano);
            if (pagamentoTotal > maiorPagamento) {
                maiorPagamento = pagamentoTotal;
                funcionarioComMaiorPagamento = funcionario;
            }
        }

        return funcionarioComMaiorPagamento;
    }
    

      public static String funcionarioComMaiorBeneficio(List<Funcionario> funcionarios, int mes, int ano) {
        double maiorBeneficio = Double.MIN_VALUE;
        String nomeFuncionarioMaiorBeneficio = "";

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.recebeBeneficio(mes, ano)) {
                double beneficio = funcionario.getBeneficio(mes, ano);
                if (beneficio > maiorBeneficio) {
                    maiorBeneficio = beneficio;
                    nomeFuncionarioMaiorBeneficio = funcionario.getNome();
                }
            }
        }

        return nomeFuncionarioMaiorBeneficio;
    }
      
      
      public static Vendedor vendedorComMaisVendas(List<Vendedor> vendedores, int mes, int ano) {
        Vendedor vendedorComMaisVendas = null;
        double maxValorVendido = 0;

     
    for (Vendedor vendedor : vendedores) {
        double valorTotalVendido = vendedor.getTotalVendasNoMes(mes, ano);

        // Verificar se o valor total vendido por este vendedor é maior que o máximo atual
        if (valorTotalVendido > maxValorVendido) {
            maxValorVendido = valorTotalVendido;
            vendedorComMaisVendas = vendedor;
        }
    }

    return vendedorComMaisVendas;
     
    }
      
}
