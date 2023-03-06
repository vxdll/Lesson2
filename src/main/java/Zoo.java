import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private Radio radio = new Radio();
    List<Animal> animals = new ArrayList<>();

    public List<Animal> addAnimals(List<Animal> animals) {
        this.animals.addAll(animals);
        return this.animals;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Sayable> getSayable() {
        List<Sayable> result = new ArrayList<>();
        for (Animal item : animals) {
            result.add(item);
        }
        result.add(radio);
        return result;
    }

    public List<Runable> getRunAble() {
        List<Runable> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Runable) {
                result.add((Runable) item);
            }
        }
        return result;
    }

    public List<Flyable> getFlyAble() {
        List<Flyable> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Flyable) {
                result.add((Flyable) item);
            }
        }
        return result;
    }
    public List<Swimable> getSwimAble() {
        List<Swimable> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Swimable) {
                result.add((Swimable) item);
            }
        }
        return result;
    }
    public Swimable getWinnerSwim() {
        List<Swimable> swimanimals = getSwimAble();
        Swimable winner = swimanimals.get(0);
        for (Swimable item : swimanimals) {
            if (winner.speedOfSwim() < item.speedOfSwim()) {
                winner = item;
            }
        }
        return winner;
    }

    public Runable getWinner() {
        List<Runable> runanimals = getRunAble();
        Runable winner = runanimals.get(0);
        for (Runable item : runanimals) {
            if (winner.speedOfRun() < item.speedOfRun()) {
                winner = item;
            }
        }
        return winner;
    }

    public Flyable getWinnerFly() {
        List<Flyable> flyanimals = getFlyAble();
        Flyable winner = flyanimals.get(0);
        for (Flyable item : flyanimals) {
            if (winner.speedOfFly() < item.speedOfFly()) {
                winner = item;
            }
        }
        return winner;
    }
}

