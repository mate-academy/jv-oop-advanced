package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final int parametersNumber = 50;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure[] figures = getFigures();
        int maximumNumber = figures.length;
        int randomFigureNumber = random.nextInt(maximumNumber);
        return figures[randomFigureNumber];
    }

    private Figure[] getFigures() {
        int randomParameter = random.nextInt(parametersNumber);
        String color = colorSupplier.getRandomColor();
        Circle circle = new Circle(color, randomParameter);
        IsoscelesTrapezoid isoscelesTrapezoid =
                new IsoscelesTrapezoid(color, randomParameter, randomParameter, randomParameter);
        Rectangle rectangle = new Rectangle(color, randomParameter,randomParameter);
        RightTriangle rightTriangle = new RightTriangle(color, randomParameter, randomParameter);
        Square square = new Square(color, randomParameter);
        return new Figure[]{circle, isoscelesTrapezoid, rectangle, rightTriangle, square};
    }

    public Figure getDefaultFigure() {
        String whiteColor = Colors.WHITE.name();
        return new Circle(whiteColor, 10);
    }
}
