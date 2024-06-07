package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int index = new Random().nextInt(FigureType.values().length);
        FigureType figureName = FigureType.values()[index];
        switch (figureName) {
            case SQUARE:
                return new Square(colorSupplier.getRandomColor(), getRandomSide());
            case CIRCLE:
                return new Circle(colorSupplier.getRandomColor(), getRandomSide());
            case RECTANGLE:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomSide(),
                        getRandomSide());
            case RIGHT_TRIANGLE:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomSide(),
                        getRandomSide());
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomSide(),
                        getRandomSide(), getRandomSide());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE",10);
    }

    public int getRandomSide() {
        Random random = new Random();
        return random.nextInt(18);
    }
}
