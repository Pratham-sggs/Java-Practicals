class Engineeringcalci {
    float Numerator, Denominator, r, i, result;

    public Engineeringcalci(float Numerator, float Denominator) {
        this.Numerator = Numerator;
        this.Denominator = Denominator;
        Evaluate();
        result = getresult(Numerator, Denominator);
    }

    public void Evaluate() {
        if (Numerator > Denominator) {
            r = Numerator % Denominator;
            i = (Numerator - r) / Denominator;
            if (r == 0) {
                Denominator = 0;
            }
        } else {
            r = Denominator % Numerator;
            if (r == 0) {
                Denominator = Denominator / Numerator;
                r = 1;
                i = 0;
            } else {
                i = 0;
                r = Numerator;
            }
        }
    }

    public float getresult(float Numerator, float Denominator) {
        return Numerator / Denominator;
    }

    public static void main(String[] args) {
        Engineeringcalci Hello = new Engineeringcalci(13, 4);
        System.out.println(Hello);
    }

    public String toString() {
        return i + ", " + r + ", " + Denominator + " Exact value: " + result;
    }
}

