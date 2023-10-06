import java.io.ObjectInputStream;

public class Main {
	public static void main(String[] args) {
		Fraction f1 = new Fraction(10, 5);
		Fraction f2 = new Fraction(5, 10);
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		f1.add(f2);
		System.out.println(f1.toString());
		f1.sub(f2);
		System.out.println(f1.toString());
		f2.sub(f1);
		System.out.println(f2.toString());
		f1.multiplication(f2);
		System.out.println(f1.toString());
		f1.division(f2);
		System.out.println(f1.toString());
		f2.division(f1);
		System.out.println(f1.toString());
	}
}

class Fraction {
	private int numerator;
	private int denominator;

	Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;

	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public String toString() {
		int gcd = 1;
		for (int i = 1; i <= Math.abs(Math.min(numerator, denominator)); i++)
			if ((getNumerator() % i == 0) && (getDenominator() % i == 0))
				gcd = i;
		setNumerator(numerator / gcd);
		setDenominator(denominator / gcd);
		if (getNumerator() < 0 && getDenominator() < 0) {
			setNumerator(-1 * getNumerator());
			setDenominator(-1 * getDenominator());
		}
		if (getDenominator() == 1)
			return String.valueOf(getNumerator());
		return getNumerator() + " / " + getDenominator();
	}

	public void add(Fraction fraction) {
		setNumerator(fraction.getDenominator() * getNumerator() + getDenominator() * fraction.getNumerator());
		setDenominator(getDenominator() * fraction.getDenominator());
	}

	public void sub(Fraction fraction) {
		setNumerator(fraction.getDenominator() * getNumerator() - getDenominator() * fraction.getNumerator());
		setDenominator(getDenominator() * fraction.getDenominator());
	}

	public void multiplication(Fraction fraction) {
		setNumerator(getNumerator() * fraction.getNumerator());
		setDenominator(getDenominator() * fraction.getDenominator());
	}

	public void division(Fraction fraction) {
		setNumerator(getNumerator() * fraction.getDenominator());
		setDenominator(getDenominator() * fraction.getNumerator());
	}
}