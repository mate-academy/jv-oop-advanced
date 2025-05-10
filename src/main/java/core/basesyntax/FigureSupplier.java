package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MaxLength = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figures getFigure() {
        int index = random.nextInt(Figures.values().length);
        return Figures.values()[index];
    }

    public Figure getRandomFigure() {
        switch (getFigure()) {
            case CIRCLE :
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(MaxLength));
            case SQUARE :
                return new Square(colorSupplier.getRandomColor(), random.nextInt(MaxLength));
            case RIGHT_TRIANGLE :
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(MaxLength),
                        random.nextInt(MaxLength));
            case ISOSCELES_TRAPEZOID :
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MaxLength),
                        random.nextInt(MaxLength), random.nextInt(MaxLength));
            default :
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(MaxLength),
                        random.nextInt(MaxLength));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
