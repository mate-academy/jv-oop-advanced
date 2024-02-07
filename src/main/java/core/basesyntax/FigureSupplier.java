package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static Figure getRandomFigure() {
        Random random = new Random();
        int index = random.nextInt(RandomFigure.values().length);
        RandomFigure randomFigure = RandomFigure.values()[index];
        Figure figure;
        switch (randomFigure) {
            case CIRCLE:
                figure = new Circle();
                figure.color = figure.getColor();
                break;
            case SQUARE:
                figure = new Square();
                figure.color = figure.getColor();
                break;
            case RECTANGLE:
                figure = new Rectangle();
                figure.color = figure.getColor();
                break;
            case RIGHTTRIANGLE:
                figure = new RightTriangle();
                figure.color = figure.getColor();
                break;
            case ISOSCELESTRAPESOID:
                figure = new IsoscelesTrapezoid();
                figure.color = figure.getColor();
                break;
            default:
                figure = getDefaultFigure();
                figure.color = figure.getColor();
                break;
        }
        return figure;
    }

    public static Figure getDefaultFigure() {
        double defaultRadius = 10.0;
        Circle circle = new Circle(defaultRadius);
        circle.color = Color.WHITE.toString();
        return circle;
    }
}
