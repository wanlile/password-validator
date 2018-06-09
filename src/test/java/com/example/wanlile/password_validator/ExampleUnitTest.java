package com.example.wanlile.password_validator;

import org.junit.Test;

//import static ;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void check(){
        String password = "password";
        boolean out = MainActivity.strongpassword(password);
        assertEquals(false,out);
    }
    @Test
    public void check1(){
        String password = "Jil#9ijindu";
        boolean out =MainActivity.strongpassword(password);
        assertEquals(true,out);
    }
    @Test
    public void  check2(){
        String password = "Liojdnuc";
        boolean out = MainActivity.strongpassword(password);
        assertEquals(false,out);
    }
    @Test
    public void check3(){
        String password = "Lioj";
        boolean out = MainActivity.strongpassword(password);
        assertEquals(false,out);
    }
}