/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit9;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jose Miguel Dura Sirvent
 */
public class CadenasAlumnoTest {
    
    public CadenasAlumnoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testLongitudCadena() {
        System.out.println("longitudCadena");
        String cadena = "";
        CadenasAlumno instance = new CadenasAlumno();
        int expResult = 0;
        int result = instance.longitudCadena(cadena);
        assertEquals(expResult, result);
    }

    @Test
    public void testSonIguales() {
        System.out.println("sonIguales");
        String cadena1 = "";
        String cadena2 = "";
        CadenasAlumno instance = new CadenasAlumno();
        boolean expResult = false;
        boolean result = instance.sonIguales(cadena1, cadena2);
        assertEquals(expResult, result);
    }

    @Test
    public void testEsMayor() {
        System.out.println("esMayor");
        String cadena1 = "";
        String cadena2 = "";
        CadenasAlumno instance = new CadenasAlumno();
        boolean expResult = false;
        boolean result = instance.esMayor(cadena1, cadena2);
        assertEquals(expResult, result);
    }

    @Test
    public void testEsMenor() {
        System.out.println("esMenor");
        String cadena1 = "";
        String cadena2 = "";
        CadenasAlumno instance = new CadenasAlumno();
        boolean expResult = false;
        boolean result = instance.esMenor(cadena1, cadena2);
        assertEquals(expResult, result);
    }

    @Test
    public void testComparaIgnorandoMayusculas() {
        System.out.println("comparaIgnorandoMayusculas");
        String cadena1 = "";
        String cadena2 = "";
        CadenasAlumno instance = new CadenasAlumno();
        boolean expResult = false;
        boolean result = instance.comparaIgnorandoMayusculas(cadena1, cadena2);
        assertEquals(expResult, result);
    }

    @Test
    public void testConvertirMayusculas() {
        System.out.println("convertirMayusculas");
        String cadena = "";
        CadenasAlumno instance = new CadenasAlumno();
        String expResult = "";
        String result = instance.convertirMayusculas(cadena);
        assertEquals(expResult, result);
    }

    @Test
    public void testConvertirMinusculas() {
        System.out.println("convertirMinusculas");
        String cadena = "";
        CadenasAlumno instance = new CadenasAlumno();
        String expResult = "";
        String result = instance.convertirMinusculas(cadena);
        assertEquals(expResult, result);
    }

    @Test
    public void testReemplazaPrimero() {
        System.out.println("reemplazaPrimero");
        String cadena = "";
        String regla = "";
        String cambio = "";
        CadenasAlumno instance = new CadenasAlumno();
        String expResult = "";
        String result = instance.reemplazaPrimero(cadena, regla, cambio);
        assertEquals(expResult, result);
    }

    @Test
    public void testPosicionPrimeraCadena() {
        System.out.println("posicionPrimeraCadena");
        String cadena = "";
        String letra = "";
        CadenasAlumno instance = new CadenasAlumno();
        long expResult = 0L;
        long result = instance.posicionPrimeraCadena(cadena, letra);
        assertEquals(expResult, result);
    }

    @Test
    public void testReemplazaTodos() {
        System.out.println("reemplazaTodos");
        String cadena = "";
        String regla = "";
        String cambio = "";
        CadenasAlumno instance = new CadenasAlumno();
        String expResult = "";
        String result = instance.reemplazaTodos(cadena, regla, cambio);
        assertEquals(expResult, result);
    }

    @Test
    public void testExtraerSubstring_String_int() {
        System.out.println("extraerSubstring");
        String cadena = "";
        int posicionInicio = 0;
        CadenasAlumno instance = new CadenasAlumno();
        String expResult = "";
        String result = instance.extraerSubstring(cadena, posicionInicio);
        assertEquals(expResult, result);
    }

    @Test
    public void testExtraerSubstring_3args() {
        System.out.println("extraerSubstring");
        String cadena = "";
        int posicionInicio = 0;
        int posicionFinal = 0;
        CadenasAlumno instance = new CadenasAlumno();
        String expResult = "";
        String result = instance.extraerSubstring(cadena, posicionInicio, posicionFinal);
        assertEquals(expResult, result);
    }

    @Test
    public void testQuitaEspacios() {
        System.out.println("quitaEspacios");
        String cadena = "";
        CadenasAlumno instance = new CadenasAlumno();
        String expResult = "";
        String result = instance.quitaEspacios(cadena);
        assertEquals(expResult, result);
    }

    @Test
    public void testEmpiezaCon() {
        System.out.println("empiezaCon");
        String cadena = "";
        String prefijo = "";
        CadenasAlumno instance = new CadenasAlumno();
        boolean expResult = false;
        boolean result = instance.empiezaCon(cadena, prefijo);
        assertEquals(expResult, result);
    }

    @Test
    public void testAcabaEn() {
        System.out.println("acabaEn");
        String cadena = "";
        String prefijo = "";
        CadenasAlumno instance = new CadenasAlumno();
        boolean expResult = false;
        boolean result = instance.acabaEn(cadena, prefijo);
        assertEquals(expResult, result);
    }

    @Test
    public void testConcatenaCadenas() {
        System.out.println("concatenaCadenas");
        String cadena1 = "";
        String cadena2 = "";
        CadenasAlumno instance = new CadenasAlumno();
        String expResult = "";
        String result = instance.concatenaCadenas(cadena1, cadena2);
        assertEquals(expResult, result);
    }

    @Test
    public void testMuestraSplit() {
        System.out.println("muestraSplit");
        String cadena = "";
        String regla = "";
        CadenasAlumno instance = new CadenasAlumno();
        instance.muestraSplit(cadena, regla);
    }

    @Test
    public void testMuestraSplitLimite() {
        System.out.println("muestraSplitLimite");
        String cadena = "";
        String regla = "";
        int limite = 0;
        CadenasAlumno instance = new CadenasAlumno();
        instance.muestraSplitLimite(cadena, regla, limite);
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CadenasAlumno.main(args);
    }
    
}
