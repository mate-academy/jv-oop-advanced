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
                figure = new Circle(random.nextDouble());
                break;
            case SQUARE:
                figure = new Square(random.nextDouble());
                break;
            case RECTANGLE:
                figure = new Rectangle(random.nextDouble(), random.nextDouble());
                break;
            case RIGHTTRIANGLE:
                figure = new RightTriangle(random.nextDouble(), random.nextDouble());
                break;
            case ISOSCELESTRAPESOID:
                figure = new IsoscelesTrapezoid(random.nextDouble(), random.nextDouble(),
                        random.nextDouble());
                break;
            default:
                figure = getDefaultFigure();
                break;
        }
        return figure;
    }

    public static Figure getDefaultFigure() {
        Circle circle = new Circle(10.0);
        circle.color = RandomColor.WHITE.toString();
        return circle;
    }
}
