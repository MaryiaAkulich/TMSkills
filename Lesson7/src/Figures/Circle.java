package Figures;

class Circle extends Figure {
    private final double radius;

    public Circle(double radius) {
        super("Круг");
        this.radius = radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius; // длина окружности
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}