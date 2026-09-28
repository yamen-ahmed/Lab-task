class Phone {
    String model;
    int storageGB;
    double price;

    Phone(String model, int storageGB, double price) {
        this.model = model;
        this.storageGB = storageGB;
        this.price = price;
    }
}

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("Nasar pro max", 512, 50000);

        System.out.println("Model: " + phone.model);
        System.out.println("Storage in GB: " + phone.storageGB);
        System.out.println("Price: " + phone.price);
    }
}
