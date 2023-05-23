public class Customer {
    private String name;
    private String address;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void checkOrder (Order a) {
        if (name.equals(a.name) && address.equals(a.address)) {
            System.out.println("Заказчик и адрес совпадают!");
        } else if (name.equals(a.name) && !address.equals(a.address)){
            System.out.println("Заказчик совпадает, адрес не совпадает!");
        } else if (!name.equals(a.name) && address.equals(a.address)) {
            System.out.println("Заказчик не совпадает, адрес совпадает!");
        } else {
            System.out.println("Не совпадает ни заказчик, ни адрес!");
        }

    }
}
