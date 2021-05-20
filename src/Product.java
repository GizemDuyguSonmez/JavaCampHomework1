public class Product {
    //ozellik sinifi

    private int id;
    private String name;
    private double price;

    public Product(){
        id = 0;
        name = "no-name yet.";
        price = 0;
    }
    public Product(int id, String name, double price){
        setId(id);
        this.name = name;
        setPrice(price);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id < 0){
            System.out.println("Bir hata olustu! Urun numarasi sifirdan kucuk olamaz... ");
        }else {
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0){
            System.out.println("Bir hata oluÅŸtu! Urun fiyati sifirdan kucuk olamaz...");
        }else{
            this.price = price;
        }
    }
}
