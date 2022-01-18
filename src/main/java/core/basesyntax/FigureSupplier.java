package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public final static int FIGURES_NUMBER = 4;
    public final static int DEFAULT_VALUE = 10;
    public final static int MAX_VALUE = 20;

    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        switch (random.nextInt(FIGURES_NUMBER)) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE));
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
            case 4:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE));
            default: return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), DEFAULT_VALUE);
    }
}
