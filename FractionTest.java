public class FractionTest {
    public static void main(String[] args) {
        Fraction[] fractions = new Fraction[5];
        fractions[0] = new Fraction();
        fractions[1] = new Fraction(1, 4);
        fractions[2] = new Fraction("2/3");
        fractions[3] = new Fraction(3, 4);
        fractions[4] = new Fraction("4/6");

        System.out.println("Fraction objects:");
        for (Fraction fraction : fractions) {
            System.out.println(fraction.toString());
        }

        Fraction comparisonOne = new Fraction(2, 3);
        Fraction comparisonTwo = new Fraction("4/6");

        System.out.println();
        System.out.println("Comparisons:");
        System.out.println(comparisonOne.getFraction() + " equals " + comparisonTwo.getFraction() + "? " + comparisonOne.equals(comparisonTwo));
        System.out.println(fractions[1].getFraction() + " equals " + fractions[3].getFraction() + "? " + fractions[1].equals(fractions[3]));
    }
}