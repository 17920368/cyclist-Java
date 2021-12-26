/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Victor Rodriguez
 */
public class Ciclista {
  String nom;
  String ArrayNom[]=new String [5];
  int ArrayT[][]=new int[5][5];
  int contar[]=new int [5];
  int t,t2,t3,t4,t5, cont , x;
  int suma1, suma2,suma3,suma4,suma5;

    public int getT2() {
        return t2;
    }

    public int getT3() {
        return t3;
    }

    public int getT4() {
        return t4;
    }

    public int getT5() {
        return t5;
    }

    public int getX() {
        return x;
    }

    public void setT2(int t2) {
        this.t2 = t2;
    }

    public void setT3(int t3) {
        this.t3 = t3;
    }

    public void setT4(int t4) {
        this.t4 = t4;
    }

    public void setT5(int t5) {
        this.t5 = t5;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public String[] getArrayNom() {
        return ArrayNom;
    }

    public int[][] getArrayT() {
        return ArrayT;
    }
  
  public Ciclista(){
      nom="";
      t=0;
  }
  int po=0;
  String datos="";
  public void llenar(){
    int y=0;
        this.ArrayNom[cont]=this.nom;
        cont++;
        this.ArrayT[this.x][y]=this.t;
        this.ArrayT[this.x][y+1]=this.t2;
        this.ArrayT[this.x][y+2]=this.t3;
        this.ArrayT[this.x][y+3]=this.t4;
        this.ArrayT[this.x][y+4]=this.t5;
        x++;
          
  }
  public boolean buscar(){
        for(int x=0; x<10; x++){
                 if(this.nom.equals(this.ArrayNom[x])){
                this.po = x; 
                return true;
                }
            } 
        return false;
    }
  public String mostrar(){
      String d="";
      int y=0;
      this.t=ArrayT[po][y];
      this.t2=ArrayT[po][y+1];
      this.t3=ArrayT[po][y+2];
      this.t4=ArrayT[po][y+3];
      this.t5=ArrayT[po][y+4]; 
      d+="NOMBRE : "+ArrayNom[po];
      for(int i=0;i<5;i++){
        if(ArrayT[po][i]==0){
        d+="\nNO DIO LA VUELTA";
        }
        else{
        d+="\n"+ArrayT[po][i];
        }
                
        }
     
     return d;
  }
  
  public void sumar(){
      
      String d="";
       for(int i=0;i<5;i++){
           int suma=0;
           for(int j=0;j<5;j++){
              suma=suma+ArrayT[i][j];   
           }
           contar[i]=suma;
         //d="NOMBRE: "+ArrayNom[po]+"="+contar[po];  
       }
  //     return d;
      
      
  }
  public String compararT(){
     String d="";
        int ng=0,ganador=1000;
        for(int i=0;i<5;i++){
         if(ganador > contar[i]){
               ganador=contar[i];    
               ng=i;
               
           }
          
       }
        d="\nNOMBRE DEL GANADOR ES: "+ArrayNom[po];
        return d;
      
   }
 
}
