package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure createRandomFigure() {
        int figureAmount = 5;
        int randomFigure = (int) (Math.random() * figureAmount);
        ColorSupplier randColor = new ColorSupplier();
        switch (randomFigure) {
            case 0: return new Circle(rand(), randColor.randomColor());
            case 1: return new IsoscelesTrapezoid(rand(), rand(), rand(), randColor.randomColor());
            case 2: return new RightTriangle(rand(), rand(), randColor.randomColor());
            case 3: return new Square(rand(), randColor.randomColor());
            case 4: return new Rectangle(rand(), rand(), randColor.randomColor());
            default: return null;
        }
    }

    public int rand() {
        Random random = new Random();

        return random.nextInt(100) + 1;
    }
}
