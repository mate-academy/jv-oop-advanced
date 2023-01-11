package core.basesyntax.supplier;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Color;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {

    public Figure getRandomFigure() {
        int number;
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        number = random.nextInt(5);
        switch (number) {
            case 1: {
                Circle circle = new Circle();
                circle.setRadius(random.nextInt(100));
                circle.setColor(colorSupplier.getRandomColor());
                return circle;
            }
            case 2: {
                Rectangle rectangle = new Rectangle();
                rectangle.setSideA(random.nextInt(100));
                rectangle.setSideB(random.nextInt(100));
                rectangle.setColor(colorSupplier.getRandomColor());
                return rectangle;
            }
            case 3: {
                Square square = new Square();
                square.setSide(random.nextInt(100));
                square.setColor(colorSupplier.getRandomColor());
                return square;
            }
            case 4: {
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setFirstLeg(random.nextInt(100));
                rightTriangle.setSecondLeg(random.nextInt(100));
                rightTriangle.setColor(colorSupplier.getRandomColor());
                return rightTriangle;
            }
            case 5: {
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setSideA(random.nextInt(100));
                isoscelesTrapezoid.setSideB(random.nextInt(100));
                isoscelesTrapezoid.setHeight(random.nextInt(100));
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                return isoscelesTrapezoid;
            }
            default: {
                return new IsoscelesTrapezoid();
            }
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(10);
        circle.setColor(Color.WHITE.name());
        return circle;
    }
}
