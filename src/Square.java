public class Square implements GeometricFigure {
    private double side;

    public Square(double side) {
        this.side = Math.abs(side);
    }

    @Override
    public double area() {
        return side * side;
    }
}
