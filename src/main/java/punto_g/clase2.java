
package punto_g;


public class clase2 {
    public double numero1;
    public double numero2;

    public clase2(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() { 
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    public double suma(){
    double suma=this.numero1+this.numero2;
    return suma;
 }
    public double resta(){
    double operacion=this.numero1-this.numero2;
    return operacion;
 }
    public double multiplicacion(){
    double operacion=this.numero1*this.numero2;
    return operacion;
 } 
   public double division(){
   double operacion=this.numero1/this.numero2;
   return operacion;
 }
 
   public double potencia(){
   double operacion = Math.pow(this.numero1, this.numero2);
   return operacion;
 }

}  
