package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier randomColor = new ColorSupplier();

    public Figure getRandomFigure() {
        Figures [] figures = Figures.values();
        int index = random.nextInt(figures.length);
        //Figures randomFigure = figures [index];
        switch (figures[index]) {
            case CIRCLE:
                return new Circle(randomColor.getRandomColor(),Figures.CIRCLE,random.nextInt(100));
            case SQUARE:
                return new Square(randomColor.getRandomColor(),Figures.SQUARE,random.nextInt(100));
            case RECTANGLE:
                return new Rectangle(randomColor.getRandomColor(),Figures.RECTANGLE,
                        random.nextInt(100),random.nextInt(100));
            case RIGHT_TRIANGLE:
                return new RightTriangle(randomColor.getRandomColor(),Figures.RIGHT_TRIANGLE,
                        random.nextInt(100),random.nextInt(100));
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(randomColor.getRandomColor(),
                        Figures.ISOSCELES_TRAPEZOID,random.nextInt(100),
                        random.nextInt(100),random.nextInt(100));
            default:
        }
        return null;
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE,Figures.CIRCLE,10);
    }
}
