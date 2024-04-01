package core.basesyntax.supplier;

import core.basesyntax.Figure;
import core.basesyntax.entity.Circle;
import core.basesyntax.entity.IsoscelesTrapezoid;
import core.basesyntax.entity.Rectangle;
import core.basesyntax.entity.RightTriangle;
import core.basesyntax.entity.Square;qq
import java.util.Random;

public class FigureSupplier {
    public static final int MAX_VALUE = 100;

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        Figure figure;

        switch (random.nextInt(5)) {
            case 0:
                figure = new Circle(
                        colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE));
                return figure;
            case 1:
                figure = new IsoscelesTrapezoid(
                        colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
                return figure;
            case 2:
                figure = new Rectangle(
                        colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
                return figure;
            case 3:
                figure = new RightTriangle(
                        colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
                return figure;
            default:
                figure = new Square(
                        colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE));
                return figure;
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle("white", 10);
        return circle;
    }

}
