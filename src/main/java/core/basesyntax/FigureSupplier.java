package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 4;
    private Random random = new Random();
    private ColorSupplier color = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = new Random().nextInt(FIGURE_COUNT);
        String[] figures = new String[]{"circle", "square", "triangle", "trapezoid"};
        Figure figure = null;
        switch (figures[index]) {
            case ("circle"): {
                figure =  new Circle(color.getRandomColor(), random.nextInt(10) + 1);
                break;
            }
            case ("square"): {
                figure =  new Square(color.getRandomColor(), random.nextInt(10) + 1);
                break;
            }
            case ("triangle"): {
                figure =  new RightTriangle(color.getRandomColor(), random.nextInt(10) + 1);
                break;
            }
            case ("trapezoid"): {
                figure =  new IsoscelesTrapezoid(color.getRandomColor(), random.nextInt(10) + 1,
                        + random.nextInt(10) + 1, random.nextInt(10) + 1);
            }
            default:
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.ORANGE, 10);
    }
}
