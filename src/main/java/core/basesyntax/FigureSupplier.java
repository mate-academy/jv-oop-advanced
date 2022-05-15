package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Figure figure = getDefaultFigure();
        Random random = new Random();
        int randomNumber = random.nextInt(Shape.values().length);
        String color = String.valueOf(new ColorSupplier().getRandomColor());
        int dimension1 = new Random().nextInt(10);
        int dimension2 = new Random().nextInt(10);
        int dimension3 = new Random().nextInt(10);
        switch (Shape.values()[randomNumber]) {
            case CIRCLE:
                figure = new Circle(color, dimension1);
                break;
            case SQUARE:
                figure = new Square(color, dimension1);
                break;
            case RIGHT_TRIANGLE:
                figure = new RightTriangle(color, dimension1, dimension2);
                break;
            case RECTANGLE:
                figure = new Rectangle(color, dimension1, dimension2);
                break;
            case ISOSCELES_TRAPEZOID:
                figure = new IsoscelesTrapezoid(color, dimension1, dimension2, dimension3);
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
    //this method should always return white circle with radius 10.
        return new Circle(String.valueOf(Color.WHITE), 10);
    }
}
