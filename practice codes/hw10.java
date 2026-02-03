class college{
    String collegename,location;
    void display(){
        System.out.println("collegename = " + collegename + "location = " + location );
    }
}
public class hw10{
    public static void main(String[] args){
        college cl0=new college();
        cl0.collegename="excellent";
        cl0.location="Dk";
        college cl1=new college();
        cl1.collegename="alvas";
        cl1.location="DK";
        college cl2=new college();
        cl2.collegename="Sadvidya";
        cl2.location="mysore";
        cl0.display();
        cl1.display();
        cl2.display();
    }
}