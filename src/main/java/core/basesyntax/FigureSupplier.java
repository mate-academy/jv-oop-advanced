package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Random random = new Random();
        int randomFigure = random.nextInt(5) + 1;
        switch (randomFigure) {
            case 1:
                Figure circle = new Circle();
                circle.informationFigure();
                break;
            case 2:
                Figure square = new Square();
                square.informationFigure();
                break;
            case 3:
                Figure rectangle = new Rectangle();
                rectangle.informationFigure();
                break;
            case 4:
                Figure rightTriangle = new RightTriangle();
                rightTriangle.informationFigure();
                break;
            case 5:
                Figure isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.informationFigure();
                break;
            default:
                break;
        }
        return null;
    }
}
