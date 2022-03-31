package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();

    public FigureType getRandomFigureType() {
        int index = random.nextInt(FigureType.values().length);
        return FigureType.values()[index];
    }

    public Figure getRandomFigure(FigureType figureType) {
        switch (figureType) {
            case SQUARE:
                return new Square(random.nextInt(50));
            case RECTANGLE:
                return new Rectangle(random.nextInt(50), random.nextInt(50));
            case CIRCLE:
                return new Circle(random.nextInt(50));
            case RIGHT_TRIANGLE:
                return new RightTriangle(random.nextInt(50), random.nextInt(50));
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(random.nextInt(50), random.nextInt(50),
                        random.nextInt(50));
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE,10);
    }
}
