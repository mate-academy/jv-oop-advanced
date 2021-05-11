package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        int manyColor = 7;
        String color = new ColorSupplier().getRandomColor(rnd(manyColor));
        int famousFigures = 5;
        int minLength = 1;
        int maxLength = 15;
        int rndFigure = rnd(famousFigures);
        switch (rndFigure) {
            case (0): {
                int side = rnd(minLength, maxLength);
                String name = "square";
                return new Square(name, side, color);
            }
            case (1): {
                int side1 = rnd(minLength, maxLength);
                int side2 = rnd(minLength, maxLength);
                String name = "rectangle";
                return new Rectangle(name, side1, side2, color);
            }

            case (2): {
                int side = rnd(minLength, maxLength);
                int height = rnd(minLength, maxLength);
                String name = "right triangle";
                return new RightTriangle(name, side, height, color);
            }

            case (3): {
                int radius = rnd(minLength, maxLength - 5);
                String name = "circle";
                return new Circle(name, radius, color);
            }

            case (4): {
                int side1 = rnd(minLength, maxLength);
                int side2 = rnd(minLength, maxLength);
                int height = rnd(minLength, maxLength);
                String name = "isosceles trapezoid";
                return new IsoscelesTrapezoid(name, side1, side2, height, color);
            }

            default:
                return null;
        }
    }

    private int rnd(int n) {
        return (new Random()).nextInt(n);
    }

    private int rnd(int begin, int end) {
        return begin + (new Random()).nextInt(end);
    }
}
