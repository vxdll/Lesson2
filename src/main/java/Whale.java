public class Whale extends Predator implements Runable, Flyable, Swimable {
    public Whale(String nickname){
        super(nickname);
    }

    public String toString(){
        return "I'm Whale. " + super.toString() + ". My speed is " + speedOfRun() + ". My fly speed is " + speedOfFly() + ". But my \n" +
                "swimming speed " + speedOfSwim();
    }
    public String say(){
        return "*Hight Gz sound*";
    }

    @Override
    public int speedOfRun() {
        return 0;
    }

    @Override
    public int speedOfFly() {
        return 0;
    }

    @Override
    public int speedOfSwim() {
        return 37;
    }
}
