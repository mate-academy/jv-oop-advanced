package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER = 100;
    private ColorSupplier randomColor = new ColorSupplier();

    public Figure getRandomFigure() {
        FigureSupplier figureSupplier = new FigureSupplier();
        ColorSupplier randomColor = new ColorSupplier();
        Random randFigure = new Random();

        switch (randFigure.nextInt(5)) {
            case 0:
                Square square = new Square(randFigure.nextInt(1, NUMBER));
                square.setColor(randomColor.getRandomColor());
                return square;
            case 1:
                Circle circle = new Circle(randFigure.nextInt(1, NUMBER));
                circle.setColor(randomColor.getRandomColor());
                return circle;
            case 2:
                Rectangle rectangle = new Rectangle(randFigure.nextInt(1, NUMBER),
                        randFigure.nextInt(1, NUMBER));
                rectangle.setColor(randomColor.getRandomColor());
                return rectangle;
            case 3:
                RightTriangle rightTriangle = new RightTriangle(randFigure.nextInt(1, NUMBER),
                        randFigure.nextInt(1, NUMBER));
                rightTriangle.setColor(randomColor.getRandomColor());
                return rightTriangle;
            case 4:
                IsoscelesTrapezoid isoscelesTrapezoid
                        = new IsoscelesTrapezoid(randFigure.nextInt(1, NUMBER),
                        randFigure.nextInt(1, NUMBER), randFigure.nextInt(1, NUMBER));
                isoscelesTrapezoid.setColor(randomColor.getRandomColor());
                return isoscelesTrapezoid;
            default:
                break;
        }
        return getDefaultFigure();
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(10);
        circle.setColor("WHITE");
        return circle;
    }
}
