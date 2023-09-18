/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author melian
 */
public class Ecuacion {
    double A,B,C;
    String tipo = "";
    
    public Ecuacion(double a, double b, double c){
        A = a;
        B = b;
        C = c;
    }
    
    double x = Math.pow(B, 2) - 4*A*C;
    double y = Math.sqrt(x); 
    
    public String tipoSolucion(){
        if (x>0){
            tipo = "distintas";
            return ("La ecuacion tiene soluciones reales distintas");
        }else if(x==0){
            tipo = "iguales";
            return ("La ecuacion tiene soluciones reales iguales");
        }else{
            tipo = "sin solucion";
            return ("La ecuacion no posee soluciones reales");
        }
    }
    
    public String soluciones(){
        this.tipoSolucion();
        if (tipo == "distintas"){
            double solucion1 = (-B + y)/2*A;
            double solucion2 = (-B - y)/2*A;
            return ("x1= "+ solucion1 +" x2= " +solucion2);
        } else if (tipo == "iguales"){
            double solucion1 = (-B + y)/2*A;
            double solucion2 = (-B - y)/2*A;
            return ("x1= "+ solucion1 +" x2= " +solucion2);
        }else{
            return "";
        }
    }
}
