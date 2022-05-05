package LinkedList;

class Main2 {
    // static variables a and b
    static int a = 10;
    static int b;

    static void printStatic() {
        a = a / 2;
        b = a;

        System.out.println("printStatic::Value of a : " + a + " Value of b : " + b);
    }

    public static void main(String[] args) {

        printStatic();
        b = a * 5;
        a++;

        System.out.println("main::Value of a : " + a + " Value of b : " + b);
    }
}