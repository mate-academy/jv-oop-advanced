package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends Figure {
    private Random random = new Random();

    public Figure getRandomFigure(Figures selectFigure) {
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();
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
        circle.setArea(circle.getAreaFigure());
        return circle;
    }

    private Figure getRandomCircle() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();
        int randomRadius = random.nextInt(100);
        Circle randomCircle = new Circle(randomRadius);
        randomCircle.setColor(randomColor);
        randomCircle.setArea(randomCircle.getAreaFigure());
        return randomCircle;
    }

    private Figure getRandomSquare() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();
        int randomSquareSide = random.nextInt(100);
        Square randomSquare = new Square(randomSquareSide);
        randomSquare.setColor(randomColor);
        randomSquare.setArea(randomSquare.getAreaFigure());
        return randomSquare;
    }
    private  Figure getRandomRectangle() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();
        int randomFirstSide = random.nextInt(100);
        int randomSecondSide = random.nextInt(100);
        Rectangle randomRectangle = new Rectangle(randomFirstSide, randomSecondSide);
        randomRectangle.setColor(randomColor);
        randomRectangle.setArea(randomRectangle.getAreaFigure());
        return randomRectangle;
    }

    private Figure getRandomTriangle() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();
        int firstLeg = random.nextInt(100);
        int secondLeg = random.nextInt(100);
        RightTriangle randomTriangle = new RightTriangle(firstLeg, secondLeg);
        randomTriangle.setColor(randomColor);
        randomTriangle.setArea(randomTriangle.getAreaFigure());
        return randomTriangle;
    }

    private Figure getRandomTrapezoid() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();
        int height = random.nextInt(100);
        int upperBase = random.nextInt(100);
        int lowerBase = random.nextInt(100);
        IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid(height, upperBase, lowerBase);
        trapezoid.setColor(randomColor);
        trapezoid.setArea(trapezoid.getAreaFigure());
        return trapezoid;
    }
}
