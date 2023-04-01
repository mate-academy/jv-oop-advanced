package core.basesyntax;

import java.util.Random;

public class FigureSupplier{
    public static Figure getRandomFigure() {
        Random random = new Random();
        int index = random.nextInt(RandomFigure.values().length);
        RandomFigure randomFigure = RandomFigure.values()[index];
        Figure figure;
        String randomColor = new ColorSupplier().getRandomColor();
        switch (randomFigure) {
            case CIRCLE:
                double randomRadius = random.nextDouble();
                figure = new Circle(randomRadius, randomColor);
                break;
            case SQUARE:
                double randomSide = random.nextDouble();
                figure = new Square(randomSide, randomColor);
                break;
            case RECTANGLE:
                double randomFirstSide = random.nextDouble();
                double randomSecondSide = random.nextDouble();
                figure = new Rectangle(randomFirstSide, randomSecondSide, randomColor);
                break;
            case RIGHTTRIANGLE:
                double randomFirstLeg = random.nextDouble();
                double randomSecondLeg = random.nextDouble();
                figure = new RightTriangle(randomFirstLeg, randomSecondLeg, randomColor);
                break;
            case ISOSCELESTRAPESOID:
                double randomLittleSide = random.nextDouble();
                double randomBigSide = random.nextDouble();
                double randomAltitude = random.nextDouble();
                figure = new IsoscelesTrapezoid(randomLittleSide, randomBigSide, randomAltitude, randomColor);
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
        String color = Color.WHITE.name();
        Circle circle = new Circle(defaultRadius, color);
        return circle;
    }
}
