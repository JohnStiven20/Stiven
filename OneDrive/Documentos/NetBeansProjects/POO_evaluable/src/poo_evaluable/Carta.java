/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_evaluable;

/**
 *
 * @author stive
 */
public class Carta {
    
  public enum Valor {As(1) , Dos(2) , Tres(3) , Cuatro(4) , Cinco(5)  , Seis(6) ,Siete(7) , Ocho(8) , Nueve(9) , Sota(10) , Caballo(11) , Rey(12);
     
    private final int numero1 ;
    Valor(int numero1){
    
     this.numero1 = numero1;    
    }  
     
    
   public int RetornaNum(){
     
       return numero1 ; 
   } 
  
  };  
  public enum Palo {Treboles(1) , Picas(2) , Corazones(3) , Diamastes(4);
  
  private final int numero; 
  
  Palo(int numero){
      
   this.numero = numero;   
  }
  
  
  public int returNum(){
      
    return numero;   
  }
  
  
  
  };
   
  private Valor  valor ; 
  private Palo palo; 
  
   public Carta (){}
    
   
    public Carta (Valor valor , Palo palo){ 
      this.valor  = valor; 
      this.palo = palo; 
    } 


    
   
    
    
    
    
    
    
    
    public Valor getValor() {
        return valor;
    }



    public Palo getPalo() {
        return palo;
    }

    
    
    
    
    
    
    
}
