class Product {
    String name = "iphone";
    int price = 10000;
    String description = "apple inc";

    public void set_product(String name, int price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String display() {
        return this.name + " " + this.price + " " + this.description;
    }
}
