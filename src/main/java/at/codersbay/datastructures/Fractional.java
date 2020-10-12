package at.codersbay.datastructures;

/**
 * A Fractional is a class that consists of a numerator and a denominator
 * e.g.: 1/2, 1/3, 24/37, ..
 */
public class Fractional {

    public Integer numerator;
    public Integer denominator;

    public Fractional(Integer numerator, Integer denominator) {
        // TODO implement to fix tests in FractionalTest1
        if (denominator == null || numerator == null) {
            throw new IllegalArgumentException("You shall not pass null!");
        } else if (denominator == 0) {
            throw new IllegalArgumentException("You shall not divide through zero!");
        } else {
            this.denominator = denominator;
            this.numerator = numerator;
        }
    }

    public Integer getNumerator() {
        // TODO implement to fix tests in FractionalTest1
        return numerator;
    }

    public Integer getDenominator() {
        // TODO implement to fix tests in FractionalTest1
        return denominator;
    }

    public Float asFloat() {
        // TODO implement to fix tests in FractionalTest2
        return (float) numerator / (float) denominator;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO implement to fix tests in FractionalTest3
        Fractional other = (Fractional) obj;
        if (other.denominator == 0 || other.numerator == 0) return true;
        else if (obj == null) return false;
        else if (obj == this) return true;
        else if (other.denominator == denominator && other.numerator == numerator) return true;
        else return false;
    }


    public Fractional multiply(Fractional other) {
        // TODO implement to fix tests in FractionalTest4
        Fractional frac = other;
        return new Fractional(numerator * frac.numerator, denominator * frac.denominator);
    }

    public Fractional multiply(Integer other) {
        // TODO implement to fix tests in FractionalTest4
        Fractional frac = new Fractional(numerator * other, denominator);
        return frac;
    }

    public Fractional divide(Fractional other) {
        // TODO implement to fix tests in FractionalTest5
        return new Fractional(1, 1);
    }

    public Fractional divide(Integer other) {
        // TODO implement to fix tests in FractionalTest5
        //Fractional frac = new Fractional(numerator, denominator * other);
        //return frac;
        return new Fractional(this.numerator * 1, this.denominator * other);

    }

    public Fractional add(Fractional other) {
        // TODO implement to fix tests in FractionalTest6
        return new Fractional(1, 1);
    }

    public Fractional add(Integer other) {
        // TODO implement to fix tests in FractionalTest6
        return new Fractional(1, 1);
    }

    public Fractional subtract(Fractional other) {
        // TODO implement to fix tests in FractionalTest7
        return new Fractional(1, 1);
    }

    public Fractional subtract(Integer other) {
        // TODO implement to fix tests in FractionalTest7
        return new Fractional(1, 1);
    }

}