package lesson14;

public class Run {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Product<Integer, String, Integer> jacket = new Product<>(1234, "jacket", 15);
        Product<Integer, String, Integer> paint = new Product<>(1234, "paint", 23);
        Product<Integer, String, Integer> sneakers = new Product<>(3121, "sneakers", 55);
        Product<Integer, String, Integer> dress = new Product<>(3333, "dress", 42);
        Product<Integer, String, Integer> shirt = new Product<>(3121, "shirt", 43);

        shop.addProduct(jacket);
        shop.addProduct(paint);
        shop.addProduct(sneakers);
        shop.addProduct(dress);
        shop.addProduct(shirt);

//        shop.sortingThePriceByIncrease();
        System.out.println("****************");
//        shop.sortingThePriceByDescending();
    }
}
