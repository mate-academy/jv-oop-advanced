package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAXIMUM_UNITS = 10;
    private static final int FIGURES_NUMBER = 5;
    private static final Figure DEFAULT_FIGURE = new Circle(10, Colors.WHITE.name().toLowerCase());
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Figure[] figures = new Figure[]{ new Circle(), new IsoscelesTrapezoid(),
            new Rectangle(), new Square(), new RightTriangle()};

    public Figure getRandomFigure() {
        int randomFigureNumber = random.nextInt(FIGURES_NUMBER);
        String randomFiguresName = figures[randomFigureNumber].getName();
        String randomColor = colorSupplier.getRandomColor();
        int firstRandomParameter = random.nextInt(MAXIMUM_UNITS);
        int secondRandomParameter = random.nextInt(MAXIMUM_UNITS);
        int thirdRandomParameter = random.nextInt(MAXIMUM_UNITS);
        switch (randomFiguresName) {
            case "square":
                return new Square(firstRandomParameter, randomColor);
            case "rectangle":
                return new Rectangle(firstRandomParameter, secondRandomParameter, randomColor);
            case "right triangle":
                return new RightTriangle(firstRandomParameter, secondRandomParameter, randomColor);
            case "circle":
                return new Circle(firstRandomParameter, randomColor);
            default:
                return new IsoscelesTrapezoid(firstRandomParameter, secondRandomParameter,
                        thirdRandomParameter, randomColor);
        }
    }

    public Figure getDefaultFigure() {
        return DEFAULT_FIGURE;
    }
}

