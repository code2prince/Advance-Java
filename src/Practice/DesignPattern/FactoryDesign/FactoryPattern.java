package Practice.DesignPattern.FactoryDesign;

public class FactoryPattern {

  /*  public static Payment getPaymentType(String type){
        if(type.equalsIgnoreCase("UPI")){
            return new Upi();
        }else if(type.equalsIgnoreCase("CARD")){
            return new Card();
        }else {
            return null;
        }
    }
   */
   // can also handle with switch case
    public static Payment getPaymentType(String type){
        switch (type.toUpperCase()){
            case "UPI": return new Upi();
            case  "CARD": return new Card();
            default: throw new IllegalArgumentException("Unknown Type: " + type);
        }
    }

    public static void main(String[] args) {
        Payment p=getPaymentType("upi");
        p.pay(500);

        Payment obj=getPaymentType("card");
        obj.pay(300);

        System.out.println(p.hashCode());  //999966131
        System.out.println(obj.hashCode()); //1989780873

        Payment test=getPaymentType("test");
        test.pay(100);
    }
}
