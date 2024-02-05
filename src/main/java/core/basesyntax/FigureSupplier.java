package core.basesyntax;

import java.util.Random;

class FigureSupplier {
    private ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        Random random = new Random();
        int figureType = random.nextInt(5);

        switch (figureType) {
            case 0:
                return new Square(random.nextDouble() * 10 + 1, colorSupplier.getRandomColor());
            case 1:
                return new Rectangle(random.nextDouble() * 10 + 1, random.nextDouble() * 10
                        + 1, colorSupplier.getRandomColor());
            case 2:
                return new RightTriangle(random.nextDouble() * 10
                        + 1, random.nextDouble() * 10 + 1, colorSupplier.getRandomColor());
            case 3:
                return new Circle(random.nextDouble() * 10 + 1, colorSupplier.getRandomColor());
            case 4:
                return new IsoscelesTrapezoid(random.nextDouble() * 10
                        + 1, random.nextDouble() * 10 + 1, random
                        .nextDouble() * 10 + 1, colorSupplier.getRandomColor());
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
