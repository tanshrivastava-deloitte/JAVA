package org.example;

import classes.Fraction;
import utilities.Log;

import java.util.logging.Logger;

public class Main {
    private static Logger logger=Logger.getLogger(String.valueOf(Main.class));
    public static void main(String[] args) {
        logger.info("Start");
        Fraction fraction1=new Fraction(46,2.3);
        logger.info(fraction1.display());
        Fraction fraction2=new Fraction(5.6,3.3);
        logger.info(fraction2.display());
        Fraction fraction3=new Fraction(24,5);
        logger.info(fraction3.display());
        Fraction fraction4=new Fraction(5.3,2);
        logger.info(fraction4.display());
    }
}