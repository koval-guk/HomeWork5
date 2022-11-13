public class EquilateralTriangle implements GeometricFigure {
    private double side;
    private static final double FORMULA_COEFFICIENT = Math.sqrt(3)/4;
    public EquilateralTriangle(double side) {
        this.side = Math.abs(side);
    }

    @Override
    public double area() {
        return side * side * FORMULA_COEFFICIENT;
    }
}
