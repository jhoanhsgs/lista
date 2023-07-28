/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author jhoan
 */
public class main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> Lista;
        
        Lista =new ArrayList<>();
   
        Lista.add(15);Lista.add(12);
        Lista.add(54);Lista.add(8);
        Lista.add(6);Lista.add(78);
        Lista.add(78);Lista.add(16);
        Lista.add(23);Lista.add(15);
        Lista.add(1);Lista.add(5);
        Lista.add(5);Lista.add(8);
        Lista.add(4);Lista.add(6);
        Lista.add(2);Lista.add(56);
        
        int n=0;
        int Mayor=0;
        int Menor=Lista.get(n);
        
        System.out.println("esta es la lista " + Lista);
        
        for (int i = 0; i < Lista.size(); i++) {
            n+=Double.parseDouble(Lista.get(i).toString());
            if (Lista.get(i) > Mayor) {
                Mayor = Lista.get(i);
                //System.out.println("Mayor actual "+ Mayor);
            }
            if (Lista.get(i) < Menor) {
                Menor = Lista.get(i);
                //System.out.println("Menor actual "+ Menor);
            }
        }
        System.out.println("--------------------");
        System.out.println("el mayor es "+ Mayor);
        System.out.println("--------------------");
        System.out.println("el menor es "+ Menor);
        System.out.println("--------------------");
        System.out.println("el promedio de la lista es: " + n/Lista.size());
    } 
}
/*en este codigo inicialmente cree la lista
    hice uso del metodo add para añadir los numeros al arraylist
inicialice 3 variables 
n para capturar la suma de los elementos del arraylist
Mayor para capturar el mayor numero del arraylist
Menor para capturar el menor numero del arraylist

con el for se recorre la lista y dentro de este hice las condiciones 
para capturar la suma de los elementos para asi llegar al promedio

los if para llegar al mayor y menor numero del array list
*/