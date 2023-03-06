public class ButterFly extends Herbivores implements Runable, Flyable {
    public ButterFly(String nickname){
        super(nickname);
    }

    public String toString(){
        return "I'm butterfly. " + super.toString() + ". My speed is " + speedOfRun() + ". My fly speed is " + speedOfFly();
    }
    public String say(){
        return "phh";
    }

    @Override
    public int speedOfRun() {
        return 1;
    }

    @Override
    public int speedOfFly() {
        return 8;
    }

}
