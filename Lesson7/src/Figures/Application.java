package Figures;


public class Application {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = new Triangle(3, 4, 5);
        figures[1] = new Triangle(6, 8, 10);
        figures[2] = new Rectangle(4, 6);
        figures[3] = new Rectangle(10, 2);
        figures[4] = new Circle(5);

        for (Figure figure : figures) {
            System.out.println(figure);
        }
        double totalPerimeter = 0;
        for (Figure figure : figures) {
            totalPerimeter += figure.getPerimeter();
        }

        System.out.printf("Сумма периметров всех фигур = %.2f%n", totalPerimeter);
    }
}