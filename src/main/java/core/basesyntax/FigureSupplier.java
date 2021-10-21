package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final int figurecount = 5;
    static final int parametercount = 100;
    private ColorSuplier colorsuplier = new ColorSuplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int index = random.nextInt(figurecount);
        switch (index) {
            case 1 :
                return getSquare();
            case 2 :
                return getRectangle();
            case 3 :
                return getRightTriangle();
            case 4 :
                return getCircle();
            default :
                return getIsoscelesTrapezoid();
        }
    }

    private Figure getSquare() {
        int side = random.nextInt(parametercount);
        String color = colorsuplier.getRandomColor();
        return new Square(side, color);
    }

    private Figure getRectangle() {
        int breadth = random.nextInt(parametercount);
        int length = random.nextInt(parametercount);
        String color1 = colorsuplier.getRandomColor();
        return new Rectangle(breadth, length, color1);
    }

    private Figure getRightTriangle() {
        int base = random.nextInt(parametercount);
        int height = random.nextInt(parametercount);
        String color2 = colorsuplier.getRandomColor();
        return new RightTriangle(base, height, color2);
    }

    private Figure getCircle() {
        int radius = random.nextInt(parametercount);
        String color3 = colorsuplier.getRandomColor();
        return new Circle(radius, color3);
    }

    private Figure getIsoscelesTrapezoid() {
        int botbase = random.nextInt(parametercount);
        int topbase = random.nextInt(parametercount);
        int height1 = random.nextInt(parametercount);
        String color4 = colorsuplier.getRandomColor();
        return new IsoscelesTrapezoid(botbase, topbase, height1, color4);
    }

    public Figure getDefaultFigure() {
        return new Circle(10,Color.WHITE.name().toLowerCase());
    }
}
