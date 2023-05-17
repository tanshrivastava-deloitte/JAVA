package org.example;

import java.util.logging.Logger;

import static org.example.Test.logger;

// Interface
// Implements
// Interface

public interface Test
{
    public int square(int a);

    Logger logger = Logger.getLogger(String.valueOf(arithmetic.class));
}
// Implements
class arithmetic implements Test
{
    int s = 0;
    public int square(int b)
    {
        logger.info("Inside arithmetic class – implemented method square");
        logger.info("Square of " + " is "+s);
        return s;
    }
    void armeth()
    {

        logger.info("Inside method of class Arithmetic");
    }
}

// use the object
class ToTestInt
{
    public static void main(String a[])
    {
        logger.info("calling from ToTestInt class main method");
        Test t = new arithmetic();
        logger.info("created object of test interface – reference Arithmetic class ");
        logger.info("Hence Arithmetic class method square called");
        logger.info("This object cannot call armeth method of Arithmetic class");
        t.square(10);
    }
}
