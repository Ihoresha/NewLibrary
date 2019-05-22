package com.ihor.myProject;

import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

public class Project {

    @Test

    void isCalculatePow() {

        assertEquals(256, MathLib.pow(4, 4));


    }



    @Test

    void isCalculateFactorial() {

        assertEquals(120, MathLib.factorial(5));

    }



    @Test

    void IsCalculateLog() {


        assertEquals(3, MathLib.log(27, 3));

    }
}
