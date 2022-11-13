import java.util.Random;

public class GeometricMain {
    public static void main(String[] args) {
        GeometricFigure[] figureArray = new GeometricFigure[10];
        Random random = new Random();
        int figureType;
        for (int i = 0; i < figureArray.length; i++) {
            figureType = random.nextInt(3);
            if (figureType == 0) {
                figureArray[i] = new Square(random.nextInt(10) + random.nextDouble());
            } else if (figureType == 1) {
                figureArray[i] = new Circle(random.nextInt(10) + random.nextDouble());
            } else {
                figureArray[i] = new EquilateralTriangle(random.nextInt(10) + random.nextDouble());
            }
            System.out.println(figureArray[i].getClass() + " " + figureArray[i].area());
        }
        System.out.println("total area is " + areaSum(figureArray));
    }

    public static double areaSum(GeometricFigure[] figureArray) {
        double sum = 0;
        for (GeometricFigure figure : figureArray) {
            sum = sum + figure.area();
        }
        return Math.ceil(sum * Math.pow(10, 3)) / Math.pow(10, 3);
    }

}
