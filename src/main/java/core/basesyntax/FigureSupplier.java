package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random;
    private int numFigures;
    private double defaultRadius;
    private String defaultColor;

    public FigureSupplier() {
        random = new Random();
        numFigures = 5;
        defaultRadius = 10.0;
        defaultColor = "white";
    }

    public Figure getRandomFigure() {
        double randomValue = getRandomValue();
        String color = new ColorSupplier().getRandomColor();

        int randomNumber = random.nextInt(numFigures);

        switch (randomNumber) {
            case 0:
                return new Square(randomValue, color);
            case 1:
                return new Rectangle(randomValue, randomValue, color);
            case 2:
                return new RightTriangle(randomValue, randomValue, color);
            case 3:
                return new Circle(randomValue, color);
            case 4:
                return new IsoscelesTrapezoid(randomValue, randomValue, randomValue, color);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(defaultRadius, defaultColor);
    }

    private double getRandomValue() {
        return random.nextDouble() * 10;
    }
}

