/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author pablo
 */
public class prueba {
    
    public static int aProbar(int q)
    {
        int res = 0, i=0;
        
        if(q<0) //1
        {
            return 0; //2
        }
        else //3
        {
            while(i<q) //4
            {
                res=res + q; //5
                i++;
            } //6
        }//7
        
        return res;
    }
    
}
