package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random rand = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final int Max = 11;

    public Figure getRandomFigure() {
        Figures figure = Figures.values()[rand.nextInt(Figures.values().length)];

        switch (figure) {
            case TRIANGLE:
                return new RightTriangle(
                    colorSupplier.getRandomColor(),
                    rand.nextInt(Max),
                    rand.nextInt(Max));
            case TRAPEZOID:
                return new IsoscelesTrapezoid(
                    colorSupplier.getRandomColor(),
                    rand.nextInt(Max),
                    rand.nextInt(Max),
                    rand.nextInt(Max));
            case CIRCLE:
                return new Circle(
                    colorSupplier.getRandomColor(),
                    rand.nextInt(Max));
            case SQUARE:
                return new Square(
                    colorSupplier.getRandomColor(),
                    rand.nextInt(Max));
            case RECTANGLE:
                return new Rectangle(
                    colorSupplier.getRandomColor(),
                    rand.nextInt(Max),
                    rand.nextInt(Max));
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.name().toLowerCase(), 10);
    }
}
