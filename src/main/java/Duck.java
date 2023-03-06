public class Duck extends Herbivores implements Flyable, Runable{
    public Duck(String nickname){
        super(nickname);
    }

    public String toString(){
        return "I'm duck. " + super.toString() + ". My speed is " + speedOfRun() + ". My fly speed is " + speedOfFly();
    }
    public String say(){
        return "krya-krya";
    }

    @Override
    public int speedOfRun() {
        return 2;
    }

    @Override
    public int speedOfFly() {
        return 50;
    }
}
