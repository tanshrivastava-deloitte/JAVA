package classes;

public class Fraction {
    double denominator, numerator;
    public Fraction(int number1,int number2){
        this.numerator=number1;
        this.denominator=number2;
    }
    public Fraction(int number1,double number2){
        this.numerator=number1;
        this.denominator=number2;
    }
    public Fraction(double number1,int number2){
        this.numerator=number1;
        this.denominator=number2;
    }
    public Fraction(double number1,double number2){
        this.numerator=number1;
        this.denominator=number2;
    }
    public String display(){
        double fraction= numerator/denominator;
        return String.valueOf(fraction);
    }
}
