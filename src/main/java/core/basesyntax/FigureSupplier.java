package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Circle circle = new Circle();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(5) + 1;
        switch (figureNumber) {
            case 1:
                return new Square().createRandomSquare();
            case 2:
                return new Circle().createRandomCircle();
            case 3:
                return new Rectangle().getRandomRectangle();
            case 4:
                return new RightTriangle().getRandomRightTriangle();
            case 5:
                return new IsoscelesTrapezoid().getRandomIsoscelesTrapezoid();
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(100 * Math.PI, Color.WHITE.name(), 10);
    }
}
