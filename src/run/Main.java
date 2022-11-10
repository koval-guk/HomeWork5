package run;

public class Main {
    public static void main(String[] args) {
        Runner[] runners = new Runner[]{
                new Human(), new Robot(), new Cat(), new Robot()
        };
        Obstacle[] obstacles = new Obstacle[]{
                new Wall(), new RunningTrack(), new Wall()
        };
        obstacles[2].setObstacleSize(10000);
        obstacles[2].setName("Great Wall");
        runners[3].setName("Megatron");
        runners[3].setJumpHeight(100000);
        int i = 0;
        for (Obstacle obstacle : obstacles) {
            System.out.println("***** Run number " + (i+1)+". The "+obstacles[i].getName()+"! *****");
            i++;
            for (Runner runner : runners) {
                obstacle.overcome(runner);
            }
        }
        System.out.println("*****");
        System.out.print("The winner(s) is ");
        for (Runner runner : runners) {
            if (runner.isParticipation()) {
                System.out.print(runner.getName()+"; ");
            }
        }
    }
}

