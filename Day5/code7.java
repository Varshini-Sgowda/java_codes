abstract class shape{
    abstract void draw();
    void message(){
        System.out.println("shape as sides");
    }
}
class circle extends shape{
    void draw(){
        System.out.println("shapes can be drawn");
    }
}
class code7{
    public static void main(String[] args){
        circle cl=new circle();
        cl.draw();
        cl.message();
    }
}
































































