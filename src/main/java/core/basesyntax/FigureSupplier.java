package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_COLOR = 6;
    private static String [] FIGURE = {"Square", "Rectangle", "RightTriangle",
            "IsoscelesTrapezoid", "Circle"};

    public double getRandomNumber() {
        return new Random().nextInt(NUMBER_COLOR) + 1;
    }

    public Figure getRandomFigure() {
        String randomColor = new ColorSupplier().getRandomColor();

        int figureIndex = new Random().nextInt(FIGURE.length);
        switch (FIGURE[figureIndex]) {
            case "Square":
                return new Square(randomColor, FIGURE[figureIndex], (int) getRandomNumber());
            case "Rectangle":
                return new Rectangle(randomColor, FIGURE[figureIndex], (int) getRandomNumber(),
                        (int) getRandomNumber());
            case "RightTriangle":
                return new RightTriangle(randomColor, FIGURE[figureIndex], (int) getRandomNumber(),
                        (int) getRandomNumber());
            case "IsoscelesTrapezoid":
                return new IsoscelesTrapezoid(randomColor, FIGURE[figureIndex],
                        (int) getRandomNumber(), (int) getRandomNumber(), (int) getRandomNumber());
            default:
                return new Circle(randomColor, FIGURE[figureIndex], (int) getRandomNumber());
        }
    }
}
