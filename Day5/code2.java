class Animal{
    void cat(){
        System.out.println("i am cat i am an animal");
    }
}
class Mammal extends Animal{
    void parts(){
        System.out.println("i have a mammary gland");
    }
}
class Features extends Mammal{
    void sound(){
        System.out.println("i call u by sounding meow meow");
    }
}

class code2{
    public static void main(String[] args){
Animal C1=new Animal();
C1.cat();
Mammal C2=new Mammal();
C2.parts();
Features C3=new Features();
C3.sound();

    }
}