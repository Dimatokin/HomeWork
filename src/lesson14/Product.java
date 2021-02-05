package lesson14;

public class Product<Id, Name, Price> {

    private Id id;
    private Name name;
    private Price price;

    public Product(Id id, Name name, Price price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name=" + name +
                ", price=" + price +
                '}';
    }
}
