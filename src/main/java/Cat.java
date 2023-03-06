public class Cat extends Predator implements Runable{
    public Cat(String nickname){
        super(nickname);
    }

    public String toString(){
        return "I'm cat. " + super.toString() + ". My speed is " + speedOfRun();
    }
    public String say(){
        return "meow";
    }

    @Override
    public int speedOfRun() {
        return 15;
    }
}
