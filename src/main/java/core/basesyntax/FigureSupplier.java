package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        ColorSuplier colorsuplier = new ColorSuplier();
        Random random = new Random();
        int index = random.nextInt(4);
        if (index == 0) {
            return new Square(random.nextInt(100),colorsuplier.getRandomColor());
        } else if (index == 1) {
            return new Rectangle(random.nextInt(100),
                    random.nextInt(100),colorsuplier.getRandomColor());
        } else if (index == 2) {
            return new RightTriangle(random.nextInt(100),
                    random.nextInt(100),colorsuplier.getRandomColor());
        } else if (index == 3) {
            return new Circle(random.nextInt(100),
                    colorsuplier.getRandomColor());
        } else {
            return new IsoscelesTrapezoid(random.nextInt(100),
                    random.nextInt(100),random.nextInt(100),colorsuplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10,"white");
    }
}
