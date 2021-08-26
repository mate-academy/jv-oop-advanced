package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private static final ColorSupplier sp = new ColorSupplier();
    private static final Figure[] figuresArray = new Figure[]{
            new Circle(random.nextInt(12), sp.getRandomColor()),
            new IsoscelesTrapezoid(random.nextInt(16), random.nextInt(24), sp.getRandomColor()),
            new Rectangle(random.nextInt(17), random.nextInt(19), sp.getRandomColor()),
            new RightTriangle(random.nextInt(12), random.nextInt(14), sp.getRandomColor()),
            new Square(random.nextInt(24), sp.getRandomColor())
    };

    public Figure getRandomFigure() {
        return figuresArray[random.nextInt(figuresArray.length)];
    }
}
