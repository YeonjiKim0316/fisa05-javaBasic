package computerInterface;


public class Main {
    public static void main(String[] args) {
        Desktop myDesktop = new Desktop();
        myDesktop.run();

        System.out.println("--------------------------");

        Laptop myLaptop = new Laptop();
        myLaptop.run();

    }
}
