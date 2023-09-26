package core.basesyntax.randomizer;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import core.basesyntax.model.Color;
import core.basesyntax.model.Figure;
import core.basesyntax.model.Figures;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 20;
    private static final int DEFAULT_RADIUS = 10;

    Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();
    public Figure getRandomFigure() {
        Figures figureName = Figures.values()[random.nextInt(Figures.values().length)];

        Figure figure = new Figure();

        switch (figureName) {
            case CIRCLE:
                figure = new Circle(random.nextInt(MAX_VALUE));
                break;
            case ISOSCELES_TRAPEZOID:
                figure = new IsoscelesTrapezoid(random.nextInt(MAX_VALUE),
                                       random.nextInt(MAX_VALUE),
                                       random.nextInt(MAX_VALUE));
                break;
            case RECTANGLE:
                figure = new Rectangle(random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
                break;
            case RIGHT_TRIANGLE:
                figure = new RightTriangle(random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
                break;
            case SQUARE:
                figure = new Square(random.nextInt(MAX_VALUE));
                break;
        }

        figure.setColor(colorSupplier.getRandomColor());

        return figure;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(DEFAULT_RADIUS);
        circle.setColor(Color.WHITE);

        return circle;
    }
}
