package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAdditionTest {

    MatrixAddition ma;

    @Before
    public void setUp() throws Exception {
        ma = new MatrixAddition();
    }

    @After
    public void tearDown() throws Exception {
        ma=null;
    }

    @Test
    public void add1() {
        int[][] out = {{10,10,10},{10,10,10}};
        int[][] in1 = {{1,2,3},{4,5,6}};
        int[][] in2 = {{9,8,7},{6,5,4}};
        assertArrayEquals(out,ma.add(in1,in2));
    }

    @Test
    public void add2() {
        int[][] out = {{1},{1}};
        int[][] in1 = {{1},{0}};
        int[][] in2 = {{0},{1}};
        assertArrayEquals(out,ma.add(in1,in2));
    }

    @Test
    public void add3() {
        int[][] out = {{0},{0}};
        int[][] in1 = {{0},{0}};
        int[][] in2 = {{0},{0}};
        assertArrayEquals(out,ma.add(in1,in2));
    }

    @Test
    public void add4() {
        int[][] out = {{10,10,10,10},{10,10,10,10}};
        int[][] in1 = {{1,2,3,4},{5,6,7,8}};
        int[][] in2 = {{9,8,7,6},{5,4,3,2}};
        assertArrayEquals(out,ma.add(in1,in2));
    }

    @Test
    public void add5() {
        int[][] out = {{10,10,10},{10,10,10}};
        int[][] in1 = {{1,2,3},{4,5,6}};
        int[][] in2 = {{9,8,7},{6,5,4}};
        assertArrayEquals(out,ma.add(in1,in2));
    }


    @Test
    public void add6() {
        int[][] out = {{10,10,10},{10,10,10}};
        int[][] in1 = {{1,2,3},{4,5,6}};
        int[][] in2 = {{9,8,7},{6,5,4}};
        assertArrayEquals(out,ma.add(in1,in2));
    }

    @Test
    public void add8() {
        int[][] out = {{10,10,10},{10,10,10}};
        int[][] in1 = {{1,2,3},{4,5,6}};
        int[][] in2 = {{9,8,7},{6,5,4}};
        assertArrayEquals(out,ma.add(in1,in2));
    }

    @Test
    public void add9() {
        int[][] out = {{10,10,10},{10,10,10}};
        int[][] in1 = {{1,2,3},{4,5,6}};
        int[][] in2 = {{9,8,7},{6,5,4}};
        assertArrayEquals(out,ma.add(in1,in2));
    }

    @Test
    public void add10() {
        int[][] out = {{2,3},{3,2}};
        int[][] in1 = {{1,2},{1,2}};
        int[][] in2 = {{1,1},{2,0}};
        assertArrayEquals(out,ma.add(in1,in2));
    }

    @Test
    public void add11() {
        int[][] out = null;
        int[][] in1 = null;
        int[][] in2 = null;
        assertArrayEquals(out,ma.add(in1,in2));
    }

    @Test
    public void add12() {
        int[][] out = {{10,10,10},{10,10,10}};
        int[][] in1 = {{1,2},{4,5}};
        int[][] in2 = {{9,8},{6,5}};
        assertNotNull(ma.add(in1,in2));
    }

    @Test
    public void add14() {
        int[][] out = {{10,10,10},{10,10,10}};
        int[][] in1 = {{1,2,3},{4,5,6}};
        int[][] in2 = {{9,8,7},{6,5,4}};
        assertArrayEquals(out,ma.add(in1,in2));
    }

    @Test
    public void add15() {
        int[][] out = {{10,10,10},{10,10,10},{10,10,10}};
        int[][] in1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] in2 = {{9,8,7},{6,5,4},{3,2,1}};
        assertArrayEquals(out,ma.add(in1,in2));
    }



    @Test
    public void add16() {
        int[][] out = {{10,10,10,10,10},{10,10,10,0,0}};
        int[][] in1 = {{1,2,3,4,5},{4,5,6}};
        int[][] in2 = {{9,8,7,6,5},{6,5,4}};
        assertArrayEquals(out,ma.add(in1,in2));
    }

    @Test
    public void add17() {
        int[][] out = {{10,10,10},{10,10,10},{1,2,3},{1,2,3}};
        int[][] in1 = {{1,2,3},{4,5,6},{1,1,1},{0,0,0}};
        int[][] in2 = {{9,8,7},{6,5,4},{0,1,2},{1,2,3}};
        assertArrayEquals(out,ma.add(in1,in2));
    }

    @Test
    public void add18() {
        int[][] out = {{10,10,10},{10,10,10}};
        int[][] in1 = {{1,2,3},{4,5,6}};
        int[][] in2 = {{9,8,7},{6,5,4}};
        assertArrayEquals(out,ma.add(in1,in2));
    }
}