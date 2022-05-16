package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        Figure figure;
        Random random = new Random();
        int randomShape = random.nextInt(Shape.values().length);
        String color = String.valueOf(colorSupplier.getRandomColor());
        // all types of figures have at least one parameter, radius or square's side (dimension1)
        int dimension1 = new Random().nextInt(10) + 1;
        int dimension2;
        switch (Shape.values()[randomShape]) {
            case CIRCLE:
                figure = new Circle(color, dimension1);
                break;
            case SQUARE:
                figure = new Square(color, dimension1);
                break;
            case RIGHT_TRIANGLE:
                dimension2 = new Random().nextInt(10) + 1; // second leg
                figure = new RightTriangle(color, dimension1, dimension2);
                break;
            case RECTANGLE:
                dimension2 = new Random().nextInt(10) + 1; // second side
                figure = new Rectangle(color, dimension1, dimension2);
                break;
            case ISOSCELES_TRAPEZOID:
                do {
                    dimension2 = new Random().nextInt(10) + 1;
                } while (dimension1 == dimension2); // we want to obtain trapezoid, not square!
                int heightTrapezoid = new Random().nextInt(10) + 1;
                // dimension1 - should be a bottom side and dimension2 should be a top side
                // it's more adequate to suppose that top side of trapezoid will be lesser than
                // its bottom, so, we will reverse determinate sides if following condition is true:
                if (dimension1 < dimension2) {
                    figure = new IsoscelesTrapezoid(color, dimension2, dimension1, heightTrapezoid);
                }
                figure = new IsoscelesTrapezoid(color, dimension1, dimension2, heightTrapezoid);
                break;
            default:
                figure = getDefaultFigure();
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(String.valueOf(Color.WHITE), 10);
    }
}
