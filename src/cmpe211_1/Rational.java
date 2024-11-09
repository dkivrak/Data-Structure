package cmpe211;

public class Rational {
    private long numerator;
    private long denominator;

    public Rational(long numerator, long denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator can't be zero.");
        }

        long gcd = gcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;

        if (this.denominator < 0) {
            this.numerator = -this.numerator;
            this.denominator = -this.denominator;
        }
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public Rational plus(Rational b) {
        long newNumerator = this.numerator * b.denominator + b.numerator * this.denominator;
        long newDenominator = this.denominator * b.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational minus(Rational b) {
        long newNumerator = this.numerator * b.denominator - b.numerator * this.denominator;
        long newDenominator = this.denominator * b.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational times(Rational b) {
        long newNumerator = this.numerator * b.numerator;
        long newDenominator = this.denominator * b.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational divides(Rational b) {
        if (b.numerator == 0) {
            throw new IllegalArgumentException("Denominator can't be zero.");
        }
        long newNumerator = this.numerator * b.denominator;
        long newDenominator = this.denominator * b.numerator;
        return new Rational(newNumerator, newDenominator);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) 
        return false;
		return false;
    }

    
    public String toString() {
        return numerator + "/" + denominator;
    }
}
