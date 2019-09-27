/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_programación;

import java.util.Scanner;

/**
 *
 * @author christian_aqueveque
 */
public class Ejercicios_Programación {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Ejercicios Clase Jueves 29-08-2019
        
        //Ejercicio1
        
        Scanner read = new Scanner(System.in);
        
//        int entero = 0;
//        System.out.print("Ingrese un número: ");
//        entero = read.nextInt();
//        if(entero % 2 == 0){
//            System.out.println("El número " + entero + " es par.");
//        }else{
//            System.out.println("El número " + entero + " es impar.");
//        }
//        
//        
//        //Ejercicio2
//        
//        int num = 0;
//        int abs = 0;
//        System.out.print("Ingrese un número: ");
//        num = read.nextInt();
//        if(num > 0){
//            abs = num;
//        }else{
//            abs = -1 * num;
//        }
//        System.out.println("El valor absoluto de " + num + " es "+ abs);
//        
//        
//        //Ejercicio3
//        
//        int numero = 0;
//        System.out.print("Ingrese un número: ");
//        numero = read.nextInt();
//        if(numero >= 0){
//            if(numero == 0){
//                System.out.println("El número " + numero + " es neutro.");
//            }else{
//                System.out.println("El número " + numero + " es positivo.");
//            }
//        }else{
//            System.out.println("El número " + numero + " es negativo.");
//        }
//        
//
//        //Ejercicio4
//        
//        int numero1 = 0;
//        int numero2 = 0;
//        System.out.print("Ingrese un número: ");
//        numero1 = read.nextInt();
//        System.out.print("Ingrese otro número: ");
//        numero2 = read.nextInt();
//        if(numero1 == numero2){
//            System.out.println("Los números ingresados son iguales.");
//        }else{
//            if(numero1 > numero2){
//                System.out.println("El número " + numero1 + " es mayor.");
//            }else{
//                System.out.println("El número " + numero2 + " es mayor.");
//            }
//        }
//        
//        //Ejercicio5
//        
//        int ultimaCifra = 0;
//        System.out.println("Ingrese un número: ");
//        ultimaCifra = read.nextInt();
//        System.out.println("La última cifra es " + ultimaCifra % 10);
//        
//        //Ejercicios Clase Jueves 05-09-2019
//        
//        //Ejercicio 1
//        
//        int a = 0;
//        for (int i = 0; i <= 10; i++) {
//            a = a + i;
//        }
//        System.out.println(a);
//        
//        //Ejercicio 2
//        
//        double notas [] = new double[5];
//        double promedio = 0;
//        for (int i = 0; i < notas.length; i++) {
//            System.out.print("Ingrese una nota: ");
//            notas[i] = read.nextDouble();
//        }
//        
//        for (int i = 0; i < notas.length; i++) {
//            promedio = promedio + notas[i];
//        }
//        promedio = promedio / notas.length;
//        System.out.print("El promedio es ");
//        System.out.printf("%.1f%n", promedio);
//        //System.out.println("");
//        
//        //Ejercicio 3
//        
//        int num = 0;
//        int first = 0;
//        int last = 0;
//        for (int i = 0; i <= 10; i++) {
//            System.out.print("Ingrese un número: ");
//            num = read.nextInt();
//            if(i == 0){
//                first = num;
//            }else if(i == 10){
//                last = num;
//            }//End If
//        }//End For
//        System.out.println("El primer número es " + first + " y el último número es " + last);
        
        //Clase Martes 10/09/2019
        
          //Ejercicio 1
        
//        System.out.println("Indique el lado de un cuadrado: ");
//        double sideSquare = read.nextDouble();
//        double area = Math.pow(sideSquare, 2);
//        double perimetro = sideSquare * 4;
//        double diagonal = Math.pow(2, 0.5);
//        diagonal = diagonal * sideSquare;
//        System.out.println("El área del cuadrado es: " + area);
//        System.out.println("El perimetro del cuadrado es: " + perimetro);
//        System.out.println("La diagonal del cuadrado es: " + diagonal);
//
//        //Ejercicio 2
//        
//        System.out.print("Ingrese el ancho del rectángulo: ");
//        double anchoRectangle = read.nextDouble();
//        System.out.print("Ingrese el alto del rectángulo: ");
//        double altoRectangle = read.nextDouble();
//        double areaRectangle = anchoRectangle * altoRectangle;
//        double perimetroRectangle = 2 * (anchoRectangle + altoRectangle);
//        double diagonalRectangle = (Math.pow(altoRectangle, 2)) + (Math.pow(anchoRectangle, 2));
//        diagonalRectangle = Math.pow(diagonalRectangle, 0.5);
//        System.out.println("El area del rectángulo es: " + areaRectangle);
//        System.out.println("El perimetro del rectángulo es: " + perimetroRectangle);
//        System.out.println("La diagonal del rectángulo es: " + diagonalRectangle);
//
//        //Ejercicio 3
//        
//        System.out.print("Ingrese el radio del círculo: ");
//        double radioCircle = read.nextDouble();
//        double areaCircle = (Math.pow(radioCircle, 2) * Math.PI);
//        double perimetroCircle = 2 * Math.PI * radioCircle;
//        double diametroCircle = 2 * radioCircle;
//        System.out.println("El área del círculo es " + areaCircle);
//        System.out.println("El perímetro del círculo es " + perimetroCircle);
//        System.out.println("El diámetro del círculo es " + diametroCircle);

            //Ejercicio 4
            
          //Ejercicios Clase Martes 24/09/2019
          
          //Ejercicio 1
          
//          int num = 0;
//          while(num == 0){
//              try {
//                  System.out.print("Ingrese un número: ");
//                  num = read.nextInt();
//              } catch (Exception e) {
//                  System.out.println("Entrada Errónea.");
//                  read.next();
//              }
//          }

            //Clase Jueves 26/09/2019
            
            //Ejercicio 1
            
            String word = ""; //Variable para la palabra ingresada.
            System.out.print("Ingrese su nombre: "); //Entrada del usuario.
            word = read.nextLine(); //Almacenar en variable entrada del usuario.
            System.out.println("Su nombre tiene " + word.length() + " caracteres."); //Mostrar el valor al usuario.
            System.out.println("Inicia con " + word.charAt(0) + " y termina con " + word.charAt(word.length() - 1));
    }
    
}
