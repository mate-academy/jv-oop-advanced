package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public Figure getRandomFigure() {
        Figure randomFigure;
        int randomIndex = new Random().nextInt(5);
        switch (randomIndex) {
            case 0 -> randomFigure = getRandomCircle();
            case 1 -> randomFigure = getIsoscelesTrapezoid();
            case 2 -> randomFigure = getRandomRectangle();
            case 3 -> randomFigure = getRightTriangle();
            case 4 -> randomFigure = getRandomSquare();
            default -> randomFigure = new Figure();
        }
        return randomFigure;
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), FigureName.CIRCLE.name(), 10);
    }

    private Circle getRandomCircle() {
        return new Circle(new ColorSupplier().getRandomColor(),
                FigureName.CIRCLE.name(),
                new Random().nextInt(101));
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                FigureName.ISOSCELES_TRAPEZOID.name(),
                new Random().nextInt(101),
                new Random().nextInt(101),
                new Random().nextInt(101));
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(new ColorSupplier().getRandomColor(),
                FigureName.RECTANGLE.name(),
                new Random().nextInt(101),
                new Random().nextInt(101));
    }

    private RightTriangle getRightTriangle() {
        return new RightTriangle(new ColorSupplier().getRandomColor(),
                FigureName.RIGHT_TRIANGLE.name(),
                new Random().nextInt(101));
    }

    private Square getRandomSquare() {
        return new Square(new ColorSupplier().getRandomColor(),
                FigureName.SQUARE.name(),
                new Random().nextInt(101));
    }

}
