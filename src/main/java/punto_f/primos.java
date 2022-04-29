
package punto_f;

import javax.swing.JOptionPane;


public class primos {

    
    public static void main(String[] args) {
        int a,b,c;
       boolean nprimo;
       c=0;
      b=Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero"));
      
       for(int i=1;i<=b;i++){
           
      nprimo=true;  
     a=2;
      while (a<=i-1 && nprimo==true)
     {
      if (i%a==0)
     nprimo=false;
     a++;
     }
     if (nprimo==true){
     c++; 
     }
     }
     JOptionPane.showMessageDialog(null, "Entre 1 y "+ b +" hay "+c+ " numeros primos");
}
} 
    
    

