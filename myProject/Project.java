package com.ihor.myProject;

import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

public class Project {

    @Test

    void isCalculatePow() {

        assertEquals(256, MathLibrary.pow(4, 4));


    }



    @Test

    void isCalculateFactorial() {

        assertEquals(120, MathLibrary.factorial(5));

    }



    @Test

    void IsCalculateLog() {


        assertEquals(3, MathLibrary.log(27, 3));

    }
}
