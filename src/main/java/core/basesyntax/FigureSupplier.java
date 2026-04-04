package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5);
        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                return new Circle(color, random.nextDouble(10) + 1);
            case 1:
                return new Square(color, random.nextDouble(10) + 1);
            case 2:
                return new Rectangle(color, random.nextDouble(10) + 1, random.nextDouble(10) + 1);
            case 3:
                return new RightTriangle(color, random.nextDouble(10) + 1,
                        random.nextDouble(10) + 1);
            case 4:
                return new IsoscelesTrapezoid(color, random.nextDouble(10) + 1,
                        random.nextDouble(10) + 1, random.nextDouble(10) + 1);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
