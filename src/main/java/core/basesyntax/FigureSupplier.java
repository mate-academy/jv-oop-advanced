package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RANDOM_COLOR_NUMBER = 6;
    private static final String[] FIGURES = {"Square", "Rectangle", "RightTriangle",
            "IsoscelesTrapezoid", "Circle"};

    public int getRandomNumber() {
        return (int) (new Random().nextInt(RANDOM_COLOR_NUMBER) + 1);
    }

    public Figure getRandomFigure() {
        String randomColor = new ColorSupplier().getRandomColor();

        int figureIndex = new Random().nextInt(FIGURES.length);
        switch (FIGURES[figureIndex]) {
            case "Square":
                return new Square(randomColor, FIGURES[figureIndex], (int) getRandomNumber());
            case "Rectangle":
                return new Rectangle(randomColor, FIGURES[figureIndex], (int) getRandomNumber(),
                        (int) getRandomNumber());
            case "RightTriangle":
                return new RightTriangle(randomColor, FIGURES[figureIndex], (int) getRandomNumber(),
                        (int) getRandomNumber());
            case "IsoscelesTrapezoid":
                return new IsoscelesTrapezoid(randomColor, FIGURES[figureIndex],
                        (int) getRandomNumber(), (int) getRandomNumber(), (int) getRandomNumber());
            default:
                return new Circle(randomColor, FIGURES[figureIndex], (int) getRandomNumber());
        }
    }
}
