class Study{
    int id;
    String name;
    int age;
    Study(int a, String b,int c){
        id=a;
        name=b;
        age=c;
        System.out.println(id+name+age);
    }
    Study(int a,int b){
        id=a;
        age=b;
        System.out.println(id+" b "+age);

    }

}
public class code11{
public static void main(String[] args){
Study S1 =new Study(1 ," Varshini ",20);
Study S2=new Study(2,10);
}
}
    
