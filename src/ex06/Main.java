package ex06;

public class Main {
    public static void main(String[] args) {
        Printable doc = new Document();
        Printable img = new Image();

        doc.print();
        img.print();
    }
}
