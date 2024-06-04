package core.basesyntax;

import java.util.Random;

class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5);

        switch (figureType) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(10) + 1);
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(10) + 1,
                        random.nextInt(10) + 1);
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(10) + 1,
                        random.nextInt(10) + 1);
            case 3:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(10) + 1);
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(10) + 1,
                        random.nextInt(10) + 1, random.nextInt(10) + 1);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}


