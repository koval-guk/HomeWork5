package run;

public class Human extends Runner {
    public Human() {
        setName("Human");
        setParticipation(true);
        setJumpHeight(2);
        setRunLength(100);
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
