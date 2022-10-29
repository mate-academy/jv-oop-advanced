package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    public Figure getRandomFigure() {
        Random random = new Random();
        int numberOfFigures = random.nextInt(FIGURE_COUNT - 1);  //because from 0 to 4
        ColorSupplier colorSupplier = new ColorSupplier();
        Color randomColor = ColorSupplier.getRandomColor();
        switch (numberOfFigures) {
            case 0:
                Circle circle = new Circle();
                circle.setRadius(random.nextInt(30));
                circle.color = randomColor;
                return circle;
            case 1:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setSide(random.nextInt(30));
                isoscelesTrapezoid.setBottom(random.nextInt(30));
                isoscelesTrapezoid.setTop(random.nextInt(30));
                isoscelesTrapezoid.color = randomColor;
                return isoscelesTrapezoid;
            case 2:
                Rectangle rectangle = new Rectangle();
                rectangle.setFirstLeg(random.nextInt(30));
                rectangle.setSecondLeg(random.nextInt(30));
                rectangle.color = randomColor;
                return rectangle;
            case 3:
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setFirstLeg(random.nextInt(30));
                rightTriangle.setSecondLeg(random.nextInt(30));
                rightTriangle.color = randomColor;
                return rightTriangle;
            case 4:
                Square square = new Square();
                square.setSide(random.nextInt(30));
                square.color = randomColor;
                return square;
        }
        return new Square();
    }
    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(10);
        circle.color = Color.WHITE;
        return circle;
    }
}


