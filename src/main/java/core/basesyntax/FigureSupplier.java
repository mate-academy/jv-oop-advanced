package core.basesyntax;

import java.lang.reflect.Type;
import java.util.Random;

import static core.basesyntax.Color.WHITE;

public class FigureSupplier {
    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(4);
        switch (randomFigure) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), getRandomInt());
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomInt(),
                        getRandomInt(),
                        getRandomInt());
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(), getRandomInt(), getRandomInt());
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(), getRandomInt(), getRandomInt());
            case 4:
            default:
                return new Square(colorSupplier.getRandomColor(), getRandomInt());
        }
    }

    private int getRandomInt() {
        return random.nextInt(100);
    }

    public Figure getDefaultFigure() {
        return new Circle(WHITE.name(), 10);
    }
}
