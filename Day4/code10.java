class Student{

    int id;
    String name;
    Student(int id,String name){
        this.name = name;
        this.id=id;
    }
void display(){
    System.out.println(id+" "+ name);
}
}
class code10{
    public static void main(String[] args){
        Student S1=new Student(1,"Varshini");
        Student S2=new Student(2,"Spoorthi");
        S1.display();
        S2.display();
    }
}