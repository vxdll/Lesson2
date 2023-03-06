public class Shark extends Predator implements Runable, Flyable, Swimable{
    public Shark(String nickname){
        super(nickname);
    }

    public String toString(){
        return "I'm Shark. " + super.toString() + ". My speed is " + speedOfRun() + ". My fly speed is " + speedOfFly() + ". But my \n" +
                "swimming speed " + speedOfSwim();
    }
    public String say(){
        return "RRRRRRRR";
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
        return 18;
    }
}
