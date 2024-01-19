package application;

public class Product {
    public String name;
    public double price;
    public int stock;

    public Product(String name, double price, int stock){
            this.name = name;
            this.stock = stock;
            this.price = price;
    }

    public double getTotalPrice(){
        return this.stock * this.price;
    }

    public void addProducts(int value){
        this.stock = this.stock + value;
    }

    public void removeProducts(int value){

        if(value > this.stock){
            System.out.println("Não é possível remover essa quantidade ");
        }else{
            this.stock = this.stock - value;
        }
    }

    public void printData(){
        System.out.printf("%s, %d unidades, total: R$%.2f %n", this.name, this.stock, this.getTotalPrice());
    }





}
