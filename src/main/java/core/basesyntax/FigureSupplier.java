package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAXIMUM_AMOUNT_FIGURES = 5;
    private static final int MAXIMUM_POSSIBLE_NUMBER = 100;

    public Figure getRandomFigure() {
        Figure figure = null;
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        switch (random.nextInt(MAXIMUM_AMOUNT_FIGURES)) {
            case 0:
                figure = new Circle(random.nextInt(MAXIMUM_POSSIBLE_NUMBER));
                figure.setColor(colorSupplier.getRandomColor());
                break;
            case 1:
                figure = new IsoscelesTrapezoid(random.nextInt(MAXIMUM_POSSIBLE_NUMBER),
                        random.nextInt(MAXIMUM_POSSIBLE_NUMBER),
                        random.nextInt(MAXIMUM_POSSIBLE_NUMBER));
                figure.setColor(colorSupplier
                        .getRandomColor());
                break;
            case 2:
                figure = new Rectangle(random.nextInt(MAXIMUM_POSSIBLE_NUMBER),
                        random.nextInt(MAXIMUM_POSSIBLE_NUMBER));
                figure.setColor(colorSupplier.getRandomColor());
                break;
            case 3:
                figure = new RightTriangle(random.nextInt(MAXIMUM_POSSIBLE_NUMBER),
                        random.nextInt(MAXIMUM_POSSIBLE_NUMBER));
                figure.setColor(colorSupplier.getRandomColor());
                break;
            default:
                figure = new Square(random.nextInt(MAXIMUM_POSSIBLE_NUMBER));
                figure.setColor(colorSupplier.getRandomColor());
                break;

        }
        return figure;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(10);
        circle.setColor("WHITE");
        return circle;
    }
}
