package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();

    public Figure getRandomFigure() {
        Circle circle = new Circle();
        Square square = new Square();
        IsoscelesTapezoid isoscelesTapezoid = new IsoscelesTapezoid();
        Rectangle rectangle = new Rectangle();
        RightTriangle rightTriangle = new RightTriangle();
        Figure[] allFigures = {circle,square,isoscelesTapezoid,rectangle,rightTriangle};
        int index = random.nextInt(allFigures.length);
        return allFigures[index];
    }

    public Circle getDefaultFigure() {
        return new Circle(10, Colors.WHITE);
    }
}
