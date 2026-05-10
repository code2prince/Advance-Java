package Practice.DesignPattern.FactoryDesign;

public interface Payment {
    void pay(double amount);
}

class Upi implements Payment{
    public void pay(double amount){
        System.out.println("Payment by UPI : "+ amount);
    }
}

class Card implements Payment{
    public void pay(double amount){
        System.out.println("Payment by Card : "+ amount);
    }
}


