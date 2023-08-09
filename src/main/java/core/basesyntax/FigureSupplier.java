package core.basesyntax;

import java.util.Random;

class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Random random = new Random();
        int figureType = random.nextInt(5);

        switch (figureType) {
            case 0:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextDouble() * 10);
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextDouble() * 10,
                        random.nextDouble() * 10);
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextDouble() * 10,
                        random.nextDouble() * 10);
            case 3:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextDouble() * 10);
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextDouble() * 10,
                        random.nextDouble() * 10,
                        random.nextDouble() * 10);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
