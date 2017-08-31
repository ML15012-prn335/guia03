/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.ingenieria.prn335.guia03;

import java.io.Serializable;
import javax.ejb.LocalBean;
import javax.enterprise.context.Dependent;

/**
 *
 * @author usuario
 */
@LocalBean
@Dependent
public class Utilities implements Serializable {
    
    public static void main(String[] args) {
      
    }

    /**
     * devuelve las Las primeras 30 letras del texto recibido
     * @param texto
     * @return 
     */
    public static String getResume(String texto) {
        char caracter = ' '; 
        int contador = 30;
        String frase = "";

        for (int i = 0; i < contador; i++) { //aqui  limita el tamaño de la cadena de texto
            caracter = texto.charAt(i);// voy a la pocision de la cadena
         
            
        frase += caracter; //concatenando el texto 
        }
        return frase; //devuelve la cadena de texto
    }

    /**
     * El texto que se ha recibido con cada palabra capitalizada y sin dobles espacios
     * @param texto
     * @return 
     */
    public static String capitalizar(String texto) {
        char[] caracteres = texto.toCharArray();
        
        for (int i = 0; i < texto.length(); i++) {// Pasa por la cadena de texto
            caracteres[0] = Character.toUpperCase(caracteres[0]);//hace mayuscula la primera letra
            if (caracteres[i] == ' ') {//Busca espacio 
                caracteres[i + 1] = Character.toUpperCase(caracteres[i + 1]);//hace mayuscula la primera letra
            }
        }
        texto = String.valueOf(caracteres);//se hace en String
        texto = (texto.replace("  ", " "));//se cambia de doble espacio por un espacio
        return texto;//retorno la cadena de texo
    }

    /**
     * devuelve La cantidad de coincidencias(case-ignore) de la frase en el texto recibido.
     * @param frase
     * @param texto
     * @return 
     */
    
    public static int contarCoincidencias(String frase, String texto) { 
        int contador = 0;// cuenta el numero  palabras

        while (frase.indexOf(texto) > -1) { //busca el primer caracter de la cadena de texyo
            frase = frase.substring(frase.indexOf(texto) + texto.length(), frase.length()); //devuelve una cadena de texto con el caracter indicado
            contador++;//agrega la cantidad de palabras ingresadas
        }
        return contador;//regresa la cantidad de palabras encontradas
    }
    
}
