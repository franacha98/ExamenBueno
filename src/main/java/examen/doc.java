package examen;
/**
 * 
 *  Interfaz 'doc'<br>
 * @author Fran Acha 
 * @version 02/04/2020
 */
public interface doc
{
   
   // 
    /**
     * Devuelve el contenido del archivo tras insertar la linea line en la linea numero x, el contenido de la linea x, pasa a ser la linea x+1 y asi sucesivamente.
     * 
     * @param x Número de línea
     * @param line Cadena que contrendrá la línea elegida en 'x'
     * @param file Archivo del que se lee/escribe
     * @return 
     */
   public abstract String escribirLinea(int x, String line, String file);
   
   
}