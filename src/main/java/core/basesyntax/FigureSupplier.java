package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();

    public FigureType getRandomFigureType() {
        int index = random.nextInt(FigureType.values().length);
        return FigureType.values()[index];
    }

    public Figure getRandomFigure(FigureType figureType) {
        int randomInt = random.nextInt(50);
        Color color = new ColorSupplier().getRandomColor();
        switch (figureType) {
            case SQUARE:
                return new Square(color, randomInt);
            case RECTANGLE:
                return new Rectangle(color, randomInt, randomInt);
            case CIRCLE:
                return new Circle(color, randomInt);
            case RIGHT_TRIANGLE:
                return new RightTriangle(color, randomInt, randomInt);
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(color, randomInt, randomInt, randomInt);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE,10);
    }
}
