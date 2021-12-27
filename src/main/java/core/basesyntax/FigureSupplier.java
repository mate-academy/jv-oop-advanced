package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    public static Figure getRandomFigure() {
        Random random = new Random();
        String figureName = Figures.values()[random.nextInt(Figures.values().length)].toString();
        Figure figure;
        switch (figureName) {
            case "Rectangle": {
                figure = new Rectangle(random.nextDouble(), random.nextDouble());
                break;
            }
            case "Square": {
                figure = new Square(random.nextDouble());
                break;
            }
            case "RightTriangle": {
                figure = new RightTriangle(random.nextDouble(), random.nextDouble());
                break;
            }
            case "IsoscelesTrapezoid": {
                figure = new IsoscelesTrapezoid(random.nextDouble(),
                        random.nextDouble(), random.nextDouble());
                break;
            }
            case "Circle": {
                figure = new Circle(random.nextDouble());
                break;
            }
            default:
                figure = getDefaultFigure();
        }
        figure.setColor(ColorSupplier.getRandomColor());
        return figure;

    }

    public static Figure getDefaultFigure() {
        Figure defaultCircle = new Circle(10);
        defaultCircle.setColor("WHITE");
        return defaultCircle;
    }
}
