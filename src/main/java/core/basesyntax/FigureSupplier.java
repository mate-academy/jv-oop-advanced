package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        double value1 = Math.random() * 10;
        double value2 = Math.random() * 10;
        double value3 = Math.random() * 10;

        switch (figureNumber) {
            case 1:
                Figure square = new Square(value1);
                return square;
            case 2:
                Figure rectangle = new Rectangle(value1, value2);
                return rectangle;
            case 3:
                Figure rightTriangle = new RightTriangle(value1, value2);
                return rightTriangle;
            case 4:
                Figure circle = new Circle(value1);
                return circle;
            default:
                Figure isoscelesTrapezoid = new IsoscelesTrapezoid(value1, value2, value3);
                return isoscelesTrapezoid;
        }
    }
}
