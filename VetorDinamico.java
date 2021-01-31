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
public class VetorDinamico {
    
    private int [] elementos;
    private int quantidade;
    private int capacidade;
    
    public VetorDinamico (){
        quantidade = 0;
        capacidade = 4;
        elementos = new int [capacidade];
    }
    
    public boolean estaCheio (){
        if (capacidade == quantidade)
            return true;
        else
            return false;
    }
    public boolean estaVazio (){
        //return quantidade == 0 ? true : false;
        return quantidade == 0;
    }
    
    public void remover (){
        if (!estaVazio()){            
            quantidade--;
            if (capacidade > 4 && quantidade <= capacidade / 4){
                reduzirCapacidade();
            }            
        }                       
    }
    
    
    
    public void adicionar (int e){
        if (estaCheio())
            aumentarCapacidade();      
        elementos[quantidade] = e;
        quantidade++;
        
    }
    
    private void aumentarCapacidade(){
        int [] aux = new int[capacidade * 2];
        for (int i = 0; i < quantidade; i++){
            aux[i] = elementos[i];
        }
        elementos = aux;
        capacidade *= 2;     
        
    }
    
    private void reduzirCapacidade(){
        int [] aux = new int [capacidade  / 2];
        for (int i = 0; i < quantidade; i++){
            aux[i] = elementos[i];
        }
        elementos = aux;
        capacidade /= 2;
    }
    
    public void exibir (){
        System.out.printf ("Qtde: %d, Cap: %d\n", quantidade, capacidade);
        /*for (int e : elementos){
            System.out.print (e + " ");
        }*/
        for (int i = 0; i < quantidade; i++){
            System.out.print (elementos[i] + " ");
        }
        System.out.println();
    }
    
    
    public int soma (){
        int resultado = 0;
        for (int i = 0; i < quantidade; i++){
            resultado += elementos[i];
        }
        return resultado;
    }
    
}
