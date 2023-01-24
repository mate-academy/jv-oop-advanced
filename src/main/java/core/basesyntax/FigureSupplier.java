package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends Figure {
    public static final int maxBound = 100;

    public Figure getRandomFigure() {
        Random randomNumber = new Random();
        int randomIndexFigure = randomNumber.nextInt(Figures.values().length);
        if (randomIndexFigure == 0) { //index 0 = square
            Figure square = new Square(randomNumber.nextInt(maxBound));//side 0-100
            ColorSupplier colorSupplier = new ColorSupplier();
            square.setColor(colorSupplier.getRandomColor());
            square.setFigure(Figures.values()[randomIndexFigure].toString());
            return square;
        }
        if (randomIndexFigure == 1) { //index 1 = Rectangle
            Figure rectangle = new Rectangle(randomNumber.nextInt(maxBound), randomNumber.nextInt(maxBound));//width 0-100, height 0-100
            ColorSupplier colorSupplier = new ColorSupplier();
            rectangle.setColor(colorSupplier.getRandomColor());
            rectangle.setFigure(Figures.values()[randomIndexFigure].toString());
            return rectangle;
        }
        if (randomIndexFigure == 2) { //index 2 = RightTriangle
            Figure rightTriangle = new RightTriangle(randomNumber.nextInt(maxBound), randomNumber.nextInt(maxBound));//firstleg 0-100, secondleg 0-100)
            ColorSupplier colorSupplier = new ColorSupplier();
            rightTriangle.setColor(colorSupplier.getRandomColor());
            rightTriangle.setFigure(Figures.values()[randomIndexFigure].toString());
            return rightTriangle;
        }
        if (randomIndexFigure == 3) { //index 3 = Circle
            Figure circle = new Circle(randomNumber.nextInt(maxBound));//radius 0-100
            ColorSupplier colorSupplier = new ColorSupplier();
            circle.setColor(colorSupplier.getRandomColor());
            circle.setFigure(Figures.values()[randomIndexFigure].toString());
            return circle;
        }
        if (randomIndexFigure == 4) { //index 4 = IsoscelesTrapezoid
            Figure isoscelesTrapezoid = new IsoscelesTrapezoid(randomNumber.nextInt(maxBound), randomNumber.nextInt(maxBound), randomNumber.nextInt(100));//baseA, baseB, height 0-100
            ColorSupplier colorSupplier = new ColorSupplier();
            isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
            isoscelesTrapezoid.setFigure(Figures.values()[randomIndexFigure].toString());
            return isoscelesTrapezoid;
        }
        return getDefaultFigure();
    }

    public Figure getDefaultFigure() {
        Figure circle = new Circle(10);
        circle.setColor(Colors.WHITE.toString());
        circle.setFigure("Circle");
        return circle;
    }

    @Override
    public void draw() {

    }
}
