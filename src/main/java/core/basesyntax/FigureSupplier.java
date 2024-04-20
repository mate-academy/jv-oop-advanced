package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Random random = new Random();
        Color color = Color.valueOf(new ColorSupplier().getRandomColor());
        int indexForFigure = random.nextInt(5);
        if (indexForFigure == 0) {
            Square square = new Square();
            square.setColor(color);
            square.setSide(random.nextDouble());
            return square;
        }
        if (indexForFigure == 1) {
            Rectangle rectangle = new Rectangle();
            rectangle.setColor(color);
            rectangle.setVerticalSide(random.nextDouble());
            rectangle.setHorizontalSide(random.nextDouble());
            return rectangle;
        }
        if (indexForFigure == 2) {
            RightTriangle triangle = new RightTriangle();
            triangle.setColor(color);
            triangle.setFirstLeg(random.nextDouble());
            triangle.setSecondLeg(random.nextDouble());
            return triangle;
        }
        if (indexForFigure == 3) {
            IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid();
            trapezoid.setColor(color);
            trapezoid.setTopSide(random.nextDouble());
            trapezoid.setDownSide(random.nextDouble());
            trapezoid.setLateralSide(random.nextDouble());
            return trapezoid;
        }
        Circle circle = new Circle();
        circle.setColor(color);
        circle.setRadius(random.nextDouble());
        return circle;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(10);
        circle.setColor(Color.WHITE);
        return circle;
    }
}
