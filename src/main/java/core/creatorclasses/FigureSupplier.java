package core.creatorclasses;

import core.figureclasses.Circle;
import core.figureclasses.Figure;
import core.figureclasses.IsoscelesTrapezoid;
import core.figureclasses.Rectangle;
import core.figureclasses.RightTriangle;
import core.figureclasses.Square;
import core.interfaces.Constants;
import java.util.Random;

public class FigureSupplier implements Constants {
    public Figure getRandomFigure() {
        Random random = new Random();
        String figure = FIGURE[random.nextInt(FIGURE_NUMBER)];

        switch (figure) {
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
        ColorSupplier colorFigure = new ColorSupplier();
        return colorFigure.getRandomColor();
    }

    private int randomNumber() {
        Random random = new Random();
        return random.nextInt(NUMBER_SIZE);
    }
}
