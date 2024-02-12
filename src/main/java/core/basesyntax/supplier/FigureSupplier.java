package core.basesyntax.supplier;

import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();

    public Figure getRandomFigure() {
        int randomNum = random.nextInt(1, 5);
        switch (randomNum) {
            case 1:
                return new Circle(new ColorSupplier()
                        .getRandomColor(), randomNum);
            case 2:
                return new Square(new ColorSupplier()
                        .getRandomColor(), randomNum);
            case 3:
                return new Rectangle(new ColorSupplier()
                        .getRandomColor(), randomNum, randomNum);
            case 4:
                return new RightTriangle(new ColorSupplier()
                        .getRandomColor(), randomNum);
            case 5:
                return new IsoscelesTrapezoid(new ColorSupplier()
                        .getRandomColor(), randomNum, randomNum);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
