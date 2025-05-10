package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random randomFigure = new Random();
    private ColorSupplier color = new ColorSupplier();
    private Figures[] figures = Figures.values();

    public Figure getRandomFigure() {
        Figures selectFigure = figures[randomFigure.nextInt(figures.length)];
        switch (selectFigure) {
            case CIRCLE:
                return getRandomCircle();
            case SQUARE:
                return getRandomSquare();
            case RECTANGLE:
                return getRandomRectangle();
            case RIGHT_TRIANGLE:
                return getRandomTriangle();
            case ISOSCELES_TRAPEZOID:
                return getRandomTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(10);
        circle.setColor("WHITE");
        return circle;
    }

    private Figure getRandomCircle() {
        String randomColor = color.getRandomColor();
        int randomRadius = randomFigure.nextInt(100);
        Circle randomCircle = new Circle(randomRadius);
        randomCircle.setColor(randomColor);
        return randomCircle;
    }

    private Figure getRandomSquare() {
        String randomColor = color.getRandomColor();
        int randomSquareSide = randomFigure.nextInt(100);
        Square randomSquare = new Square(randomSquareSide);
        randomSquare.setColor(randomColor);
        return randomSquare;
    }

    private Figure getRandomRectangle() {
        String randomColor = color.getRandomColor();
        int randomFirstSide = randomFigure.nextInt(100);
        int randomSecondSide = randomFigure.nextInt(100);
        Rectangle randomRectangle = new Rectangle(randomFirstSide, randomSecondSide);
        randomRectangle.setColor(randomColor);
        return randomRectangle;
    }

    private Figure getRandomTriangle() {
        String randomColor = color.getRandomColor();
        int firstLeg = randomFigure.nextInt(100);
        int secondLeg = randomFigure.nextInt(100);
        RightTriangle randomTriangle = new RightTriangle(firstLeg, secondLeg);
        randomTriangle.setColor(randomColor);
        return randomTriangle;
    }

    private Figure getRandomTrapezoid() {
        String randomColor = color.getRandomColor();
        int height = randomFigure.nextInt(100);
        int upperBase = randomFigure.nextInt(100);
        int lowerBase = randomFigure.nextInt(100);
        IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid(height, upperBase, lowerBase);
        trapezoid.setColor(randomColor);
        return trapezoid;
    }

}
