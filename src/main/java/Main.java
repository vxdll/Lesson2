import java.util.List;

public class Main {
    public static void main(String[] args) {
        Zoo zoopark = new Zoo();
        zoopark.addAnimals(List.of(new Cat("Amber"), new Dog("Zeus"), new Rabbit("Ghost"),new Cow("Friday"), new Duck("Donald"), new ButterFly("Ice"), new Shark("Bob"), new Whale("Rick")));
        for (Sayable item: zoopark.getSayable()) {
            System.out.println(item.say());
        }
        System.out.println("----------------------------");
        for (Runable item: zoopark.getRunAble()) {
            System.out.println(item);
        }
        System.out.println("----------------------------");
        for (Flyable item: zoopark.getFlyAble()) {
            System.out.println(item);
        }
        System.out.println("------------Чемпион по бегу------------");
        System.out.println(zoopark.getWinner());
        System.out.println("------------Чемпион по скорости полета------------");
        System.out.println(zoopark.getWinnerFly());
        System.out.println("------------Чемпион по плаванию------------");
        System.out.println(zoopark.getWinnerSwim());
    }
}
