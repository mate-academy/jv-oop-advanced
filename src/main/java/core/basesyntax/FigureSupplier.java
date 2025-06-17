package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random();

    private enum Figures {
        Square,
        Rectangle,
        RightTriangle,
        Circle,
        IsoscelesTrapezoid
    }

    public Figure getRandomFigure() {
        ColorSupplier cs = new ColorSupplier();
        String color = cs.getRandomColor();
        Figures randomFigure = Figures.values()[RANDOM.nextInt(Figures.values().length)];

        Figure figure;

        switch (randomFigure) {
            case Square:
                figure = new Square();
                break;
            case Rectangle:
                figure = new Rectangle();
                break;
            case RightTriangle:
                figure = new RightTriangle();
                break;
            case Circle:
                figure = new Circle();
                break;
            default:
                figure = new IsoscelesTrapezoid();
                break;
        }

        figure.setColor(color);

        return figure;
    }
}
