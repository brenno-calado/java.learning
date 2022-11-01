package chapter4;

public class Pwr {
    double base;
    int exponent;
    double total = 1;

    Pwr(double base, int exponent) {
        this.base = base;
        this.exponent = exponent;
        if (exponent == 0) return;

        for ( ; exponent > 0; exponent--) {
            this.total *= this.base;
        }
    }

    double getPwr() {
        return this.total;
    }
}
