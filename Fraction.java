public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            this.numerator = 0;
            this.denominator = 1;
        } else {
            if (denominator < 0) {
                numerator = -numerator;
                denominator = -denominator;
            }
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    public Fraction(String fractionString) {
        if (fractionString == null) {
            this.numerator = 0;
            this.denominator = 1;
            return;
        }

        String[] parts = fractionString.trim().split("/");
        if (parts.length != 2) {
            this.numerator = 0;
            this.denominator = 1;
            return;
        }

        try {
            int num = Integer.parseInt(parts[0].trim());
            int den = Integer.parseInt(parts[1].trim());
            if (den == 0) {
                this.numerator = 0;
                this.denominator = 1;
            } else {
                if (den < 0) {
                    num = -num;
                    den = -den;
                }
                this.numerator = num;
                this.denominator = den;
            }
        } catch (NumberFormatException e) {
            this.numerator = 0;
            this.denominator = 1;
        }
    }

    public String getFraction() {
        return numerator + "/" + denominator;
    }

    public double getDecimal() {
        double decimal = numerator / (double) denominator;
        return Math.round(decimal * 10000d) / 10000d;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        return getFraction() + " or " + String.format("%.4f", getDecimal());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fraction)) {
            return false;
        }
        Fraction other = (Fraction) obj;
        return this.numerator * other.denominator == other.numerator * this.denominator;
    }
}
