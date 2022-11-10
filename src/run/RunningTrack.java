package run;

public class RunningTrack extends Obstacle {
    public RunningTrack() {
        setName("RunningTrack");
        setObstacleSize(500);
    }

    @Override
    protected void overcome(Runner runner) {
        if (runner.isParticipation() && runner.getRunLength() >= getObstacleSize()) {
            runner.run();
            System.out.print(" over the " + getName() + " " + getObstacleSize() + " meters distance. ");
            System.out.print("Obstacle overcome.");
        } else if (runner.isParticipation()) {
            runner.run();
            runner.setParticipation(false);
            System.out.print(" over the " + getName() + " " + getObstacleSize() + " meters distance. ");
            System.out.print("Obstacle not overcome, " + (getObstacleSize() - runner.getRunLength()) + " meters left.");
        } else {
            System.out.print(runner.getName() + " is over.");
        }
        System.out.println();
    }
}
