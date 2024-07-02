package ex06;

public class Document implements Printable {
    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    public static void main(String[] args) {
        Document doc = new Document();
        doc.print();
    }
}
