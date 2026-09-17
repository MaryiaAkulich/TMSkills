package Figures;


public class Figure {

        String name;

        Figure (String name) {
            this.name = name;
        }
        double getPerimeter() {
                return 0;
            }
        double getArea() {
            return 0;
        }

        @Override
        public String toString() {
            return String.format("%s: площадь = %.2f, периметр = %.2f", name, getArea(), getPerimeter());
        }
    }