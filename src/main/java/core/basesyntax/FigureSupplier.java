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
                break;
            case SQUARE:
                figure = new Square();
                break;
            case RECTANGLE:
                figure = new Rectangle();
                break;
            case RIGHTTRIANGLE:
                figure = new RightTriangle();
                break;
            case ISOSCELESTRAPESOID:
                figure = new IsoscelesTrapezoid();
                break;
            default:
                figure = getDefaultFigure();
                break;
        }
        return figure;
    }

    public static Figure getDefaultFigure() {
        Circle circle = new Circle(10.0);
        circle.color = Color.WHITE.toString();
        return circle;
    }
}
