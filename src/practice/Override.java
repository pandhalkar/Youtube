package practice;

class a {
    public int a;

    public void meth1() {
        System.out.println("First");
    }

    public int meth2() {
        return 5;
    }

    public void meth3() {
        System.out.println("Second");
    }
}

class b extends a {
    public void meth3() {
        System.out.println("From Another");
    }

    public int meth4() {
        return 10;
    }
}

public class Override {
    public static void main(String[] args) {
        a ref = new a();
        ref.meth1();
    }
}
