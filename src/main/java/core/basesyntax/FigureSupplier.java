package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int DEFAULT_RADIUS = 10;

    public Figure getRandomFigure() {
        int index = new Random().nextInt(NUMBER_OF_FIGURES);
        switch (index) {
            case 0 :
                return new Circle().createRandomFigure();
            case 1 :
                return new Rectangle().createRandomFigure();
            case 2 :
                return new Square().createRandomFigure();
            case 3 :
                return new RightTriangle().createRandomFigure();
            default :
                return new IsoscelesTrapezoid().createRandomFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }

}
