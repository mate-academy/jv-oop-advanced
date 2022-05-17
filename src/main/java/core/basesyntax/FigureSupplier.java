package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int BOUND_BALL_NUMBER = 10;
    private static final int BOUND_SHAPES = 5;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        Figure figure;
        String color = String.valueOf(colorSupplier.getRandomColor());
        int dimension1 = new Random().nextInt(BOUND_BALL_NUMBER) + 1;
        int dimension2;
        switch (new Random().nextInt(BOUND_SHAPES) + 1) {
            case 1:
                figure = new Circle(color, dimension1);
                break;
            case 2:
                figure = new Square(color, dimension1);
                break;
            case 3:
                dimension2 = new Random().nextInt(BOUND_BALL_NUMBER) + 1;
                figure = new RightTriangle(color, dimension1, dimension2);
                break;
            case 4:
                dimension2 = new Random().nextInt(BOUND_BALL_NUMBER) + 1;
                figure = new Rectangle(color, dimension1, dimension2);
                break;
            default:
                do {
                    dimension2 = new Random().nextInt(BOUND_BALL_NUMBER) + 1;
                } while (dimension1 == dimension2);
                int heightTrapezoid = new Random().nextInt(BOUND_BALL_NUMBER) + 1;
                if (dimension1 > dimension2) {
                    figure = new IsoscelesTrapezoid(color, dimension2, dimension1, heightTrapezoid);
                } else {
                    figure = new IsoscelesTrapezoid(color, dimension1, dimension2, heightTrapezoid);
                }
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(String.valueOf(Color.WHITE), BOUND_BALL_NUMBER);
    }
}
