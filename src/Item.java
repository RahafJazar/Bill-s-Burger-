public class Item {
    private String name;
    private String type;
    private double price;
    private String size="Medium";

    public Item(String  type , String  name, double price) {
        this.name = name.toUpperCase();
        this.type = type.toUpperCase();
        this.price = price;
    }

    public String getName() {
        if(type.equals("SIDE")|| type.equals("DRINK")){
            return size + " " +name;
        }
        return name;
    }

    public double getBasePrice(){
        return price;
    }
    public double getAdjustedPrice(){
        return  switch (size){
            //Enhanced switch statement
            case  "SMALL" -> getBasePrice() - 0.5;
            case  "Large" -> getBasePrice() +1;
            default ->  getBasePrice();
        };
    }

    public void setSize(String size) {
        this.size = size;
    }

    public static  void printItem(String name ,double price){
        System.out.printf("%20s: %6.2f %n " ,name,price);
    }
    public void  printItem(){
        printItem(getName(),getAdjustedPrice());
    }
}
