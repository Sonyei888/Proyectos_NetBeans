 
package punto_B;

import javax.swing.JOptionPane;


public class calculadora {

    
    public static void main(String[] args) {
        double a, b, d;
        int c;
        a=Double.parseDouble(JOptionPane.showInputDialog("escriba el primer numero"));
        b=Double.parseDouble(JOptionPane.showInputDialog("escriba el segundo numero"));
        c=Integer.parseInt(JOptionPane.showInputDialog("valor numero 1: "+a+"\n valor numero 2: "+b+"\n 1. Sumar \n 2. Restar \n 3. Multiplicar \n 4. Dividir \n 0. Salir"));
        
        switch (c){
            case 1:
                d=(a+b);
                JOptionPane.showMessageDialog(null, "valor numero 1: "+a+"\n valor numero 2: "+b+"\n Operacion: SUMAR"+"\n resultado: "+"\n"+d);
                break;
                case 2:
                d=(a-b);
                JOptionPane.showMessageDialog(null, "valor numero 1: "+a+"\n valor numero 2: "+b+"\n Operacion: RESTAR"+"\n resultado: "+"\n"+d);
                break;
                case 3:
                d=(a*b);
                JOptionPane.showMessageDialog(null, "valor numero 1: "+a+"\n valor numero 2: "+b+"\n Operacion: MULTIPLICAR"+"\n resultado: "+"\n"+d);
                break;
                case 4:
                d=(a/b);
                JOptionPane.showMessageDialog(null, "valor numero 1: "+a+"\n valor numero 2: "+b+"\n Operacion: DIVIDIR"+"\n resultado: "+"\n"+d);
                break;
                case 0:
                JOptionPane.showMessageDialog(null, "Usted ha salido del programa");
                break;
                default:
                    JOptionPane.showMessageDialog(null,"Se ha introducido una operacion incorrecta" );
        }
        
    }
    
}
