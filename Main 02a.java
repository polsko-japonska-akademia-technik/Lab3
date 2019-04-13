public class Main {

    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        InvoiceItem test = new InvoiceItem("1","dd", 6, 5.4);
        System.out.println(test.getID());
        test.setUnitPrice(7.9);
        System.out.println(test.toString());

    }
}
