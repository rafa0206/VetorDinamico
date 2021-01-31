/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.usjt_ccp1an_pla_colecoes_arraylist;

/**
 *
 * @author JFernandes
 */
import java.util.Random;

public class TesteVetorDinamico {
    
    public static void main(String[] args) throws Exception {
        VetorDinamico v = new VetorDinamico();
        Random gerador = new Random();
        while (true){
            double probabilidade = gerador.nextDouble();
            if (probabilidade <= 0.8){
                int e = gerador.nextInt(6) + 1;
                v.adicionar(e);
            }
            else
                v.remover();
                
            
            v.exibir();
            Thread.sleep(2000);
            System.out.println ("============================================");
        }
    }
    
}
