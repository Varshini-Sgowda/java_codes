class mobile{
    String brand;
    int batterypercentage;
    void charge(int p){
        batterypercentage=Math.min(100,batterypercentage+p);
    }
    void usebattery(int p){
        batterypercentage=Math.max(0,batterypercentage-p);
    }
}
public class hw9{
    public static void main(String[] args){
        mobile i1=new mobile();
        i1.brand="iphone";
        i1.batterypercentage=81;
        i1.charge(45);
        i1.usebattery(25);
        System.out.println(i1.batterypercentage);
    }
}