package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DateFirstLastTest {

    DateFirstLast dfl;

    @Before
    public void setUp() throws Exception {
        dfl = new DateFirstLast();
    }

    @After
    public void tearDown() throws Exception {
        dfl = null;
    }

    @Test
    public void dates() {
        assertNotNull(dfl.dates());
    }
}