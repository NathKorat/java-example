package classObject;

public class ConExp {
    String name;
    int gender;
    int age;
    static int counter = 0;

    // defualt constructor
    public ConExp(){
        this.name = "Mno";
        this.gender = 0;
        this.age = 22;
        counter ++;
    }

    // Overloaded Constructor
    public ConExp(String name, int gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
        counter ++;
    }


    public String getName() {
        return name;
    }

    public int getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
    public static int getCounter() {
        return counter;
    }
}
