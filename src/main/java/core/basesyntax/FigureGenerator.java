package core.basesyntax;

import java.util.Random;

public class FigureGenerator {
    public static final int NUMBER_OF_FIGURE = 5;

    public static Figure getFigure() {
        int numberOfFigure = (int)(Math.random() * NUMBER_OF_FIGURE) + 1;
        switch (numberOfFigure) {
            case 1 :
                return generateSquare();
            case 2 :
                return generateRectangle();
            case 3 :
                return generateCircle();
            case 4 :
                return generateIsoscelesTrapezoid();
            case 5 :
                return generateRightTriangle();
            default:
                return null;
        }

    }

    public static Colors randomColor() {
        Random random = new Random();
        return Colors.values()[random.nextInt(Colors.values().length)];
    }

    public static Circle generateCircle() {
        return new Circle(FigureGenerator.randomColor().name().toLowerCase(),
                (int)(Math.random() * 15) + 3);
    }

    public static IsoscelesTrapezoid generateIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(FigureGenerator.randomColor().name().toLowerCase(),
                (int)(Math.random() * 15) + 3,
                (int)(Math.random() * 27) + 3, (int)(Math.random() * 10) + 3);
    }

    public static Rectangle generateRectangle() {
        return new Rectangle(FigureGenerator.randomColor().name().toLowerCase(),
                (int)(Math.random() * 15) + 3, (int)(Math.random() * 15) + 3);
    }

    public static RightTriangle generateRightTriangle() {
        return new RightTriangle(FigureGenerator.randomColor().name().toLowerCase(),
                (int)(Math.random() * 15) + 3, (int)(Math.random() * 15) + 3);
    }

    public static Square generateSquare() {
        return new Square(FigureGenerator.randomColor().name().toLowerCase(),
                (int)(Math.random() * 15) + 3);
    }
}
