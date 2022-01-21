package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final int figuresNumber = 5;
    private static final double sideSize = 25.0;

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }

    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();

        switch (random.nextInt(figuresNumber)) {
            case 1:
                return new Circle(colorSupplier.getRandomColor(), random.nextDouble() * sideSize);

            case 2:
                return new Square(colorSupplier.getRandomColor(), random.nextDouble() * sideSize);

            case 3:
                return new Rectangle(colorSupplier.getRandomColor(), random.nextDouble() * sideSize,
                        random.nextDouble() * sideSize);

            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextDouble() * sideSize, random.nextDouble() * sideSize,
                        random.nextDouble() * sideSize);

            default:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextDouble() * sideSize,
                        random.nextDouble() * sideSize);
        }
    }
}

