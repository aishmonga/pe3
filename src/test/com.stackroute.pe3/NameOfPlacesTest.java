package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NameOfPlacesTest {

    NameOfPlaces nop;

    @Before
    public void setUp() throws Exception {
        nop = new NameOfPlaces();
    }

    @After
    public void tearDown() throws Exception {
        nop = null;
    }

    @Test
    public void noVovel1() {
        String[] in = {"abc","def","ghi","jkl"};
        String[] out = {"bc","df","gh","jkl"};
        assertArrayEquals(out,nop.noVowel(in));
    }

    @Test
    public void noVovel2() {
        String[] in = {""};
        String[] out = {""};
        assertArrayEquals(out,nop.noVowel(in));
    }

    @Test
    public void noVovel3() {
        String[] in = {"a"};
        String[] out = {""};
        assertArrayEquals(out,nop.noVowel(in));
    }

    @Test
    public void noVovel4() {
        String[] in = {"xyz","aei"};
        String[] out = {"xyz",""};
        assertArrayEquals(out,nop.noVowel(in));
    }

    @Test
    public void noVovel5() {
        String[] in = null;
        String[] out = null;
        assertArrayEquals(out,nop.noVowel(in));
    }

    @Test
    public void noVovel6() {
        String[] in = {"aaa","eee"};
        String[] out = {"",""};
        assertArrayEquals(out,nop.noVowel(in));
    }
}