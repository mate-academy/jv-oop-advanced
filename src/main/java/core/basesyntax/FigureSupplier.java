package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_COLOR = 6;

    private static final String [] FIGURE = {"Square", "Rectangle", "RightTriangle", "IsoscelesTrapezoid",
            "Circle"};
    public double getRandomNumber() {
        return new Random().nextInt(NUMBER_COLOR) + 1;
    }

    public Figure getRandomFigure() {
        String randomColor = new ColorSupplier().getRandomColor();

        int randomFigure = new Random().nextInt(FIGURE.length);
        if (FIGURE[randomFigure].equals("Square")) {
            return new Square(randomColor, FIGURE[randomFigure], (int) getRandomNumber());
        } else if (FIGURE[randomFigure].equals("Rectangle")) {
            return new Rectangle(randomColor, FIGURE[randomFigure], (int) getRandomNumber(), (int) getRandomNumber());
        } else if (FIGURE[randomFigure].equals("RightTriangle")) {
            return new RightTriangle(randomColor, FIGURE[randomFigure],(int) getRandomNumber(), (int) getRandomNumber());
        } else if (FIGURE[randomFigure].equals("IsoscelesTrapezoid")) {
            return new IsoscelesTrapezoid(randomColor, FIGURE[randomFigure], (int) getRandomNumber(), (int) getRandomNumber(),
                    (int) getRandomNumber());
        } else {
            return new Circle(randomColor, FIGURE[randomFigure], (int) getRandomNumber());
        }
    }
}
