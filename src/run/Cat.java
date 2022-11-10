package run;

public class Cat extends Runner{
    public Cat() {
        setName("Cat");
        setParticipation(true);
        setJumpHeight(3);
        setRunLength(50);
    }

    @Override
    protected void run() {
        System.out.print(getName()+" run");
    }

    @Override
    protected void jump() {
        System.out.print(getName() + " jump");
    }
}
