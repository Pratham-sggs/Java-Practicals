class Engineeringcalci {
    float a, b, r, i;

    public Engineeringcalci Evaluate(Engineeringcalci obj) {
        if (obj.a > obj.b) {
            obj.r = obj.a % obj.b;
            obj.i = (obj.a - obj.r) / obj.b;
            if (obj.r == 0) {
                obj.b = 0;
            }
            return obj;
        } 
        else {
            obj.r = obj.b % obj.a;
            if (obj.r == 0) {
                obj.b = obj.b / obj.a;
                obj.r = 1;
                obj.i = 0;
            } else {
                obj.i = 0;
                obj.r = obj.a;
            }
            return obj;
        }
    }

    public static void main(String[] args) {
        Engineeringcalci Hello = new Engineeringcalci();
        Hello.a = 23;
        Hello.b = 2;
        Hello = Hello.Evaluate(Hello);
        System.out.println(Hello);
    }

    public String toString() {
        return "Result: " + i + ", " + r + ", " + b;
    }
}

