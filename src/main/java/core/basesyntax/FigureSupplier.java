package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int LIMIT = 6;
    private static final int LIMIT_SIDE_SHAPES = 10;
    private ColorSupplier color = new ColorSupplier();

    public Shape[] getRandomFigure() {
        Random random = new Random();
        int randomNumber = random.nextInt(LIMIT);
        Shape[] shape = new Shape[randomNumber];
        for (int i = 0; i < shape.length; i++) {
            switch (randomNumber) {
                case 1:
                    shape[i] = new Circle(random.nextInt(LIMIT_SIDE_SHAPES),
                            color.randomColor());
                    break;
                case 2:
                    shape[i] = new Square(random.nextInt(LIMIT_SIDE_SHAPES), color.randomColor());
                    break;
                case 3:
                    shape[i] = new Rectangle(random.nextInt(LIMIT_SIDE_SHAPES),
                            random.nextInt(LIMIT_SIDE_SHAPES), color.randomColor());
                    break;
                case 4:
                    shape[i] = new IsoscelesTrapezoid(random.nextInt(LIMIT_SIDE_SHAPES),
                            random.nextInt(LIMIT_SIDE_SHAPES), color.randomColor());
                    break;
                case 5:
                default:

                    shape[i] = new RightTriangle(random.nextInt(LIMIT_SIDE_SHAPES),
                            random.nextInt(LIMIT_SIDE_SHAPES),
                            color.randomColor());
                    break;
            }

        }
        return shape;
    }

}
