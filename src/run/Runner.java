package run;

public abstract class Runner {
    private String name;
    private int runLength;
    private int jumpHeight;
    private boolean participation;


    protected abstract void run();

    protected abstract void jump();

    public int getRunLength() {
        return runLength;
    }

    public void setRunLength(int runLength) {
        this.runLength = runLength;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(int jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    public boolean isParticipation() {
        return participation;
    }

    public void setParticipation(boolean participation) {
        this.participation = participation;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }
}
