/*
Implementacion de algunas funciones de cadenas.
Pruebas Cadena Alumno
 */
package unit9;

import static java.lang.System.*;

/**
 *
 * @author Jose Miguel Dura Sirvent
 */
public class CadenasAlumno {
    public int longitudCadena(String cadena)
    {
        int i=0;
        try
        {
            while(true)
            {
                cadena.charAt(i);
                i++;
            }
            
        }
        catch(IndexOutOfBoundsException a)
        {
            return i;
        }
    }
    public boolean sonIguales(String cadena1, String cadena2)
    {
        boolean iguales=true;
        if(longitudCadena(cadena1)!=longitudCadena(cadena2))
            return false;
        int i=0;
        while(iguales && i<longitudCadena(cadena1))
        {
            if(cadena1.charAt(i)!=cadena2.charAt(i))
                iguales=false;
            i++;
        }
        return iguales;
    }
    
    public boolean esMayor(String cadena1, String cadena2)
    {
        return longitudCadena(cadena1)>longitudCadena(cadena2);
    }
    
    public boolean esMenor(String cadena1, String cadena2)
    {
        return longitudCadena(cadena1)<longitudCadena(cadena2);
    }
    
    public boolean comparaIgnorandoMayusculas(String cadena1, String cadena2)
    {
        return sonIguales(convertirMayusculas(cadena1),
            convertirMayusculas(cadena2));
    }

    public String convertirMayusculas(String cadena)
    {
        String nuevaCadena="";
        for(int i=0;i<longitudCadena(cadena);i++)
        {
            //Valores Ascii de las letras en minusculas
            if(cadena.charAt(i)>=97 && cadena.charAt(i)<=122)
            {
                nuevaCadena+=(char)(cadena.charAt(i)-32);
            }
            else
            {
                nuevaCadena+=cadena.charAt(i);
            }
        }
        return nuevaCadena;
    }
    
    public String convertirMinusculas(String cadena)
    {
        String nuevaCadena="";
        for(int i=0;i<longitudCadena(cadena);i++)
        {
            //Valores Ascii de las letras en minusculas
            if(cadena.charAt(i)>=65 && cadena.charAt(i)<=90)
            {
                nuevaCadena+=(char)(cadena.charAt(i)+32);
            }
            else
            {
                nuevaCadena+=cadena.charAt(i);
            }
        }
        return nuevaCadena;
    }
    
    public String reemplazaPrimero(String cadena, String regla, String cambio)
    {
        String nuevaCadena="";
        if(posicionPrimeraCadena(cadena,regla)!=-1)
        {
            nuevaCadena+=extraerSubstring(cadena,
                    0,(int)posicionPrimeraCadena(cadena,regla));
            nuevaCadena+=cambio;
            nuevaCadena+=extraerSubstring(cadena,
                (int)posicionPrimeraCadena(cadena,regla)+longitudCadena(regla),
                    longitudCadena(cadena));
        }
        else
        {
            nuevaCadena="Error, no contiene esa palabra";
        }
        return nuevaCadena;
    }
    public long posicionPrimeraCadena(String cadena, String letra)
    {
        boolean found=false;
        int i=0;
        while(!found && i<longitudCadena(cadena))
        {
            if(cadena.charAt(i)==letra.charAt(0))
            {
                if(sonIguales(extraerSubstring(cadena,i,longitudCadena(letra)+i),
                    letra))
                {
                    found=true;
                }
                else
                {
                    i++;
                }
            }
            else
            {
                i++;
            }
        }
        
        if(found)
        {
            return i;
        }
        else
        {
            return -1;
        }
    }

    public String reemplazaTodos(String cadena, String regla, String cambio)
    {
        int longRegla=longitudCadena(regla);
        String nuevaCadena="";
        for(int i=0;i<longitudCadena(cadena);i++)
        {
            if(cadena.charAt(i)==regla.charAt(0))
            {
                if(sonIguales(extraerSubstring(cadena,i,longRegla+i),regla))
                {
                    nuevaCadena+=cambio;
                    i+=(longRegla-1);
                }
                else
                {
                    nuevaCadena+=cadena.charAt(i);
                }
            }
            else
            {
                nuevaCadena+=cadena.charAt(i);
            }
        }
        return nuevaCadena;
    }
    public String extraerSubstring(String cadena, int posicionInicio)
    {
        String nuevaCadena="";
        for(int i=posicionInicio;i<longitudCadena(cadena);i++)
        {
            nuevaCadena+=cadena.charAt(i);
        }
        return nuevaCadena;
    }
    
    public String extraerSubstring(String cadena, int posicionInicio,
            int posicionFinal)
    {
        String nuevaCadena="";
        for(int i=posicionInicio;i<posicionFinal;i++)
        {
            nuevaCadena+=cadena.charAt(i);
        }
        return nuevaCadena;
    }
    
    
    public String quitaEspacios(String cadena)
    {
        while(empiezaCon(cadena," "))
        {
            cadena=reemplazaPrimero(cadena," ","");
        }
        while(acabaEn(cadena," "))
        {
            cadena=extraerSubstring(cadena,0,longitudCadena(cadena)-1);
        }
        return cadena;
    }
    public boolean empiezaCon(String cadena, String prefijo)
    {
        return sonIguales(extraerSubstring(cadena,0,longitudCadena(prefijo)),prefijo);
    }
    
    public boolean acabaEn(String cadena, String prefijo)
    {
        return sonIguales(extraerSubstring(cadena,
            longitudCadena(cadena)-longitudCadena(prefijo)),prefijo);
    }
    
    public String concatenaCadenas(String cadena1, String cadena2)
    {
        return cadena1+cadena2;
    }
    
    public void muestraSplit(String cadena, String regla)
    {
        String nuevaCadena="";
        for(int i=0;i<longitudCadena(cadena);i++)
        {
            if(cadena.charAt(i)==regla.charAt(0))
            {
                if(sonIguales(
                    extraerSubstring(cadena,i,longitudCadena(regla)+i),regla))
                {
                    nuevaCadena+="\n";
                    i+=longitudCadena(regla)-1;
                }
                else
                {
                    nuevaCadena+=cadena.charAt(i);
                }
            }
            else
            {
               nuevaCadena+=cadena.charAt(i);
            }
        }
        out.println(nuevaCadena);
    }
    
    public void muestraSplitLimite(String cadena, String regla, int limite)
    {
        String nuevaCadena="";
        int times=0;
        int i=0;
        while(times<limite && i<longitudCadena(cadena))
        {
            if(cadena.charAt(i)==regla.charAt(0))
            {
                if(sonIguales(
                    extraerSubstring(cadena,i,longitudCadena(regla)+i),regla))
                {
                    nuevaCadena+="\n";
                    i+=longitudCadena(regla)-1;
                }
                else
                {
                    nuevaCadena+=cadena.charAt(i);
                }
            }
            else
            {
               nuevaCadena+=cadena.charAt(i);
            }
            i++;
        }
        if(i<longitudCadena(cadena))
            nuevaCadena+=extraerSubstring(cadena,i);

        out.println(nuevaCadena);   
        
    }

    public static void main(String[] args) {
        CadenasAlumno a= new CadenasAlumno();
        String cadena="       El gato de Agustin es un gato         ";
        if(a.acabaEn(cadena,"manco"))
        {
            out.println("SI");
        }
        a.muestraSplitLimite(cadena,"gato",1);
    }
}
