class Books{
    String title,author;
    int price;
    void display(){
        System.out.println("title = " + title + "author = " + author + "price = " + price);
    }
}
public class hw7{
    public static void main(String[] args){
        Books B1=new Books();
        B1.title="Twisted love";
        B1.author="xxx";
        B1.price=780;
      Books B2=new Books();  
        B2.title="Hunting adraline";
        B2.author="yyy";
        B2.price=670;
        Books B3=new Books();
        B3.title="art of being alone";
        B3.author="zzz";
        B3.price=550;
        B1.display();
        B2.display();
        B3.display();
    }
}