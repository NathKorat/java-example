import classObject.*;

public class App {
    public static void main(String[] args) throws Exception {
        CallConExp ex1 = new CallConExp();
        ConExp obj1 = new ConExp("BlaBla", 0, 1000);
        ex1.display();
        System.out.println("Class: " + ConExp.getCounter());

    }
}

class CallConExp{
    Object obj2;
    Object obj3;
    Object obj4;

    CallConExp(){
        this.obj2 = new ConExp();
        this.obj3 = new ConExp("Seakngim", 1, 22);
        this.obj4 = new ConExp("Nath", 0, 22);
    }

    void display(){
        System.out.println("obj2: " + ((ConExp) obj2).getName());
        System.out.println("obj3: " + ((ConExp) obj3).getName());
        System.out.println("obj4: " + ((ConExp) obj4).getName());
    }
}