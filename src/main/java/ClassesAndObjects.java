public class ClassesAndObjects {
    public static void main(String[] args) {
        /**
        //__________Код 14 урока Алишева__________

        Person person1 = new Person();
        person1.name = "Роман";         //String name
        person1.age = 50;               //int age
        System.out.println("Меня зовут " + person1.name + "," + " мне " + person1.age + " лет");
        Person person2 = new Person();
        person2.name = "Вова";          //String name для person2
        person2.age = 20;               //int age для person2
        System.out.println("Меня зовут " + person2.name + "," + " мне " + person2.age + " лет");
        **/

        //__________Код 15 урока Алишева__________

        Person person1 = new Person();
        person1.name = "Роман";
        person1.age = 50;
        person1.sayHello();
        Person person2 = new Person();
        person2.name = "Вова";
        person2.age = 20;
        person2.speak();
        person2.sayHello();
    }
}

class Person {
    String name;
    int age;

    void speak(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + "," + " мне " + age + " лет");
        }
    }
    void sayHello(){
        System.out.println("Привет!");
    }
}