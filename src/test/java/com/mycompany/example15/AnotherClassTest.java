package com.mycompany.example15;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnotherClassTest 
{    
    public AnotherClassTest() 
    {
    }

    @org.junit.jupiter.api.Test
    public void testAdd() 
    {
        AnotherClass ac = new AnotherClass();
        int actual = ac.Add(4, 6);
        int expected = 10;
        
        assertEquals(actual, expected);
    }    
}
