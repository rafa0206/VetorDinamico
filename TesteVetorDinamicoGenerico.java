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

//int = Integer
//double = Double
//float = Float
public class TesteVetorDinamicoGenerico {
    
    
    public static void main(String[] args) {
        VetorDinamicoGenerico <String> minhasStrings =
                        new VetorDinamicoGenerico<>();
        
        VetorDinamicoGenerico <Integer> inteiros = 
                new VetorDinamicoGenerico<>();
        
        VetorDinamicoGenerico <Musica> musicas = 
                new VetorDinamicoGenerico<>();
        
        Musica m = new Musica();
        musicas.adicionar (m); 
        
        musicas.adicionar (new Musica());
        
        inteiros.adicionar (1);
        
        minhasStrings.adicionar ("oi");
        
    }            
}
