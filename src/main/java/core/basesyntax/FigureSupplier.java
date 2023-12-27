package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAXIMUM_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(Figures.values().length);
        Figures figure = Figures.values()[index];
        String color = colorSupplier.getRandomColor().name();
        int number = random.nextInt(MAXIMUM_NUMBER);
        switch (figure) {
            case square:
                return new Square(number, color);
            case rectangle:
                return new Rectangle(number, number, color);
            case rightTriangle:
                return new RightTriangle(number, number, color);
            case circle:
                return new Circle(number, color);
            default:
                return new IsoscelesTrapezoid(number, number, number, color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
