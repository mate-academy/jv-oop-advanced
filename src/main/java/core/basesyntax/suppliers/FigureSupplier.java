package core.basesyntax.suppliers;

import core.basesyntax.abstractions.Figure;
import core.basesyntax.enums.Figures;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final Circle CIRCLE = new Circle("white", 10);
    private static final double BOUND = 200;

    private double getRandomNumber() {
        return new Random().nextDouble(BOUND);
    }

    public Figure getRandomFigure() {
        ColorSupplier color = new ColorSupplier();

        int index = new Random().nextInt(Figures.values().length);
        Figure figure;
        switch (Figures.values()[index]) {
            case CIRCLE -> figure = new Circle(color.getRandomColor(), getRandomNumber());
            case ISOSCELES_Trapezoid -> figure =
                    new IsoscelesTrapezoid(color.getRandomColor(), getRandomNumber(),
                    getRandomNumber(), getRandomNumber());
            case RECTANGLE -> figure =
                    new Rectangle(color.getRandomColor(), getRandomNumber(), getRandomNumber());
            case RIGHT_TRIANGLE ->
                    figure = new RightTriangle(color.getRandomColor(),
                            getRandomNumber(), getRandomNumber());
            case SQUARE -> figure =
                    new Square(color.getRandomColor(), getRandomNumber());
            default -> figure = CIRCLE;
        }
        return figure;

    }

    public Figure getDefaultFigure() {
        return CIRCLE;
    }
}
