package core.basesyntax.suppliers;

import core.basesyntax.Color;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final double DEFAULT_RADIUS = 10.0;
    private static final int NUMBER_OF_FIGURES = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier(this.random);

    public Figure getRandomFigure() {
        int figureOption = random.nextInt(NUMBER_OF_FIGURES);
        switch (figureOption) {
            case 0:
                Square square = getRandomSquare();
                return square;
            case 1:
                Rectangle rectangle = getRandomRectangle();
                return rectangle;
            case 2:
                RightTriangle rightTriangle = getRandomRightTriangle();
                return rightTriangle;
            case 3:
                Circle circle = getRandomCircle();
                return circle;
            case 4:
                IsoscelesTrapezoid isoscelesTrapezoid = getRandomIsoscelesTrapezoid();
                return isoscelesTrapezoid;
            default:
                break;
        }
        return null;
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }

    public Square getRandomSquare() {
        return new Square(this.colorSupplier.getRandomColor(), random.nextDouble());
    }

    public Rectangle getRandomRectangle() {
        return new Rectangle(this.colorSupplier.getRandomColor(), random.nextDouble(),
                random.nextDouble());
    }

    public RightTriangle getRandomRightTriangle() {
        return new RightTriangle(this.colorSupplier.getRandomColor(), random.nextDouble(),
                random.nextDouble());
    }

    public Circle getRandomCircle() {
        return new Circle(this.colorSupplier.getRandomColor(), random.nextDouble());
    }

    public IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(this.colorSupplier.getRandomColor(), random.nextDouble(),
                random.nextDouble(), random.nextDouble());
    }
}
