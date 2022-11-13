public class Circle implements GeometricFigure {
    private double radius;

    public Circle(double radius) {
        this.radius = Math.abs(radius);
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }
}
