class Circle{
    double radius;
    double area(){
        return 3.14*radius*radius;
    }
}
public class hw6{
    public void main(String[] args){
        Circle c1=new Circle();
        c1.radius=8.22;
        System.out.println("area = " +c1.area());
    }
}