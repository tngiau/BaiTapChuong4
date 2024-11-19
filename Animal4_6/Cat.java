package Animal4_6;

public class Cat extends Mammal {
    public Cat(String name) {
        super(name);
    }
    @Override
    public String getName(){
        return "Mundo";
    }

    public void greets(){
        System.out.println("Meow");
    }

    public String toString(){
        return "Cat["+super.toString()+"]";
    }
}
