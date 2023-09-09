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
                double side = getRandomSquare();
                return new Square(randomColor, side);
            case "rectangle":
                double length = getRandomSquare();
                double width = getRandomSquare();
                return new Rectangle(randomColor, length, width);
            case "right triangle":
                double firstLeg = getRandomSquare();
                double secondLeg = getRandomSquare();
                double hypotenuse = getRandomSquare();
                return new RightTriangle(randomColor, firstLeg, secondLeg, hypotenuse);
            case "circle":
                double radius = getRandomSquare();
                return new Circle(randomColor, radius);
            case "isosceles trapezoid":
            default:
                return new Circle("WHITE", 10); // explain this moment please
        }
    }

    final Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }

    public double getRandomSquare() {
        return Math.random() * 10;
    }
}
