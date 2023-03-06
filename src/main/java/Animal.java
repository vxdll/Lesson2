public abstract class Animal implements Sayable{
    public String nickname;

    public Animal(String nickname){
        this.nickname = nickname;
    }

    public abstract String feed();
    public abstract String say();
    public String toString(){
        return "My nickname is " + nickname;
    }

}
