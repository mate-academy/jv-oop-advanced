package core.basesyntax.supplier;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private final int radius = 10;
    private final int number = 8;
    private final int enumber = 4;

    public Figure getRandomFigure() {
        switch (random.nextInt(enumber) + 1) {
            case 1:
                return getRendomeCircle();
            case 2:
                return getRendomeSquare();
            case 3:
                return getRendomeIsoscelesTrapezoid();
            case 4:
                return getRendomeRigthTriangle();
            case 5:
                return getRendomeRectangle();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(colorSupplier.getRandomColor(), radius);
    }

    private Circle getRendomeCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(number) + 1);
    }

    private Square getRendomeSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(number) + 1);
    }

    private RightTriangle getRendomeRigthTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(number) + 1,
                random.nextInt(number) + 1);
    }

    private IsoscelesTrapezoid getRendomeIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(number) + 1, random.nextInt(number) + 1);
    }

    private Rectangle getRendomeRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(8) + 1,
                random.nextInt(8) + 1);
    }
}
