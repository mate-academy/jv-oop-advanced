package core.basesyntax;

import static core.basesyntax.ColorSupplier.*;

public class FigureSupplier {
    public static Figure getRandomFigure() {
        int figureNum = (int)(Math.random() * 4);
        switch (figureNum) {
            case 0:
                return new Circle(getRandomColor(), getRandomInt());
            case 1:
                return new IsoscelesTrapezoid(getRandomColor(), getRandomInt(), getRandomInt(), getRandomInt());
            case 2:
                return new Rectangle(getRandomColor(), getRandomInt(), getRandomInt());
            case 3:
                return new RightTriangle(getRandomColor(), getRandomInt(), getRandomInt());
            default:
                return new Square(getRandomColor(), getRandomInt());
        }
    }

    private static int getRandomInt() {
        return (int)(Math.random() * 10 + 1);
    }
}
