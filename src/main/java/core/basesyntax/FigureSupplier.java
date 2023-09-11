package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier color = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        String randomColor = color.getRandomColor();
        final String[] figures = {"square",
                                  "rectangle",
                                  "right triangle",
                                  "circle",
                                  "isosceles trapezoid"};
        String randomFigureType = figures[random.nextInt(figures.length)];

        switch (randomFigureType) {
            case "square":
                return getRandomSquare(randomColor);
            case "rectangle":
                return getRandomRectangle(randomColor);
            case "right triangle":
                return getRandomRightTriangle(randomColor);
            case "circle":
                return getRandomCircle(randomColor);
            case "isosceles trapezoid":
                return getRandomIsoscelesTrapezoid(randomColor);
            default:
                return getDefaultFigure();
        }
    }

    final Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }

    private Circle getRandomCircle(String randomColor) {
        double radius = Math.random() * 10;
        return new Circle(randomColor, radius);
    }

    private Rectangle getRandomRectangle(String randomColor) {
        double length = Math.random() * 10;
        double width = Math.random() * 10;
        return new Rectangle(randomColor, length, width);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid(String randomColor) {
        double topBase = Math.random() * 10;
        double bottomBase = Math.random() * 10;
        double height = Math.random() * 10;
        return new IsoscelesTrapezoid(randomColor, topBase, bottomBase, height);
    }

    private Square getRandomSquare(String randomColor) {
        double side = Math.random() * 10;
        return new Square(randomColor, side);
    }

    private RightTriangle getRandomRightTriangle(String randomColor) {
        double firstLeg = Math.random() * 10;
        double secondLeg = Math.random() * 10;
        double hypotenuse = Math.random() * 10;
        return new RightTriangle(randomColor, firstLeg, secondLeg, hypotenuse);
    }
}
