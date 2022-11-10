package run;

public abstract class Obstacle {
    private int obstacleSize;
    private String name;

    protected abstract void overcome(Runner runner);

    protected int getObstacleSize() {
        return obstacleSize;
    }

    protected void setObstacleSize(int obstacleSize) {
        this.obstacleSize = obstacleSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
