/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_evaluable;

import java.util.Scanner;

/**
 *
 * @author stive
 */
public class POO_evaluable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    Scanner sc =new Scanner(System.in);     
     
    boolean verdad = true; 
     int contador=0;   
     Baraja p = new Baraja();    
        
     System.out.println(p.getMazo()[1]);
         
        
     System.out.println("COMIENZA EL JUEGO......");
     System.out.println("La primera carta es el "  +  p.MostraCartaIncre1());
     

     while(verdad==true){
     
     
         
     System.out.println("Crees que la  siguiente carta es mayor <+> o menor <-> ?");
     String acierto = sc.nextLine();
     System.out.println("la siguiente  carta es " + p.MostraCartaIncre1());
     
     System.out.println(p.CorrecroOincorrecto(acierto));
     

        if(contador == 48){

           System.out.println("El juego ha finalizado");
           System.out.println("Has realizado " + p.getAciertos() + "predicciones corecctas" ); 
           System.out.println("Porcentaje de aciertos:" + p.porcentaje_aciertos());
         
          
           System.out.println("¿Desea jugar otra vez ?  (s/n)");
           String continuar = sc.nextLine(); 
           
           boolean verdad2 = true;       
                  while(verdad2==true)
                  {    
                      
                     if(continuar.equals("n") || continuar.equals("s") ){ 
                                if(continuar.equals("n"))
                                {
                                verdad =false;
                                verdad2=false; 
                                }
                                else if(continuar.contentEquals("s"))
                                {

                                contador=0;        
                                p.reset();
                                verdad2=false;
                                }
                                else
                                {

                            System.out.println("¿Desea jugar otra vez ?  (s/n)");
                            continuar = sc.nextLine();   
                                } 
                     }                   
                     
                   }
                
        }
     
     contador++; 
     
     
     }
     
  boolean etapas=true;  
     
    int etapa=1;  
    int noches; 
    
    Etapa pp = new Etapa();  
     
    System.out.print("¿Cuantas etapas tienes pensado disfrutar?");
    int numero = sc.nextInt(); 
    pp.arrayEtapa(numero); 
    
  while(verdad==true)
  {
  
    System.out.println("introduce el nombre de la etapa "  + etapa)
            ; 
      
      
  }  
  
     
     
     
     
     
     
     
     
     
     
     
     
     
     
    }
    
}
