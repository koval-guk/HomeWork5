public class EquilateralTriangle implements GeometricFigure {
    private double side;

    public EquilateralTriangle(double side) {
        this.side = Math.abs(side);
    }

    @Override
    public double area() {
        return side * side * 0.433;
    }
}
