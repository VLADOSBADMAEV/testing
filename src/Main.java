public class Main {
    public static void main(String[] args) {
        SalesManager manager = new SalesManager(new long[]{1, 2, 6, 200});

        System.out.println(manager.max());
        System.out.println(manager.getAverageSale());
    }
}