/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcpc;

/**
 *
 * @author ulises.corrales
 */
public class MCPC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //cantidad de cuadrados= m*n
        int m=6;
        int n=6;                
        int x=2;
        int y=1;
        double pasox=(double)x/n;
        double pasoy=(double)y/m;
        double area=pasox*pasoy;
        double[][] valores=new double[m][n];
        System.out.println("PasoY:"+pasoy);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {                
                valores[i][j]= f1(pasox*(i+1),pasoy*(j+1));
            }
        }
        System.out.println(Calculo.sumaRiemmann(valores, m, n, area));                
    }
    public static void pruebaTrapecio(){
        double[] valores=new double[6];
        
        valores[0]=0;
        valores[1]=0.05;
        valores[2]=0.2;
        valores[3]=0.44;
        valores[4]=0.77;
        valores[5]=1.15;
        
        System.out.println("Resultado por m. trapecio: "+Calculo.calculoTrapecio(0, 1, valores));
        //System.out.println("Resultado por m. Simpson: "+Calculo.calculoSimpson(2, 4, valores));
    }
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
    
    public static double f1(double x,double y){
        return x*x+4*y*y;
    }        
    
    //TP1
    public static void punto12(){
        double[] valores=new double[5];
        
        valores[0]=0.2239;
        valores[1]=-0.0484;
        valores[2]=-0.2601;
        valores[3]=-0.3801;
        valores[4]=-0.387;
        
        System.out.println("Resultado por m. trapecio: "+Calculo.calculoTrapecio(2, 4, valores));
        System.out.println("Resultado por m. Simpson: "+Calculo.calculoSimpson(2, 4, valores));
    }
    //Punto 11
    public static void punto11(){
        double[] valores=new double[3];
        
        valores[0]=21;
        valores[1]=48;
        valores[2]=85;
        System.out.println("Resultado por m. trapecio: "+Calculo.calculoTrapecio(2, 4, valores));
        System.out.println("Resultado por m. Simpson: "+Calculo.calculoSimpson(2, 4, valores));
    }
    public static void punto1TPO(){
        double[] valores=new double[6];
        
        valores[0]=0;
        valores[1]=0.05;
        valores[2]=0.2;
        valores[3]=0.44;
        valores[4]=0.77;
        valores[5]=1.15;
        
        System.out.println("Resultado por m. trapecio: "+Calculo.calculoTrapecio(0, 1, valores));
        //System.out.println("Resultado por m. Simpson: "+Calculo.calculoSimpson(2, 4, valores));
    }
}
