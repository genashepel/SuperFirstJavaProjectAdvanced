package homerWork_6;

public class Person {
    String name;
    int age;

    String pol;
    Person(String name, int age, String pol){
        this.name = name;
        this.age = age;
        this.pol = pol;
    }

    String getName(){
        return this.pol + "." + this.name;
    }
}
