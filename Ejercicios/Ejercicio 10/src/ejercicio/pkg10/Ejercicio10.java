package ejercicio.pkg10;

import java.util.Arrays;




public class Ejercicio10 {

    public static void main(String[] args) {
        int vector1 [] = new int [50];
        double vector2 [] = new double [20];
        
        for (int i = 0; i < 50; i++) {
            vector1[i] = (int) (Math.random()*10);
            System.out.print("[" +vector1[i]+ "]");
        }
        System.out.println("-------------------=========-------------------");
        Arrays.sort(vector1, 0, 50);
        
        for (int i = 0; i < 50; i++) {
            System.out.print("[" +vector1[i]+ "]");
        }
        System.out.println("");
        System.out.println("-------------------=========-------------------");
        for (int i = 0; i < 20; i++) {
            if (i <= 10){
                vector2[i] = vector1[i];
            }else{
                vector2[i]= 0.5;
            }
            System.out.print(("[" +vector2[i]+ "]"));
        }
    }

}
