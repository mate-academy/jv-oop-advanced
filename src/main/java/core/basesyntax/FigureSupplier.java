package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSuplier colorsuplier = new ColorSuplier();
    private Random random = new Random();
    private final int figurecount = 5;
    private final int parametercount = 100;

    public Figure getRandomFigure() {
        int index = random.nextInt(figurecount);
        if (index == 1) {
            int side = random.nextInt(parametercount);
            String color = colorsuplier.getRandomColor();
            return new Square(side, color);
        } else if (index == 2) {
            int breadth = random.nextInt(parametercount);
            int length = random.nextInt(parametercount);
            String color = colorsuplier.getRandomColor();
            return new Rectangle(breadth, length, color);
        } else if (index == 3) {
            int base = random.nextInt(parametercount);
            int height = random.nextInt(parametercount);
            String color = colorsuplier.getRandomColor();
            return new RightTriangle(base, height, color);
        } else if (index == 4) {
            int radius = random.nextInt(parametercount);
            String color = colorsuplier.getRandomColor();
            return new Circle(radius, color);
        } else {
            int botbase = random.nextInt(parametercount);
            int topbase = random.nextInt(parametercount);
            int height = random.nextInt(parametercount);
            String color = colorsuplier.getRandomColor();
            return new IsoscelesTrapezoid(botbase, topbase, height, color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10,"white");
    }
}
