package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {

    private static final String COLOR = "WHITE";
    private static final int RADIUS = 10;
    private Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        String[] figures = {"circle", "isoscelesTrapezoid", "rectangle", "rightTriangle", "square"};
        int index = random.nextInt(figures.length);
        if ("circle".equals(figures[index])) {
            return new Circle(colorSupplier.getRandomColor(), random.nextInt());
        } else if ("isoscelesTrapezoid".equals(figures[index])) {
            return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(),
                    random.nextInt(), random.nextInt());
        } else if ("rectangle".equals(figures[index])) {
            return new Rectangle(colorSupplier.getRandomColor(),
                    random.nextInt(), random.nextInt());
        } else if ("rightTriangle".equals(figures[index])) {
            return new RightTriangle(colorSupplier.getRandomColor(),
                    random.nextInt(), random.nextInt());
        } else {
            return new Square(colorSupplier.getRandomColor(), random.nextInt());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(COLOR, RADIUS);
    }
}
