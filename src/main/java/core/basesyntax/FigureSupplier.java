package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier cs = new ColorSupplier();
        int index = random.nextInt(4);
        Figure figure;
        switch (index) {
            case 0:
                figure = new Circle(random.nextInt(100), cs.getRandomColor());
                break;
            case 1:
                figure = new Square(random.nextInt(100), cs.getRandomColor());
                break;
            case 2:
                figure = new Rectangle(random.nextInt(100),
                        random.nextInt(100), cs.getRandomColor());
                break;
            case 3:
                figure = new IsoscelesTrapezoid(random.nextInt(100),
                        random.nextInt(100), random.nextInt(100), cs.getRandomColor());
                break;
            case 4:
                figure = new RightTriangle(random.nextInt(100),
                        random.nextInt(100), cs.getRandomColor());
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + index);
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.toString());
    }
}
