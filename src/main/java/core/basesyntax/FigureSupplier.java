package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private Figures[] figures = Figures.values();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(figures.length);
        String randomColor = colorSupplier.getRandomColor();
        switch (figures[randomIndex]) {
            case CIRCLE:
                return new Circle(randomColor, random.nextDouble());
            case SQUARE:
                return new Square(randomColor, random.nextDouble());
            case RECTANGLE:
                return new Rectangle(randomColor, random.nextDouble(), random.nextDouble());
            case RIGHT_TRIANGLE:
                return new RightTriangle(randomColor, random.nextDouble(), random.nextDouble());
            default:
                return new IsoscelesTrapezoid(randomColor, random.nextDouble(), random.nextDouble(), random.nextDouble());
        }

    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }
}
