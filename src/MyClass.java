import java.util.Arrays;

public class MyClass {

  //  MyClass деген класс тузунуз
//    Ал класста озунуз жонундо маалымат сактаган полелер болсун(атыныз, фамилияныз, жашыныз, Peaksoft то катышкан сабактарыныз(массив), жакшы коргон тамагыныз)
//    Параметри эки башка болгон эки конструктор тузунуз
//    MyClassтын 2 объектисин тузуп, конструктор аркылуу маани бериниз
//    Эки объектке эки башка конструктор иштесин.
//    Объекттердин маанилерин консольго чыгарыныз.

    String firstName;//аты
    String lastName;//фамилиясы
    int age;//жашы
    String favoriteFood;//жактырган тамак
    String[] lessons;//катышкан сабактар

    // Параметри эки башка болгон конструктор1
    public MyClass(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Параметри эки башка болгон конструктор2
    public MyClass(String firstName, String lastName, int age, String[] lesson, String favoriteFood) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.lessons = lesson;
        this.favoriteFood = favoriteFood;
    }

    public void infoDisplay1() {
        System.out.println("FirstName : " + firstName + "\n" + " lastName : " + lastName + "\n" + "age : " + age+"\n");
    }
    public void infoDisplay2(){
        System.out.println("FirstName : " + firstName + "\n" + " lastName : " + lastName + "\n" + "age : " + age);
        System.out.println("lessons : "+ Arrays.toString(lessons)+ "\n" + "FavoriteFood : "+favoriteFood);

    }
}
