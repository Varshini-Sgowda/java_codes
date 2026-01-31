class Animal{
    void human(){
        System.out.println("i am human i belong to Animal");
    }
}


class Character extends Animal{
   void  Character(){
        super.human();
        System.out.println("i have the ability to tell what i want");
    }
}
class code6{
    public static void main(String[] args){
Character C1=new Character();
C1.Character();
    }
}