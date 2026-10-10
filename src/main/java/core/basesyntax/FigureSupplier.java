package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private String color = colorSupplier.getRandomColor();
    private int number = random.nextInt(100) + 1;

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);

        switch (figureNumber) {
            case 0:
                return new Square(color, number);
            case 1:
                return new Rectangle(color, number, number);
            case 2:
                return new RightTriangle(color, number, number);
            case 3:
                return new Circle(color, number);
            case 4:
                return new IsoscelesTrapezoid(color, number, number, number);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("White", 10);
    }

}
