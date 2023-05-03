package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        Figure figure;
        int numberOfFigures = 5;
        int randomFigure = random.nextInt(numberOfFigures);

        switch (randomFigure) {
            case 0:
                figure = new Circle(colorSupplier.getRandomColor(), getRandomSide());
                break;
            case 1:
                figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomSide(),
                        getRandomSide(), getRandomSide());
                break;
            case 2:
                figure = new Rectangle(colorSupplier.getRandomColor(), getRandomSide(),
                        getRandomSide(), getRandomSide());
                break;
            case 3:
                figure = new RightTriangle(colorSupplier.getRandomColor(), getRandomSide(),
                        getRandomSide());
                break;
            default:
                figure = new Square(colorSupplier.getRandomColor(), getRandomSide());
                break;
        }

        return figure;
    }

    private double getRandomSide() {
        int maxSideUnits = 19;
        return random.nextDouble(maxSideUnits) + 1;
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10.00);
    }
}
