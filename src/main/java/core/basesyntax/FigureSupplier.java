package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5); // 5 типів фігур

        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                return new Circle(color, random.nextInt(MAX_VALUE));
            case 1:
                return new Square(color, random.nextInt(MAX_VALUE));
            case 2:
                return new Rectangle(color, random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
            case 3:
                return new RightTriangle(color, random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
            case 4:
                return new IsoscelesTrapezoid(
                        color,
                        random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE)
                );
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
