package ejerciciopropuesto18;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ajlon
 */
public class Nomina {
    int nhtm;
    double vht;
    int retencion;
    
    Nomina(int nhtm, double vht, int retencion){
        this.nhtm = nhtm;
        this.vht = vht;
        this.retencion = retencion;
    }
    
    double calcularSalarioBruto(){
        return nhtm*vht;
    }
    
    double calcularSalarioNeto(){
        return (nhtm*vht - nhtm*vht*retencion/100);
    }
}
