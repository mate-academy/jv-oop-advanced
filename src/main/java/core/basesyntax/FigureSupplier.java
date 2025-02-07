package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int figureType = random.nextInt(5);

        switch (figureType) {
            case 0:
                return new Square(color, random.nextInt(10) + 1);
            case 1:
                return new Rectangle(color, random.nextInt(10) + 1, random.nextInt(10) + 1);
            case 2:
                return new RightTriangle(color, random.nextInt(10) + 1, random.nextInt(10) + 1);
            case 3:
                return new Circle(color, random.nextInt(10) + 1);
            case 4:
                return new IsoscelesTrapezoid(color, random.nextInt(10) + 1, random.nextInt(10) + 1, random.nextInt(10) + 1);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
