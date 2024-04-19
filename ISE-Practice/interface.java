interface A {
    void mai();
    int cd = 9;
    String dd = "Pratham";
}

interface B {
    int mai();
    int c = 10;
    String d = "P";
}

class C implements A, B {
    public int mai() {
        System.out.println("In mai C");
        return 1;
    }
}

class D implements A, B {
    public void mai() {
        System.out.println("In mai D");
    }
}

class K {
    public static void main(String args[]) {
        C g = new C();
        g.mai();
        System.out.println(B.c); // Accessing interface constant c from interface B
        System.out.println(B.d); // Accessing interface constant d from interface B
        D l = new D();
        l.mai();
    }
}

