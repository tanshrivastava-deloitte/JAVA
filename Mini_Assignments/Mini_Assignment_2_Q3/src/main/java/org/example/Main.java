package org.example;

import classes.Numpy;

import static classes.Numpy.logger;

public class Main {
    public static void main(String[] args) {
        {
            Numpy mynum = new Numpy();
            double d = 199;
            logger.info(" The given numbers are 108.0d and 249");
            logger.info("isZero " + mynum.isZero());
            logger.info("isPositive " + mynum.isPositive());
            logger.info("isNegative" + mynum.isNegative());
            logger.info("isOdd " + mynum.isodd());
            logger.info("isEven " + mynum.isEven());
            logger.info(" isPrime " + mynum.isPrime());
            logger.info("getFactorial " + mynum.getFactorial());
            logger.info("getReverse " + mynum.getReverse());
            mynum.dispBinary();
            logger.info(" isPrime " + mynum.isPrime());
        }
    }
}