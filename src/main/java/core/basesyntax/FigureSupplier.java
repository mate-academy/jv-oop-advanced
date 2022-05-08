package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        int figureNumber = random.nextInt(4);
        if (figureNumber == 0) {
            Circle circle = new Circle(random.nextInt(100));
            circle.setColor(colorSupplier.getRandomColor());
            return circle;
        } else if (figureNumber == 1) {
            Square square = new Square(random.nextInt(100));
            square.setColor(colorSupplier.getRandomColor());
            return square;
        } else if (figureNumber == 2) {
            RightTriangle rightTriangle = new RightTriangle(random.nextInt(100),
                                                            random.nextInt(100));
            rightTriangle.setColor(colorSupplier.getRandomColor());
            return rightTriangle;
        } else if (figureNumber == 3) {
            Rectangle rectangle = new Rectangle(random.nextInt(100),
                    random.nextInt(100));
            rectangle.setColor(colorSupplier.getRandomColor());
            return rectangle;
        } else if (figureNumber == 4) {
            IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(random.nextInt(100),
                    random.nextInt(100),
                    random.nextInt(100));
            isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
            return isoscelesTrapezoid;
        }
        return getDefaultFigure();
    }

    public Figure getDefaultFigure() {
        Circle figure = new Circle(10);
        figure.setColor(Color.WHITE.toString());
        return figure;
    }
}
