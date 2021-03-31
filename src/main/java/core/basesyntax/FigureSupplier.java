package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int LIMIT = 5;
    public Shapes randomFigure() {
        Shapes shapes = null;
        Random random = new Random(LIMIT);
        int ran = random.nextInt();
        switch (ran) {
            case 1:
                shapes = new Circle();
                break;
            case 2:
                shapes = new Square();
                break;
            case 3:
                shapes = new Rectangle();
                break;
            case 4:
                shapes = new IsoscelesTrapezoid();
                break;
            case 5:
                shapes = new RightTriangle();
        }
        return shapes;
    }

}



