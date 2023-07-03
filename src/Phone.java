// create new file
public class Phone implements Comparable<Phone> {
    // new block
    String name;
    String modelName;
    int price;
    // new block
    public Phone(String name, String modelName, int price) {
        this.name = name;
        this.modelName = modelName;
        this.price = price;
    }
    // new block
    @Override
    public String toString() {
        return "Phone: " + modelName +", price: " + price;
    }
    // new block
    @Override
    public int compareTo(Phone o) {
        return this.price - o.price;
    }
}   // final this file