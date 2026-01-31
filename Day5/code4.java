  class Animal{
    void human(){
        System.out.println("i am human i am an animal");
    }
}
class Charater extends Animal{
    @Override
    void human(){
        System.out.println("i can speak ");
    }
}
class code4{
    public static void main(String[] args){
Animal C1=new Animal();
C1.human();
Charater C2=new Charater();
C2.human();

    }
}