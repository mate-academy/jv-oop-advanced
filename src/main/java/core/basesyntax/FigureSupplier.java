package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANG = 100;
    private static final int MAX_INDEX = 4;
    private static String COLOR;
    private final int randomInd = new Random().nextInt(MAX_INDEX);
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (randomInd) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), new Random().nextInt(MAX_RANG));
            case 1:
                COLOR = colorSupplier.getRandomColor();
                return new IsoscelesTrapezoid(COLOR, new Random().nextInt(MAX_RANG),
                        new Random().nextInt(MAX_RANG), new Random().nextInt(MAX_RANG));
            case 2:
                COLOR = colorSupplier.getRandomColor();
                return new Rectangle(COLOR, new Random().nextInt(MAX_RANG),
                        new Random().nextInt(MAX_RANG));
            case 3:
                COLOR = colorSupplier.getRandomColor();
                return new RightTriangle(COLOR, new Random().nextInt(MAX_RANG),
                        new Random().nextInt(MAX_RANG));
            case 4:
                return new Square(colorSupplier.getRandomColor(), new Random().nextInt(MAX_RANG));
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("White", 10.0);
    }
}
