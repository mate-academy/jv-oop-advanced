package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private FigType figure;

    public FigType getRandomFigType() {
        return FigType.values()[random.nextInt(FigType.values().length)];
    }

    public Figure getRandomFigure() {
        figure = FigType.values()[random.nextInt(FigType.values().length)];
        switch (figure) {
            case Circle:  Circle circle = new Circle();
            circle.getRandomFigureSup();
            circle.setType(figure);
            return circle;
            case Square: Square square = new Square();
            square.getRandomFigureSup();
            square.setType(figure);
            return square;
            case Rectangle: Rectangle rectangle = new Rectangle();
            rectangle.getRandomFigureSup();
            rectangle.setType(figure);
            return rectangle;
            case RightTriangle: RightTriangle rightTriangle = new RightTriangle();
            rightTriangle.getRandomFigureSup();
            rightTriangle.setType(figure);
            return rightTriangle;
            case IsoscelesTrapezoid: IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
            isoscelesTrapezoid.getRandomFigureSup();
            isoscelesTrapezoid.setType(figure);
            return isoscelesTrapezoid;
            default:return null;
        }

    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.getDefaultFigureSup();
        circle.setType(FigType.Circle);
        return circle;
    }
}
