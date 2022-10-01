package core.basesyntax;

import core.basesyntax.enums.Colors;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {

    private static final int RADIUS_OF_DEFAULT_FIGURE = 10;
    private static final Colors COLOR_OF_DEFAULT_FIGURE = Colors.WHITE;
    private static final int NUM_OF_FIGURE = 5;
    private static final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public FiguresClass getRandomFigure() {
        int randomNumFigure = random.nextInt(NUM_OF_FIGURE);
        if (randomNumFigure == 1) {
            return randomCircle();
        }
        if (randomNumFigure == 2) {
            return randomSquare();
        }
        if (randomNumFigure == 3) {
            return randomTriangle();
        }
        if (randomNumFigure == 4) {
            return randomRectangle();
        }
        return randomIsoscelesTrapezoid();
    }

    public int side() {
        return random.nextInt();
    }

    public RightTriangle randomTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), side(), side());
    }

    public Circle randomCircle() {
        return new Circle(side(), colorSupplier.getRandomColor());
    }

    public Square randomSquare() {
        return new Square(side(), colorSupplier.getRandomColor());
    }

    public Rectangle randomRectangle() {
        return new Rectangle(side(), side(), colorSupplier.getRandomColor());
    }

    public IsoscelesTrapezoid randomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), side(), side(), side());
    }

    public FiguresClass getDefaultFigure() {
        return new Circle(RADIUS_OF_DEFAULT_FIGURE, COLOR_OF_DEFAULT_FIGURE.name());
    }
}
