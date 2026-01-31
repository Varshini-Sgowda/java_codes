public class Person{
    private String Name;
    public int Age;
    public String getName(){
        return Name;
    }
    public void setName(String Name){
 this.Name=Name;
    }

    public int getAge(){
        return Age;
    }
    public void setAge(int Age){
        this.Age=Age;
    }
}
    class code12{
        public static void main(String[] args){
            Person P1=new Person();
            P1.setName("Varshini");
            P1.setAge(20);
            int Age;

            System.out.println(P1.getName());

            System.out.println(P1.getAge());
        }
    }