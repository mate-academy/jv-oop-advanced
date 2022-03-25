package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER = 100;
    ColorSupplier randomColor = new ColorSupplier();

    public Figure getRandomFigure() {
        FigureSupplier red = new FigureSupplier();
        ColorSupplier randomColor = new ColorSupplier();
        Random randFigure = new Random();

        switch (randFigure.nextInt(4)) {
            case 0:
                return new Square(randomColor.getRandomColor(), randFigure.nextInt(1, NUMBER));
            case 1:
                return new Circle(randomColor.getRandomColor(), randFigure.nextInt(1, NUMBER));
            case 2:
                return new Rectangle(randomColor.getRandomColor(), randFigure.nextInt(1, NUMBER ), randFigure.nextInt(1, NUMBER ));
            case 3:
                return new RightTriangle(randomColor.getRandomColor(), randFigure.nextInt(1, NUMBER), randFigure.nextInt(1, NUMBER));
            case 4:
                return new IsoscelesTrapezoid(randomColor.getRandomColor(), randFigure.nextInt(1, NUMBER ), randFigure.nextInt(1, NUMBER), randFigure.nextInt(1, NUMBER));
        }
        return null;
    }

    public Figure getDefaultFigure() {
        return new Circle ("White", 10);
    }
}
