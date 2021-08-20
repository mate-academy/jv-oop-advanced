package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return createCircle();
            case 1:
                return createIsoscelesTrapezoid();
            case 2:
                return createRectangle();
            case 3:
                return createRightTriangle();
            default:
                return createSquare();
        }
    }

    private Figure createCircle() {
        int radius = random.nextInt(9) + 1;
        String name = "circle";
        String color = colorSupplier.getRandomColor();
        return new Circle(radius, color,name);
    }

    private Figure createIsoscelesTrapezoid() {
        int firstLeg = random.nextInt(9) + 1;
        int secondLeg = random.nextInt(9) + 1;
        int height = random.nextInt(9) + 1;
        String name = "trapezoid";
        String color = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(firstLeg, secondLeg, height, color, name);
    }

    private Figure createRectangle() {
        int firstLeg = random.nextInt(9) + 1;
        int secondLeg = random.nextInt(9) + 1;
        String name = "rectangle";
        String color = colorSupplier.getRandomColor();
        return new Rectangle(firstLeg, secondLeg, color, name);
    }

    private Figure createRightTriangle() {
        int firstLeg = random.nextInt(9) + 1;
        int secondLeg = random.nextInt(9) + 1;
        String name = "triangle";
        String color = colorSupplier.getRandomColor();
        return new RightTriangle(firstLeg, secondLeg, color, name);
    }

    private Figure createSquare() {
        int leg = random.nextInt(9) + 1;
        String name = "square";
        String color = colorSupplier.getRandomColor();
        return new Square(leg, color, name);
    }
}
