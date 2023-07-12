public class Main {
    //设置私有属性访问权限
    String name;//创建对象
    String press;
    String author;
    int price;
    //定义一个带参的构造方法
    public Main(String name, String press, String author, int price){
        this.name=name;//this其实是当前类对象的引用，通过当前这个类实例化的对象的引用来访问对象的成员变量。
        this.press=press;//实例化的对象s1来访问成员变量name,press,author,price
        this.author=author;
        this.price=price;
    }
    public void information(){//类的成员函数,调用方法:对象名.方法名();
        System.out.println("书籍名字:"+name);
        System.out.println("出版社:"+press);
        System.out.println("作者:"+author);
        System.out.println("定价:"+price);
    }
}
class demoMain{
    public static void main(String[] args) {
        Main s1=new Main("Effective Java","机械工业出版社","Joshua Bloch",119); //实例化对象
        s1.information(); //调用information函数
        System.out.println("----------------------------");
        Main s2=new Main("Spring Boot实战","电子工业出版社","汪云飞",89);
        s2.information();
    }
}