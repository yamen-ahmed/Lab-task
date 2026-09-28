class Print {
    String documentName;
    double costPerPage;

    double calculateCost(int pages) {
        return pages * costPerPage;
    }

    double calculateCost(int pages, boolean colorprint) {
        if (colorprint) {
            return pages * costPerPage * 2.5;
        } else {
            return pages * costPerPage;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Print p = new Print();
        p.documentName = "Nasar Publication";
        p.costPerPage = 4.00;

        System.out.println(p.calculateCost(10));
        System.out.println(p.calculateCost(10, true));
    }
}
