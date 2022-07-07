abstract class Shirt {
    String color;
    Shirt(String c){
        color = c;
    }
    public String getColor(){return color;}
    abstract String getDescription();
}

class TShirt extends Shirt{
    String size;
    Double price;
    TShirt(String c, String s, Double p){
        super(c);
        size = s;
        price = p;
    }
    String getDescription(){
        return color + " " + size + " " + price;
        }
    }

class Jacket extends Shirt{
    String brand;
    Double price;
    Jacket(String c, String b, Double p){
        super(c);
        brand = b;
        price = p;
    }
    String getDescription(){
        return color + " " + brand + " " + price;
    }
public static void main(String[] args) {
    TShirt t = new TShirt("red", "Large", 7.79);
    Jacket j = new Jacket("Black", "Supreme", 10.88);
    System.out.println(t.getDescription());
    System.out.println(j.getDescription());
    System.out.println("Total price is: "+ (t.price+j.price));

}
}