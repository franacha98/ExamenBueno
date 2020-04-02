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
   
   /**
    * Precondición: tanto la ciudad como el país debe existir en la base de datos, de otro modo, devolverá 0.
    * Poscondición: devuelve un número tipo double POSITIVO. Devuelve 0 si la ciudad o el país no aparecen en la base de datos de la aplicación
    * 
    * Método abstracto que recibe una ciudad (String) y el país al que pertenece la ciudad, por si hubiera ciudades repetidas en diferentes países).<br>
    * Devuelve un double con el área de dicha ciudad, representado en kilómetros cuadrados
    * 
    * @param ciudad Cadena con la ciudad elegida
    * @param pais Cadena con el país de la ciudad(por si hubiera más paises con la misma ciudad)
    * @return devuelve un double con el área de la ciudad escogida (en kilómetros cuadrados).
    * 
    * 
    */
   public abstract double areaCiudad(String ciudad, String pais);
}