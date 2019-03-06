package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsequiteIntTest {

    ConsequiteInt ci;

    @Before
    public void setUp() throws Exception {
        ci = new ConsequiteInt();
    }

    @After
    public void tearDown() throws Exception {

        ci=null;

    }

    @Test
    public void checkCons1() {
        assertEquals(true,ci.checkCons("1,2,3,4,5,6,7"));
    }
    @Test
    public void checkCons2() {
        assertEquals(false,ci.checkCons("1,2,3,2,1,6,7"));
    }
    @Test
    public void checkCons3() {
        assertEquals(true,ci.checkCons("10,29,34,66,77,81,82"));
    }
    @Test
    public void checkCons4() {
        assertEquals(false,ci.checkCons("1,1,2,3,4,5,6"));
    }
    @Test
    public void checkCons5() {
        assertEquals(false,ci.checkCons("1,2,3,4,5,6,6"));
    }
}