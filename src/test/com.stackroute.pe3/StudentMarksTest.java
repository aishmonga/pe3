package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {

    StudentMarks sm;

    @Before
    public void setUp() throws Exception {
        sm = new StudentMarks();
    }

    @After
    public void tearDown() throws Exception {
        sm = null;
    }

    @Test
    public void stuMark() throws MyException {
        assertNotNull(sm.stuMark());
    }
}