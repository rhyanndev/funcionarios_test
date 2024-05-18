/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.funcionario.test;

import java.util.ArrayList;
import java.util.List;
import com.funcionario.test.CalculadoraPagamentos;
/**
 *
 * @author rhyan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Definindo os valores do mês e do ano
        int mes = 12;
        int ano = 2021;
        
        //Lista de vendas para Ana Silva
        List<Venda> vendasAna = new ArrayList<>();
        
        Vendedor v1 = new Vendedor("Ana Silva", 12, 2021, vendasAna);
        
        // Cria vendas e associa ao vendedor
        vendasAna.add(new Venda(v1, 5200.0, 12, 2021));
        vendasAna.add(new Venda(v1, 4000.0, 1, 2022));
        vendasAna.add(new Venda(v1, 4200.0, 2, 2022));
        vendasAna.add(new Venda(v1, 5850.0, 3, 2022));
        vendasAna.add(new Venda(v1, 7000.0, 4, 2022));
              
        System.out.println("Informações de Ana Silva em dezembro de 2021:");
        v1.exibirInformacoesDoFuncionario(mes, ano);
        
        for (Venda venda : vendasAna) {
            venda.exibirInformacoesDaVenda();
        }

        //System.out.println("\nInformações de Ana Silva em fevereiro de 2022:");
        //v1.exibirInformacoesDoFuncionario(2, 2022);
                
        //Lista de vendas para o João Mendes
        List<Venda> vendasJoao = new ArrayList<>();
       
        Vendedor v2 = new Vendedor("João Mendes", 12, 2021, vendasJoao);
        
        vendasJoao.add(new Venda(v2, 3400.0, 12, 2021));
        vendasJoao.add(new Venda(v2, 7700.0, 1, 2022));
        vendasJoao.add(new Venda(v2, 5000.0, 2, 2022));
        vendasJoao.add(new Venda(v2, 5900.0, 3, 2022));
        vendasJoao.add(new Venda(v2, 6500.0, 4, 2022));
        
         System.out.println("\nInformações de João Mendes em dezembro de 2021:");
        v2.exibirInformacoesDoFuncionario(mes, ano);
        
        for (Venda venda : vendasJoao) {
            venda.exibirInformacoesDaVenda();
        }
        
        System.out.println("\nInformações de Jorge Carvalho");
        Secretario s1 = new Secretario("Jorge Carvalho", 01, 2018);
        s1.exibirInformacoesDoFuncionario(mes, ano);
        
        System.out.println("\nInformações de Maria Souza");
        Secretario s2 = new Secretario("Maria Souza", 12, 2015);
        s2.exibirInformacoesDoFuncionario(mes, ano);
        
        System.out.println("\nInformações de Juliana Alves");
        Gerente g1 = new Gerente("Juliana Alves", 01, 2017);
        g1.exibirInformacoesDoFuncionario(mes, ano);
        
        System.out.println("\nInformações de Bento Albino");
        Gerente g2 = new Gerente("Bento Albino", 03, 2014);
        g2.exibirInformacoesDoFuncionario(mes, ano);
        
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(v1);
        funcionarios.add(v2);
        funcionarios.add(s1);
        funcionarios.add(s2);
        funcionarios.add(g1);
        funcionarios.add(g2);   
        
        double totalSalarioeBeneficio = CalculadoraPagamentos.calcularTotalSalarioeBeneficio(funcionarios, mes, ano);
        System.out.println("\nTotal pago de salário e benefícios aos funcionários em dezembro de 2021: R$" + totalSalarioeBeneficio);
        
        double totalSalario = CalculadoraPagamentos.calcularTotalSalario(funcionarios, mes, ano);
        System.out.println("\nTotal pago de salário aos funcionários em dezembro de 2021: R$" + totalSalario);
        
        double totalBeneficios = CalculadoraPagamentos.calcularTotalBeneficios(funcionarios, mes, ano);
        System.out.println("\nTotal pago em benefícios em dezembro de 2021: R$" + totalBeneficios);
        
        Funcionario funcionarioComMaiorPagamento = CalculadoraPagamentos.funcionarioComMaiorPagamento(funcionarios, mes, ano);
        System.out.println("\nFuncionário com maior pagamento em dezembro de 2021: " + funcionarioComMaiorPagamento.getNome());
        
        String nomeFuncionarioMaiorBeneficio = CalculadoraPagamentos.funcionarioComMaiorBeneficio(funcionarios, mes, ano);
        System.out.println("\nFuncionário com maior benefício em dezembro de 2021: " + nomeFuncionarioMaiorBeneficio);
        
        Vendedor vendedorMaisVendas = CalculadoraPagamentos.vendedorComMaisVendas(List.of(v1, v2), mes, ano);
        System.out.println("\nVendedor com mais vendas: " + (vendedorMaisVendas != null ? vendedorMaisVendas.getNome() : "Nenhum"));
        

    }
    

    

 
    
}
