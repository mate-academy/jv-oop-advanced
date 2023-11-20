package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        Random random = new Random();
        int randomShape = random.nextInt(5);

        switch (randomShape) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(10) + 1);
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(10) + 1,
                        random.nextInt(10) + 1);
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(10) + 1,
                        random.nextInt(10) + 1);
            case 3:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(10) + 1);
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(10) + 1,
                        random.nextInt(10) + 1, random.nextInt(10) + 1);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("White", 10);
    }

}
