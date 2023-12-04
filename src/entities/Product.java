package entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    //MÉTODOS CONSTRUTORES
    /*
     * - executa no momento da instaciação do objeto
     * - não há retorno
     * - necessita receber dados como parâmetros
     *
     * obs.:
     * this -> refere-se ao ATRIBUTO do OBJETO
     * não confunda atributo do objeto e parâmetro do método
     */

    //MÉTODO CONSTRUTOR
    public Product() {
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
