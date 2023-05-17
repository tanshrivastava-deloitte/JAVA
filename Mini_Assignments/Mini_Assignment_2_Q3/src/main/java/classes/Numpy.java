package classes;

import java.util.logging.Logger;

public class Numpy {
    private double db1;
    private long lg;
    public static Logger logger=Logger.getLogger(String.valueOf(Numpy.class));

    public Numpy() {
        db1 = 108.0d;
        lg = 249;
    }

    public Numpy(double d, long l) {
        db1 = d;
        lg = 1;
    }

    public boolean isZero() {
        if (db1 == 0.0)
            return true;
        else
            return false;
    }

    public boolean isPositive() {
        if (db1 > 0.0)
            return true;
        else
            return false;
    }

    public boolean isNegative() {
        if (db1 < 0.0)
            return true;
        else
            return false;
    }

    public boolean isodd() {
        if (db1 % 2 != 0.0)
            return true;
        else return false;
    }

    public boolean isEven() {
        if (db1 % 2 == 0.0)
            return true;
        else return false;
    }

    public boolean isPrime() {
        int i, lastn;

        double a;
        boolean flag;
        a = Math.sqrt(lg);
        lastn = (int) a;
        flag = true;
        for (i = 2; i < lastn; i++) {
            if (lg != i) {
                if (lg % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag)
            return true;
        else return false;
    }

    public boolean isAmstrong() {
        if (db1 == 0.0)
            return true;
        else return false;
    }

    public double getFactorial() {
        double d = 1;
        for (int i = 1; i < 9; i++) {
            d += lg % 10;
            lg = lg / 10;
        }
        d += lg;
        return d;
    }

    public double getReverse() {
        double d = 0;
        double temp;
        while (lg > 9) {
            temp = lg % 10;
            d = d * 10 + temp;
            lg = lg / 10;
            logger.info("\n" + temp + "\t" + d + " \t " + lg);
        }
        d = d * 10 + lg;
        logger.info("Inside class" + d);
        return d;
    }

    public void dispBinary() {
        logger.info("ByteValue of lg :" + Long.toBinaryString(lg));
    }
}
