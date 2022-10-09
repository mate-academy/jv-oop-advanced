package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int figureCount = 4;
    public static final int limit = 100;
    public static final int defoultRadius = 10;
    public static final String defoultColor = "white";

    public int getRandomInt() {
        return new Random().nextInt(limit);
    }

    public double getRandomDouble() {
        return new Random().nextDouble();
    }

    public Figure getDefoultFigure() {
        return new Circle(defoultColor,defoultRadius);
    }

    public Figure getRandomFigure() {
        ColorSuppier colorSuppier = new ColorSuppier();
        int figureIndex = new Random().nextInt(figureCount);
        switch (figureIndex) {
            case 0:
                return new Circle(colorSuppier.getRandomColor(),getRandomInt());
            case 1:
                return new IsoscelesTrapezoid(colorSuppier.getRandomColor(),
                        getRandomDouble(),
                        getRandomDouble(),
                        getRandomDouble());
            case 2:
                return new Square(colorSuppier.getRandomColor(),getRandomInt());
            case 3:
                return new Rectangle(colorSuppier.getRandomColor(),getRandomDouble(),
                        getRandomDouble());
            case 4:
            default:
                return new RightTriangle(colorSuppier.getRandomColor(),getRandomInt(),
                        getRandomInt());
        }
    }

}
