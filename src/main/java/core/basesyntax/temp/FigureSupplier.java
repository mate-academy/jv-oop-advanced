package core.basesyntax.temp;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {

    private Random random = new Random();
    private final String defaultColor = "WHITE";
    private final double defaultRadius = 10.0;
    private int index = 0;
    private Figure figure = new Circle();

    public Figure getRandomFigure() {
        index = random.nextInt(4);
        ColorSupplier colorSupplier = new ColorSupplier();

        switch (index) {
            case (0):
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setFirstLeg(random.nextDouble());
                rightTriangle.setSecondLeg(random.nextDouble());
                rightTriangle.setColor(colorSupplier.getRandomColor());
                rightTriangle.getArea();
                figure = rightTriangle;
                break;
            case (1):
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setBasisA(random.nextDouble());
                isoscelesTrapezoid.setBasisB(random.nextDouble());
                isoscelesTrapezoid.setHeight(random.nextDouble());
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                isoscelesTrapezoid.getArea();
                figure = isoscelesTrapezoid;
                break;
            case (2):
                Square square = new Square();
                square.setSide(random.nextDouble());
                square.setColor(colorSupplier.getRandomColor());
                square.getArea();
                figure = square;
                break;
            case (3):
                Rectangle rectangle = new Rectangle();
                rectangle.setFirstSide(random.nextDouble());
                rectangle.setSecondSide(random.nextDouble());
                rectangle.setColor(colorSupplier.getRandomColor());
                rectangle.getArea();
                figure = rectangle;
                break;
            case (4):
                Circle circle = new Circle();
                circle.setRadius(random.nextDouble());
                circle.setColor(colorSupplier.getRandomColor());
                circle.getArea();
                figure = circle;
                break;
            default:
                System.out.println("Wrong random number");
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(defaultRadius);
        circle.setColor(defaultColor);
        circle.getArea();
        figure = circle;
        return figure;
    }
}
