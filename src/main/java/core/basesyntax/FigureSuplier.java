package core.basesyntax;

import java.util.Locale;
import java.util.Random;

public class FigureSuplier {
    private final ColorSuplier color = new ColorSuplier();

    public Figure getRandomFigure() {
        switch (new Random().nextInt(4)) {
            case 0:
                return new Circle(color.getRandomColor(),
                        new Random().nextDouble(20));
            case 1:
                return new Square(new Random().nextDouble(20),
                        color.getRandomColor());
            case 2:
                return new Rectangle(new Random().nextDouble(20),
                        new Random().nextDouble(20),
                        color.getRandomColor());
            case 3:
                return new RightTriangle(color.getRandomColor(),
                        new Random().nextDouble(20),
                        new Random().nextDouble(20));
            default:
                return new IsoscelesTrapezoid(color.getRandomColor(),
                        new Random().nextDouble(20),
                        new Random().nextDouble(20),
                        new Random().nextDouble(20));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), 10);
    }
}

