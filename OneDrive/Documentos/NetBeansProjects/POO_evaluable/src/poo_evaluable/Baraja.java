/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_evaluable;

/**
 *
 * @author stive
 */
public class Baraja {
    
    
    private int con2=0 ;
    private int con1=0 ;
    private int aciertos=0;
    private Carta [] mazo ;  
    
    
    
  public Baraja() {
    
  this.mazo = new Carta[48];    
    
 }
    
 public  boolean IsMazoVacio(){
     
   boolean resulatdo= true; 
     
     for(int i = 0; i < this.getMazo().length; i++)
        {
           
          if(this.getMazo()[i] != null)
          {
          
              resulatdo =false; 
          }  
            
        }
     
     return resulatdo ; 
 }  
    
private boolean ExisteCarta(Carta carta){
    
    
     boolean resulatdo= false; 
     
     for(int i = 0; i < this.getMazo().length; i++)
        {
           
          if(this.getMazo()[i] == carta)
          {
          
              resulatdo =true; 
          }  
            
        }
     
     return resulatdo ; 
    
}
  

private boolean PosiciónOcupada( int posicion){
    
     
     boolean resulatdo= false; 
   
   if(  this.getMazo()[posicion] != null )
   {
       
    resulatdo = true; 
       
   }
      
     return resulatdo ; 
    
    
    
    
}


public  Carta[] MezclaCartas(){
  int aleatorio1 = (int) (Math.random() * (12 - 1)) + 1; 
  int aleatorio2 = (int) (Math.random() * (4 - 1)) + 1; 
  Carta.Valor [] valores = Carta.Valor.values();
  Carta.Palo [] Palos = Carta.Palo.values(); 
  
  
  
  
 for( int i= 0; i<this.getMazo().length ; i++)
 {
 
     this.mazo[i] = new Carta( valores [aleatorio1] , Palos[aleatorio2]);  
     
 }
    
   return this.getMazo();
    
}


public Carta MostraCartaIncre1 (){
    
   this.con1=0;
   
   if(this.con1>0){
      this.con1++;  
   }
   
   return this.mazo[this.con1];      
    
}

public Carta MostraCartaIncre2 (){
    
   this.con2 =1; 
   
   this.con2++; 
   
  return this.mazo[this.con2];
    
}



public int MayoroMenor(Carta carta){
    
    int num=0;
    
   
    
     switch(carta.getPalo()){
         
         case  Treboles :
              
            num= 1; 
              
           break;    
              
         case Picas:
             
           num=2;
           
         case Corazones:
             
           num=3;  
           
         case Diamastes:
             
           num=4;  
          break;   
              
     }   
 
    int num1=0; 
      
     switch(carta.getValor()){
         
         case  As :
              
            num1 = 1; 
              
           break;    
              
         case Dos:
             
           num1=2;
           
         case Tres:
             
           num1=3;  
           
         case Cuatro:
             
           num1=4;  
          break;   
          
         case  Cinco :
              
            num1= 5; 
              
           break;    
              
         case Seis:
             
           num1=6;
           
         case Siete:
             
           num1=7;  
           
         case Ocho:
             
           num1=8;  
          break;    
        case Nueve:
             
           num1=9;  
          break;   
          
         case  Sota :
              
            num1= 10; 
              
           break;    
              
         case Caballo:
             
           num1=11;
           
         case Rey:
             
           num1=12;  
           
         break;
          
          
              
     }   
     
     
    
    return num + num1;
}


public String CorrecroOincorrecto(String caracter){
    
   String resultado ="";  
    
   
   if(this.MostraCartaIncre1().getPalo()==this.MostraCartaIncre2().getPalo())
   {
       
    resultado = "incorrecto"; 
       
   }
   
   
   
   if(caracter.equals("+")){ 
       
      
       
    if(this.MayoroMenor(this.MostraCartaIncre2()) >  this.MayoroMenor(this.MostraCartaIncre1())){

           resultado  = "Tu predicion fue correcta"; 
           this.aciertos++; 

        }
        else
        {

           resultado =  "Tu predicion fue Incorrecta";  

        }

   }
    if(caracter.equals("-")) {
        
        
        
        if(this.MayoroMenor(this.MostraCartaIncre1()) >  this.MayoroMenor(this.MostraCartaIncre2())){

           resultado  = "Tu predicion fue correcta";  
           this.aciertos++; 
        }
        else
        {

           resultado =  "Tu predicion fue Incorrecta";  

        }

   }
    
    
    
    return resultado; 
}


 
    public double porcentaje_aciertos(){
   
    double porcentaje= (this.aciertos / 48 -1)*100;  
        
       return porcentaje;  
   }


    
    
    public void reset(){
        
        this.con1=0;
        this.con2=1; 
        
    }
    
    
    
    
    
    

    /**
     * @return the mazo
     */
    public Carta[] getMazo() {
        return mazo;
    }

    /**
     * @return the aciertos
     */
    public int getAciertos() {
        return aciertos;
    }




    
}
