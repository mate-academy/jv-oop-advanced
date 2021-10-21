package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private Random random = new Random();

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), 10);
    }

    private int getNumber() {
        return random.nextInt(10);
    }

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        int figureNumber = random.nextInt(NUMBER_OF_FIGURES);
        switch (figureNumber) {
            case 0:
                return new Circle(color, getNumber());
            case 1:
                return new Rectangle(color, getNumber(), getNumber());
            case 2:
                return new Square(color, getNumber());
            case 3:
                return new RightTriangle(color, getNumber(), getNumber());
            case 4:
                return new IsoscelesTrapezoid(color, getNumber(), getNumber(), getNumber());
            default:
                return getDefaultFigure();
        }
    }
}
