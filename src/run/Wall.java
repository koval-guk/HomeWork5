package run;

public class Wall extends Obstacle {
    public Wall() {
        setName("Wall");
        setObstacleSize(2);
    }

    @Override
    protected void overcome(Runner runner) {
        if (runner.isParticipation() && runner.getJumpHeight() >= getObstacleSize()) {
            runner.jump();
            System.out.print(" over the " + getName() + " " + getObstacleSize() + " meters high. ");
            System.out.print("Obstacle overcome.");
        } else if (runner.isParticipation()) {
            runner.jump();
            runner.setParticipation(false);
            System.out.print(" over the " + getName() + " " + getObstacleSize() + " meters high. ");
            System.out.print("Obstacle not overcome, " + (getObstacleSize() - runner.getJumpHeight()) + " meters left.");
        } else {
            System.out.print(runner.getName() + " is over.");
        }
        System.out.println();
    }
}
