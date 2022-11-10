package run;

public class Robot extends Runner{
    public Robot() {
        setName("Robot");
        setParticipation(true);
        setJumpHeight(10);
        setRunLength(1000);
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
