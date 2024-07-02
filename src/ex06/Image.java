package ex06;

public class Image implements Printable {
    @Override
    public void print() {
        System.out.println("Printing image...");
    }

    public static void main(String[] args) {
        Image img = new Image();
        img.print();
    }
}
