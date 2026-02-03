class Rectangle{
    int length,width;
    int area(){
        return length*width;
    }
    int perimeter(){
        return 2*(length+width);
    }
}
       public class hw2{
        public static void main(String[] args){
            Rectangle r1=new Rectangle();
            r1.length=10;
            r1.width=20;
            System.out.println("area =" +r1.area());
            System.out.println("perimeter=" +r1.perimeter());
        }
    }

