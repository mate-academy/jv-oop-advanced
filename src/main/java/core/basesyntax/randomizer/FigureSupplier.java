package core.basesyntax.randomizer;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import core.basesyntax.model.Colors;
import core.basesyntax.model.Figure;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 50;

    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();

        Circle circle = new Circle(random.nextInt(MAX_VALUE));
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(random.nextInt(MAX_VALUE),
                                            random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
        Rectangle rectangle = new Rectangle(random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
        RightTriangle rightTriangle = new RightTriangle(random.nextInt(MAX_VALUE),
                                                        random.nextInt(MAX_VALUE));
        Square square = new Square(random.nextInt(MAX_VALUE));

        Figure[] figures = {circle, isoscelesTrapezoid, rectangle, rightTriangle, square};

        Figure figure = figures[new Random().nextInt(figures.length - 1)];
        figure.setColor(colorSupplier.getRandomColor());

        return figure;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(10);
        circle.setColor(Colors.WHITE.name());

        return circle;
    }
}
