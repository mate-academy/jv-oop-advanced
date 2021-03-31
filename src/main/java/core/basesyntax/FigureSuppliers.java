package core.basesyntax;

import java.util.Random;

public class FigureSuppliers {
    public Figure createRandomFigure() {
        int randomFigure = (int) (Math.random() * 5 + 1);
        ColorSupplier randColor = new ColorSupplier();
        switch (randomFigure) {
            case 1: return new Circle(rand(), randColor.randomColor());
            case 2: return new IsoscelesTrapezoid(rand(), rand(), rand(), randColor.randomColor());
            case 3: return new RightTriangle(rand(), rand(), randColor.randomColor());
            case 4: return new Square(rand(), randColor.randomColor());
            case 5: return new Rectangle(rand(), rand(), randColor.randomColor());
            default: return null;
        }
    }

    public int rand() {
        Random random = new Random();

        return random.nextInt(100) + 1;
    }
}
