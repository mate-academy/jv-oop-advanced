package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier color = new ColorSupplier();
    private final NumberSupplier number = new NumberSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5);

        switch (figureType) {
            case 0:
                return new Circle(color.getRandomColor(),
                        (int) number.getRandomNumber());
            case 1:
                return new Square(color.getRandomColor(),
                        (int) number.getRandomNumber());
            case 2:
                return new Rectangle(color.getRandomColor(),
                        (int) number.getRandomNumber(),
                        (int) number.getRandomNumber());
            case 3:
                return new RightTriangle(color.getRandomColor(),
                        (int) number.getRandomNumber(),
                        (int) number.getRandomNumber());
            case 4:
                return new IsoscelesTrapezoid(color.getRandomColor(),
                        (int) number.getRandomNumber(),
                        (int) number.getRandomNumber(),
                        (int) number.getRandomNumber(),
                        (int) number.getRandomNumber());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(String.valueOf(Color.WHITE), 10);
    }
}
