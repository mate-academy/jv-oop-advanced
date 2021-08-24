package core.basesyntax;

import core.basesyntax.figures.*;

import java.util.Random;

public class FigureSupplier {
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final Figure[] figuresArray = new Figure[]{
            new Circle(12, colorSupplier.getRandomColor()),
            new IsoscelesTrapezoid(15, 18, colorSupplier.getRandomColor()),
            new Rectangle(18, 23, colorSupplier.getRandomColor()),
            new RightTriangle(12, 16, colorSupplier.getRandomColor()),
            new Square(12, colorSupplier.getRandomColor())
    };

    public Figure getRandomFigure() {
        Random random = new Random();
        return figuresArray[random.nextInt(figuresArray.length)];
    }
}
