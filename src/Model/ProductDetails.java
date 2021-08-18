package Model;

public class ProductDetails {
    private String name;
    private Long id;
    private String description;
    private Float price;

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Float getPrice() {
        return price;
    }

    public ProductDetails(String name, Long id,String description, Float price) {
        this.name = name;
        this.id = id;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return this.id + " | " + this.name + " | " + this.description + " | " + this.price;
    }


}
