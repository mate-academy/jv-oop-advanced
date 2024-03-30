package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_TYPES = 5;
    public static final int MAX_SIDE_LEN = 100;
    private static final Random random = new Random();

    public Figure getRandomFigure() {
        int choice = random.nextInt(FIGURE_TYPES);
        int side1 = random.nextInt(MAX_SIDE_LEN) + 1;
        int side2 = random.nextInt(MAX_SIDE_LEN) + 1;
        int side3 = random.nextInt(MAX_SIDE_LEN) + 1;

        switch (choice) {
            case 0:
                return new Circle(side1);
            case 1:
                return new Square(side1);
            case 2:
                return new Rectangle(side1, side2);
            case 3:
                return new RightTriangle(side1, side2);
            default:
                return new IsoscelesTrapezoid(side1, side2, side3);
        }
    }

    public static Figure getDefaultFigure() {
        Figure defaultFigure = new Circle(10);
        defaultFigure.setColor("white");
        return defaultFigure;
    }
}
