package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        ColorSuplier colorsuplier = new ColorSuplier();
        Random random = new Random();
        int index = random.nextInt(4);
        if (index == 0) {
            int side = random.nextInt(100);
            String color = colorsuplier.getRandomColor();
            return new Square(side, color);
        } else if (index == 1) {
            int breadth = random.nextInt(100);
            int length = random.nextInt(100);
            String color = colorsuplier.getRandomColor();
            return new Rectangle(breadth, length, color);
        } else if (index == 2) {
            int base = random.nextInt(100);
            int height = random.nextInt(100);
            String color = colorsuplier.getRandomColor();
            return new RightTriangle(base, height, color);
        } else if (index == 3) {
            int radius = random.nextInt(100);
            String color = colorsuplier.getRandomColor();
            return new Circle(radius, color);
        } else {
            int botbase = random.nextInt(100);
            int topbase = random.nextInt(100);
            int height = random.nextInt(100);
            String color = colorsuplier.getRandomColor();
            return new IsoscelesTrapezoid(botbase, topbase, height, color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10,"white");
    }
}
