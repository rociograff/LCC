/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Desarrollo2018.TPArregloEntrega;


import java.util.Arrays;

/**
 *
 * @author usuario
 */
public class Ej2 {

    public static char[] asignarArrNuevo(char[] codigo) {
        // Modulo que asigna los elementos del codigo viejo al nuevo arreglo de codigos en las posiciones pares
        int i, j = 0;
        char aux;
        int longitud = codigo.length;
        int longitudCodigoNuevo = (longitud * 2);
        char[] codigoNuevo;   //Declaracion del arreglo nuevo de codigos 
        codigoNuevo = new char[longitudCodigoNuevo];   //Creacion del nuevo arreglo de codigos con la nueva longitud 

        // Asignacion de los elementos viejos al arreglo nuevo en las posiciones pares
        for (i = 0; i < longitud; i++) {
            aux = codigo[i];
            codigoNuevo[j] = aux;
            j = j + 2; 
        }
        return cambiarCodigo(codigoNuevo, longitudCodigoNuevo);
    }

    public static char[] cambiarCodigo(char[] codigoNuevo, int longitud) {
        // Declaracion de variables
        int i;

        for (i = 1; i < longitud; i = i + 2) {
            switch (codigoNuevo[i - 1]) {
                case 3:
                    codigoNuevo[i] = 'A';
                    break;
                case 'A':
                    codigoNuevo[i] = 3;
                    break;
                case 'a':
                    codigoNuevo[i] = 3;
                    break;
                case 5:
                    codigoNuevo[i] = 'M';
                    break;
                case 'M':
                    codigoNuevo[i] = 5;
                    break;
                case 'm':
                    codigoNuevo[i] = 5;
                    break;
                case 7:
                    codigoNuevo[i] = 'F';
                    break;
                case 'F':
                    codigoNuevo[i] = 7;
                    break;
                case 'f':
                    codigoNuevo[i] = 7;
                    break;
            }
        }
        return codigoNuevo;
    }

    public static void imprimirCartel(String texto, char ch) {
        //La variable texto me permite mostrar un texto personalizado
        if (Character.isLetter(ch)) {
            System.out.print(texto + ch);
        } else {
            int num = (int) ch;
            System.out.print(texto + num);
        }
    }

    public static char[] mostrarCodigoNuevo(char[] codigoNuevo, int longitud) {
        for (int i = 0; i < longitud; i++) {
            // System.out.print(codigoNuevo[i] + " ");
            imprimirCartel(" ", codigoNuevo[i]);
        }
        return codigoNuevo;
    }

    public static char[] mostrarCodigoViejo(char[] codigo, int longitud) {
        for (int i = 0; i < longitud; i++) {
            // System.out.print(codigo[i] + " ");
            imprimirCartel(" ", codigo[i]);
        }
        System.out.println(" ");
        return codigo;
    }

    public static int cantidadNumeros(char[] codigoNuevo, int longitud) {
        // Declaracion de variables
        int i;
        int contadorNumeros = 0;

        for (i = 0; i < longitud; i++) {
            switch (codigoNuevo[i]) {
                case 3:
                    contadorNumeros++;
                    break;
                case 5:
                    contadorNumeros++;
                    break;
                case 7:
                    contadorNumeros++;
                    break;
                default:
                    contadorNumeros = contadorNumeros + 0;
            }
        }
        return contadorNumeros;
    }

    public static int cantidadLetras(char[] codigoNuevo, int longitud) {
        // Declaracion de variables
        int i;
        int contadorLetras = 0;

        for (i = 0; i < longitud; i++) {
            switch (codigoNuevo[i]) {
                case 'A':
                    contadorLetras++;
                    break;
                case 'a':
                    contadorLetras++;
                    break;
                case 'M':
                    contadorLetras++;
                    break;
                case 'm':
                    contadorLetras++;
                    break;
                case 'F':
                    contadorLetras++;
                    break;
                case 'f':
                    contadorLetras++;
                    break;
                default:
                    contadorLetras = contadorLetras + 0;
            }
        }
        return contadorLetras;
    }

    public static void main(String[] args) {
        // Declaracion de variables
        char[] codigo = {1, 3, 5, 7, 'b', 'g', 'f'};
        int longitud = codigo.length;
        char[] codigoNuevo;

        mostrarCodigoViejo(codigo, longitud);
        codigoNuevo = asignarArrNuevo(codigo);
        int longitudCN = codigoNuevo.length;

        System.out.println(" ");
        codigoNuevo = mostrarCodigoNuevo(codigoNuevo, longitud);
        System.out.println(" ");
        System.out.println("Cantidad de Numeros: " + cantidadNumeros(codigoNuevo, longitud));
        System.out.println("Cantidad de Letras: "+cantidadLetras(codigoNuevo, longitud));
        // Muestro el primer 
        imprimirCartel("Primer elemento del arreglo: ", codigoNuevo[0]);
        imprimirCartel("Elemento del medio del arreglo: ", codigoNuevo[((longitudCN - 1) / 2)]);
        imprimirCartel("Ultimo elemento del arreglo: ", codigoNuevo[(longitudCN - 1)]);
    }

}
