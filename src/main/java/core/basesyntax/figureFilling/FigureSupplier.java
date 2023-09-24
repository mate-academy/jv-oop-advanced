package core.basesyntax.figureFilling;

import core.basesyntax.figures.*;
import core.basesyntax.figures.behaviour.Figure;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_VALUE = 100;
    private String white = Colors.WHITE.toString();

    private Random random = new Random();
    String randomColor = new ColorSupplier().getRandomColor();

    int randomInt = random.nextInt(FIGURE_COUNT);
    int randomFilling = random.nextInt(MAX_VALUE);

    public Figure getRandomFigure() {
        if(randomInt == 0) {
            return new Circle(randomColor,  randomFilling);
        } else if (randomInt == 1) {
            return new Square(randomColor, randomFilling);
        } else if (randomInt == 2) {
            return new Rectangle(randomColor, randomFilling, randomFilling);
        } else if (randomInt == 3) {
            return new RightTriangle(randomColor, randomFilling, randomFilling);
        } else {
            return new IsoscelesTrapezoid(randomColor, randomFilling, randomFilling, randomFilling);
        }
    }

    public Figure getDefaultFigure() {
            return new Circle(white, 10);
    }

}