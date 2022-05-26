package homerWork_6;

public class Person {
    private String name;
    private int age;
    private char gender;

    Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


    String getName() {
        if (gender == 'M') {
            return "Mr." + name;
        } else {
            return "Mrs." + name;
        }
    }

    Person minAgePerson(Person[] arr) {
        Person min = null;
        for (int i = 0; i < arr.length; i++) {
            if (min == null || min.age > arr[i].age) {
                min = arr[i];
            }
        }
        return min;
    }
}

