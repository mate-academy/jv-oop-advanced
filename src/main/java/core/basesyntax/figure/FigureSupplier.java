package core.basesyntax.figure;

import java.util.Random;

public class FigureSupplier {

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {

        int figureType = random.nextInt(5);
        String color = colorSupplier.getRandomColor();
        int maxValue = 100;

        switch (figureType) {
            case 0:
                return new Square(color,
                        random.nextDouble(maxValue));
            case 1:
                return new Rectangle(color,
                        random.nextDouble(maxValue),
                        random.nextDouble(maxValue));
            case 2:
                return new RightTriangle(color,
                        random.nextDouble(maxValue),
                        random.nextDouble(maxValue));
            case 3:
                return new Circle(color,
                        random.nextDouble(maxValue));
            case 4:
                return new IsoscelesTrapezoid(color,
                        random.nextDouble(maxValue),
                        random.nextDouble(maxValue),
                        random.nextDouble(maxValue));
            default:
                return getDefaultFigure();
        }

    }

    public Figure getDefaultFigure() {
        return new Circle("white",10);
    }
}

