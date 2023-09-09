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
                double side = Math.random() * 10;
                return new Square(randomColor, side);
            case "rectangle":
                double length = Math.random() * 10;
                double width = Math.random() * 10;
                return new Rectangle(randomColor, length, width);
            case "right triangle":
                double firstLeg = Math.random() * 10;
                double secondLeg = Math.random() * 10;
                double hypotenuse = Math.random() * 10;
                return new RightTriangle(randomColor, firstLeg, secondLeg, hypotenuse);
            case "circle":
                double radius = Math.random() * 10;
                return new Circle(randomColor, radius);
            case "isosceles trapezoid":
                double topBase = Math.random() * 10;
                double bottomBase = Math.random() * 10;
                double height = Math.random() * 10;
                return new IsoscelesTrapezoid(randomColor, topBase, bottomBase, height);
            default:
                return new Circle("WHITE", 10);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
