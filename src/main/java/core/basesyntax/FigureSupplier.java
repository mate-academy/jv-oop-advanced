package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends Figure {

    public Figure getRandomFigure(Figures selectFigure) {
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();
        Random random = new Random();
        switch (selectFigure) {
            case CIRCLE:
                int randomRadius = random.nextInt(100);
                Circle randomCircle = new Circle(randomRadius);
                randomCircle.setColor(randomColor);
                randomCircle.setArea(randomCircle.getAreaFigure());
                return randomCircle;
            case SQUARE:
                int randomSquareSide = random.nextInt(100);
                Square randomSquare = new Square(randomSquareSide);
                randomSquare.setColor(randomColor);
                randomSquare.setArea(randomSquare.getAreaFigure());
                return randomSquare;
            case RECTANGLE:
                int randomFirstSide = random.nextInt(100);
                int randomSecondSide = random.nextInt(100);
                Rectangle randomRectangle = new Rectangle(randomFirstSide, randomSecondSide);
                randomRectangle.setColor(randomColor);
                randomRectangle.setArea(randomRectangle.getAreaFigure());
                return randomRectangle;
            case RIGHT_TRIANGLE:
                int firstLeg = random.nextInt(100);
                int secondLeg = random.nextInt(100);
                RightTriangle randomTriangle = new RightTriangle(firstLeg, secondLeg);
                randomTriangle.setColor(randomColor);
                randomTriangle.setArea(randomTriangle.getAreaFigure());
                return randomTriangle;
            case ISOSCELES_TRAPEZOID:
                int height = random.nextInt(100);
                int upperBase = random.nextInt(100);
                int lowerBase = random.nextInt(100);
                IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid(height, upperBase, lowerBase);
                trapezoid.setColor(randomColor);
                trapezoid.setArea(trapezoid.getAreaFigure());
                return trapezoid;
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
}
