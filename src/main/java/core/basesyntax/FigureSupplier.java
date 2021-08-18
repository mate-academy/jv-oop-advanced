package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_COLOR = 6;

    private static final String [] FIGURE = {"Square", "Rectangle", "Triangle", "Trapeze", "Circl"};

    public double getRandomNumber() {
        return new Random().nextInt(NUMBER_COLOR) + 1;
    }

    public Figure getRandomFigure() {
        String color = new ColorSupplier().getRandomColor();

        int figure = new Random().nextInt(FIGURE.length);
        if (FIGURE[figure].equals("Square")) {
            return new Square(color, FIGURE[figure], (int) getRandomNumber());
        } else if (FIGURE[figure].equals("Rectangle")) {
            return new Rectangle(color, FIGURE[figure], (int) getRandomNumber(), (int) getRandomNumber());
        } else if (FIGURE[figure].equals("Triangle")) {
            return new RightTriangle(color, FIGURE[figure],(int) getRandomNumber(), (int) getRandomNumber());
        } else if (FIGURE[figure].equals("Trapeze")) {
            return new IsoscelesTrapezoid(color, FIGURE[figure], (int) getRandomNumber(), (int) getRandomNumber(),
                    (int) getRandomNumber());
        } else {
            return new Circle(color, FIGURE[figure], (int) getRandomNumber());
        }
    }
}
