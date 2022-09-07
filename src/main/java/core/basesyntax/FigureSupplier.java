package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(4);
        switch (figureIndex) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),getRandomInt());
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    getRandomInt(),getRandomInt(), getRandomInt());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                    getRandomInt(),getRandomInt());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                    getRandomInt(), getRandomInt());
            case 4:
            default:
                return new Square(colorSupplier.getRandomColor(), getRandomInt());
        }
    }

    private int getRandomInt() {
        return new Random().nextInt(50);
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}

