package com.gradle;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class SayHelloTest {
    @Test
    public void testSayHello() throws IOException {
        SayHello.main(new String[]{"en"});
    }

}