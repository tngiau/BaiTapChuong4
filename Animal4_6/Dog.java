package Animal4_6;

public class Dog extends Mammal{
    public Dog(String name) {
        super(name);
    }
    @Override
    public String getName(){
        return "Mando";
    }

    public void greets(){
        System.out.println("Woof");
    }

    public void greets(Dog another){
        System.out.println("Woooooof");
    }

    public String toString(){
        return "Dog ["+super.toString()+"]";
    }
}

