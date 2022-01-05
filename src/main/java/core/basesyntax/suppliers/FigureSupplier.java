package core.basesyntax.suppliers;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Color;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {

        switch (random.nextInt(4)) {
            case 0: {
                return getRandomCircle();
            }
            case 1: {
                return getRandomIsoscelesTrapezoid();
            }
            case 2: {
                return getRandomRectangle();
            }
            case 3: {
                return getRandomRightTriangle();
            }
            case 4: {
                return getRandomSquare();
            }
            default: {
                return getDefaultFigure();
            }
        }
    }

    public Figure getRandomCircle() {
        String color = colorSupplier.getRandomColor();
        int radius = random.nextInt(10);

        return new Circle(color, radius);
    }

    public Figure getRandomIsoscelesTrapezoid() {
        String color = colorSupplier.getRandomColor();
        int topBase = random.nextInt(10);
        int bottomBase = random.nextInt(10);
        int height = random.nextInt(10);

        return new IsoscelesTrapezoid(color, topBase, bottomBase, height);
    }

    public Figure getRandomRectangle() {
        String color = colorSupplier.getRandomColor();
        int wight = random.nextInt(10);
        int length = random.nextInt(10);

        return new Rectangle(color, wight, length);
    }

    public Figure getRandomRightTriangle() {
        String color = colorSupplier.getRandomColor();
        int base = random.nextInt(10);
        int height = random.nextInt(10);

        return new RightTriangle(color, base, height);
    }

    public Figure getRandomSquare() {
        String color = colorSupplier.getRandomColor();
        int side = random.nextInt(10);

        return new Square(color, side);
    }

    public Figure getDefaultFigure() {
        String color = Color.WHITE.toString();

        return new Circle(color, 10);
    }
}
