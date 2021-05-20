public class Main {

    public static void main(String[] args) {
            Product product1 = new Product(1, "Kitap", 15.5);
            Product product2 = new Product(2, "Kalem", 5);
            Product product3 = new Product(3, "Defter", 8.2);

            Product[] products = {product1, product2, product3};
            for (Product product : products) {
                System.out.println("Urun adi: " + product.getName() + " Urun ID: " + product.getId() + " Urun fiyati: " + product.getPrice());
            }

            ProductManager productManager = new ProductManager();
            productManager.add(product1);
            productManager.add(product2);
            productManager.add(product3);

            System.out.println();

            productManager.remove(product1);
            productManager.remove(product2);
            productManager.remove(product3);

        }
    }

