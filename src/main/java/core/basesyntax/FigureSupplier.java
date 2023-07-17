package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        Random random = new Random();
        int index = random.nextInt(5);
        switch (index) {
            case 0:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(10) + 1);
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(10) + 1, random.nextInt(10) + 1);
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(10) + 1, random.nextInt(10) + 1);
            case 3:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(10) + 1);
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(10) + 1, random.nextInt(10) + 1, random.nextInt(10) + 1);
            default:
                throw new IllegalArgumentException("Invalid figure index");
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("White", 10);
    }
}

