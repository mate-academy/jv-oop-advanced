package core.creatorclasses;

import core.figureclasses.Circle;
import core.figureclasses.Figure;
import core.figureclasses.IsoscelesTrapezoid;
import core.figureclasses.Rectangle;
import core.figureclasses.RightTriangle;
import core.figureclasses.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_NUMBER = 4;
    private static final String[] FIGURE = new String[] {"circle", "isosceles trapezoid",
            "rectangle", "right triangle", "square"};
    private static final int NUMBER_SIZE = 10;

    private final Random random = new Random();
    private final ColorSupplier colorFigure = new ColorSupplier();

    public Figure getRandomFigure() {
        String figureType = FIGURE[random.nextInt(FIGURE_NUMBER)];

        switch (figureType) {
            case "circle":
                return new Circle("circle", getColor(), randomNumber());
            case "isosceles trapezoid":
                return new IsoscelesTrapezoid("isosceles trapezoid", getColor(), randomNumber(),
                        randomNumber(), randomNumber());
            case "rectangle":
                return new Rectangle("rectangle", getColor(), randomNumber(), randomNumber());
            case "right triangle":
                return new RightTriangle("right triangle", getColor(), randomNumber(),
                        randomNumber());
            default:
                return new Square("square", getColor(), randomNumber());
        }
    }

    private String getColor() {
        return colorFigure.getRandomColor();
    }

    private int randomNumber() {
        return random.nextInt(NUMBER_SIZE);
    }
}
