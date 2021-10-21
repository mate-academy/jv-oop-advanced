package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURE = 5;
    private static final int UPPER_BOUND = 100;
    private ColorSuplier colorsuplier = new ColorSuplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int index = random.nextInt(NUMBER_OF_FIGURE);
        switch (index) {
            case 1 :
                return getSquare();
            case 2 :
                return getRectangle();
            case 3 :
                return getRightTriangle();
            case 4 :
                return getCircle();
            case 5 :
            default :
                return getIsoscelesTrapezoid();
        }
    }

    private Figure getSquare() {
        int side = random.nextInt(UPPER_BOUND);
        String color = colorsuplier.getRandomColor();
        return new Square(side, color);
    }

    private Figure getRectangle() {
        int breadth = random.nextInt(UPPER_BOUND);
        int length = random.nextInt(UPPER_BOUND);
        String color1 = colorsuplier.getRandomColor();
        return new Rectangle(breadth, length, color1);
    }

    private Figure getRightTriangle() {
        int base = random.nextInt(UPPER_BOUND);
        int height = random.nextInt(UPPER_BOUND);
        String color2 = colorsuplier.getRandomColor();
        return new RightTriangle(base, height, color2);
    }

    private Figure getCircle() {
        int radius = random.nextInt(UPPER_BOUND);
        String color3 = colorsuplier.getRandomColor();
        return new Circle(radius, color3);
    }

    private Figure getIsoscelesTrapezoid() {
        int botbase = random.nextInt(UPPER_BOUND);
        int topbase = random.nextInt(UPPER_BOUND);
        int height1 = random.nextInt(UPPER_BOUND);
        String color4 = colorsuplier.getRandomColor();
        return new IsoscelesTrapezoid(botbase, topbase, height1, color4);
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.name().toLowerCase());
    }
}
