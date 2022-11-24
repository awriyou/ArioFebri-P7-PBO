public class Outer {
    int number = 0;


    void outerMethod(){
        class Inner{
                public void print(){
                System.out.println("Mengakses inner class yang ke- " + (number++));
            }
        }
        Inner in = new Inner();
        in.print();
    }
}


class OuterAccess{
    public static void main(String[] args) {
        Outer out = new Outer();
        out.outerMethod();
        out.outerMethod();
    }
}