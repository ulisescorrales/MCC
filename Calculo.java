/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcpc;

import java.util.Map;

/**
 *
 * @author ulises.corrales
 */
public class Calculo {
    
    public static double calculoTrapecio(float limInferior,float limSuperior,double[] colImagen){
        double resultado;
        int longValores=colImagen.length;
        int i;
        int cantIntervalos=longValores-1;
        
        float h=(limSuperior-limInferior)/cantIntervalos;
        float sumatoria=0;
        
        int fin=longValores-1;
        for(i=1;i<fin;i++){
            sumatoria+=colImagen[i];
        }        
        resultado=(h/2)*(colImagen[0]+colImagen[longValores-1]+2*sumatoria);        
        return resultado;
    }
    
    public static double calculoSimpson(float limInferior,float limSuperior,double[] colImagen){
        //Comprobación inicial de cantidad de puntos, debe ser cantidad impar mayor o igual a 3
        int cantValores=colImagen.length, cantIntervalos=cantValores-1;
        double resultado;
        double h;
        double sumatoriaImpar=0;
        double sumatoriaPar=0;
        int i,finSumImpar,finSumPar;
        if(cantValores%2!=0 && cantValores>=3){
            h=(limSuperior-limInferior)/cantIntervalos;
            finSumImpar=cantValores-1;
            //Sumatoria impar
            for(i=1;i<finSumImpar;i+=2){
                sumatoriaImpar=sumatoriaImpar+colImagen[i];
            }
            finSumPar=cantValores-2;
            //Sumatoria par
            for(i=2;i<finSumPar;i+=2){
                sumatoriaPar=sumatoriaPar+colImagen[i];
            }
            resultado=(h/3)*(colImagen[0]+colImagen[cantValores-1]+4*sumatoriaImpar+2*sumatoriaPar);
        }else{
            //Error
            resultado=-99999999;
        }
        return resultado;
    }    
    public static double diferenciaAtras(double val1, double val2,double h){
        return 5;
    }
    public static double diferenciaAdelante(double val1, double val2){
        return 1;
    }
    public static double diferenciaCentral(double val1, double val2){
        return 2;
    }
    
    public static float sumaRiemmann(double[][] valores,int m, int n, double area){
        int i,j;
        float resultado=0;        
        for (i = 0; i < m; i++) {
            for (j = 0;  j< n; j++) {                                                
                resultado+=valores[i][j]*area;
            }
        }
        return resultado;
    }
}
