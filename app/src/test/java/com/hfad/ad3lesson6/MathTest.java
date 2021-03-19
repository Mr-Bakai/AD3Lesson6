package com.hfad.ad3lesson6;
import com.hfad.ad3lesson6.domain.Math;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MathTest {
    public static final String DIV_METHOD = "The DIV method should divide 2 numbers";
    public static final String SUB_METHOD = "The SUB method should do simple subtraction (from a - b)";
    public static final String MUL_METHOD = "The MUL method should multiply 2 numbers";
    public static final String POW_METHOD = "The POWER method should do simple exponent";
    public static final String THE_ROOT = "The ROOT the method should do simple square root";
    public static final String MESSAGE_ADD = "The ADD method should add 2 numbers";
    public static final String REVERS_METHOD = "The REVERSE method simply reverses any given sentence";
    private Math math;

    @Before
    public void setUp() throws  Exception {
     math = new Math();
        System.out.println("BEFORE");
    }

    @Test
    public void addTest(){
        assertEquals(MESSAGE_ADD, 5, math.add(3, 2));
        assertEquals(MESSAGE_ADD,5, math.add(15, -10));
        assertEquals(MESSAGE_ADD,-4, math.add(-15, 11));
        assertEquals(MESSAGE_ADD,-0, math.add(-15, 15));
        assertEquals(MESSAGE_ADD,-30, math.add(-15, -15));
        System.out.println("ADD");
    }


    @Test
    public void divTest(){
        assertEquals(DIV_METHOD,5, math.div(25, 5));
        assertEquals(DIV_METHOD,0, math.div(0, 7));
        assertEquals(DIV_METHOD,0, math.div(7, 0));
        assertEquals(DIV_METHOD,0, math.div(-7, 0));
        assertEquals(DIV_METHOD,0, math.div(7, -0));
        assertEquals(DIV_METHOD,0, math.div(-7, -0));
        System.out.println("DIV");
    }

    @Test
    public void subTest(){
        assertEquals(SUB_METHOD,4, math.sub(8, 4));
        assertEquals(SUB_METHOD,-20, math.sub(-10, 10));
        assertEquals(SUB_METHOD,0, math.sub(-10, -10));
        assertEquals(SUB_METHOD,20, math.sub(10, -10));
        assertEquals(SUB_METHOD,0, math.sub(0, 0));
        System.out.println("SUB");
    }

    @Test
    public void mulTest(){
        assertEquals(MUL_METHOD,4, math.mul(2,2));
        assertEquals(MUL_METHOD,-4, math.mul(-2,2));
        assertEquals(MUL_METHOD,0, math.mul(-7,0));
        assertEquals(MUL_METHOD,0, math.mul(0,8));
        assertEquals(MUL_METHOD,4, math.mul(-2,-2));
        assertEquals(MUL_METHOD,-4, math.mul(2,-2));
        System.out.println("MUL");
    }


    @Test
    public void powTest(){
        assertEquals(POW_METHOD,25, math.pow(5,2));
        assertEquals(POW_METHOD,25, math.pow(-5,2));
        assertEquals(POW_METHOD,125, math.pow(5,3));
        System.out.println("POW");
    }


    @Test
    public void sRoot(){
        assertEquals(THE_ROOT,5, math.sqRoot(25));
        System.out.println("SQUARE ROOT");
    }

    @Test
    public void reverseWords(){
        assertEquals(REVERS_METHOD,"Two One", math.reverseWords("One Two"));
        assertEquals(REVERS_METHOD,"Geektech", math.reverseWords("Geektech"));
        assertEquals(REVERS_METHOD,"Three Two One", math.reverseWords("One Two Three"));
        assertEquals(REVERS_METHOD,"", math.reverseWords(null));
        System.out.println("REVERS WORDS");
    }

    @After
    public void clear() throws Exception{
        math = null;
        System.out.println("AFTER");
    }
}
