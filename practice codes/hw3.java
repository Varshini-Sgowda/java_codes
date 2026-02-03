class Cars{
    String brand,model;
    int price;
    void displaydetails(){
        System.out.println("brand = " + brand + " model = " + model + " price = " + price);
    }
}
public class hw3{
    public void main(String[] main){
        Cars c1=new Cars();
        c1.brand="BMW";
        c1.model="ROLLS ROYCE";
        c1.price=123045000;
        c1.displaydetails();
    }
}