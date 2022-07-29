package core.basesyntax;

import java.util.Random;

public class FigureSuplier {
    private final ColorSuplier color = new ColorSuplier();

    public Figure getRandomFigure() {
        switch (new Random().nextInt(5)) {
            case 0:
                return new Circle(color.getRandomColor(),
                        new Random().nextInt(20));
            case 1:
                return new Square(new Random().nextInt(20),
                        color.getRandomColor());
            case 2:
                return new Rectangle(new Random().nextInt(20),
                        new Random().nextInt(20),
                        color.getRandomColor());
            case 3:
                return new RightTriangle(color.getRandomColor(),
                        new Random().nextInt(20),
                        new Random().nextInt(20));
            default:
                return new IsoscelesTrapezoid(color.getRandomColor(),
                        new Random().nextInt(20),
                        new Random().nextInt(20),
                        new Random().nextInt(20));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), 10);
    }
}

