package core.basesyntax;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final int randomNumber = random.nextInt(50);

    public Figure getRandomFigure() {
        int someFigure = random.nextInt(5);
        switch (someFigure) {
            case 0:
                return newCircle();
            case 1:
                return newRectangle();
            case 2:
                return newSquare();
            case 3:
                return newIsoscelesTrapezoid();
            default:
                return newRightTriangle();
        }

    }

    private Circle newCircle() {
        return new Circle(random.nextInt(randomNumber));
    }

    private Rectangle newRectangle() {
        return new Rectangle(random.nextInt(randomNumber),
                random.nextInt(randomNumber));
    }

    private RightTriangle newRightTriangle() {
        return new RightTriangle(random.nextInt(randomNumber),
                random.nextInt(randomNumber));
    }

    private Square newSquare() {
        return new Square(random.nextInt(randomNumber));
    }

    private IsoscelesTrapezoid newIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random.nextInt(randomNumber),
                random.nextInt(randomNumber),
                random.nextInt(randomNumber));
    }
}
