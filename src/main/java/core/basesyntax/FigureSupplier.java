package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public ColoredFigure getRandomFigure() {
        ColoredFigure figure;
        String color = new ColorSupplier().getRandomColor();
        int index = new Random().nextInt(FigureType.values().length);
        switch (FigureType.values()[index]) {
            case CIRCLE -> {
                figure = new Circle(new Random().nextInt(100), color);
                break;
            }
            case RECTANGLE -> {
                figure = new Rectangle(new Random().nextInt(100),
                        new Random().nextInt(100), color);
                break;
            }
            case SQUARE -> {
                figure = new Square(new Random().nextInt(100), color);
                break;
            }
            case RIGHTTRIANGLE -> {
                figure = new RightTriangle(new Random().nextInt(100),
                        new Random().nextInt(100), color);
                break;
            }
            case ISOSCELESTRAPEZOID -> {
                figure = new IsoscelesTrapezoid(new Random().nextInt(100),
                        new Random().nextInt(100), new Random().nextInt(100), color);
                break;
            }
            default -> {
                figure = new Circle(10, "white");
                break;
            }
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
