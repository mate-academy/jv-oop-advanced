package core.basesyntax.temp;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    static final String DEFAULT_COLOR = "WHITE";
    static final double DEFAULT_RADIUS = 10.0;
    static final int FIGURE_AMOUNT = 4;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure figure = new Circle();

        int figureNumber = random.nextInt(FIGURE_AMOUNT);

        switch (figureNumber) {
            case (0):
                figure = getRandomCircle();
                break;
            case (1):
                figure = getRandomIsoscelesTrapezoid();
                break;
            case (2):
                figure = getRandomRectangle();
                break;
            case (3):
                figure = getRandomRightTriangle();
                break;
            case (4):
                figure = getRandomSquare();
                break;
            default:
                System.out.println("Wrong random number");
        }
        return figure;
    }

    public Figure getRandomCircle() {
        Circle circle = new Circle();
        circle.setRadius(random.nextDouble());
        circle.setColor(colorSupplier.getRandomColor());
        circle.getArea();
        Figure figure = circle;
        return figure;
    }

    private Figure getRandomIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setBasisA(random.nextDouble());
        isoscelesTrapezoid.setBasisB(random.nextDouble());
        isoscelesTrapezoid.setHeight(random.nextDouble());
        isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
        isoscelesTrapezoid.getArea();
        Figure figure = isoscelesTrapezoid;
        return figure;
    }

    private Figure getRandomRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setFirstSide(random.nextDouble());
        rectangle.setSecondSide(random.nextDouble());
        rectangle.setColor(colorSupplier.getRandomColor());
        rectangle.getArea();
        Figure figure = rectangle;
        return figure;
    }

    private Figure getRandomRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setFirstLeg(random.nextDouble());
        rightTriangle.setSecondLeg(random.nextDouble());
        rightTriangle.setColor(colorSupplier.getRandomColor());
        rightTriangle.getArea();
        Figure figure = rightTriangle;
        return figure;
    }

    private Figure getRandomSquare() {
        Square square = new Square();
        square.setSide(random.nextDouble());
        square.setColor(colorSupplier.getRandomColor());
        square.getArea();
        Figure figure = square;
        return figure;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(DEFAULT_RADIUS);
        circle.setColor(DEFAULT_COLOR);
        circle.getArea();
        Figure figure = new Circle();
        figure = circle;
        return figure;
    }
}
