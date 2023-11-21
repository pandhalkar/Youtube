package Toutube;

interface C {
    int sum(int a, int b);
}

// Implement the interface C in Class A.
class A implements C {
    private int m;
    private int n;

    public A(int m, int n) {
        this.m = m;
        this.n = n;
    }

    // Implementation of the sum method from the interface C.
    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    // Method to calculate and return the product of m and n.
    public int multiply() {
        return m * n;
    }
}

// Class B with class-level integer variables x and y, initialized via constructor.
class B {
    private int x;
    private int y;

    public B(int x, int y) {
        this.x = x;
        this.y = y;
    }

    
    public static void main(String[] args) {
        // Create an instance of Class A and an instance of Class B.
        A objA = new A(10, 23);
        B objB = new B(10, 23);

        // Call the sum method from Class A and print the result.
        int sumResult = objA.sum(objB.x, objB.y);
        System.out.println("Sum of x and y: " + sumResult);

        // Call the multiply method from Class A and print the result.
        int multiplyResult = objA.multiply();
        System.out.println("Multiplication of m and n: " + multiplyResult);
    }
}
