package behavior;

import figures.Circle;
import figures.IsoscelesTrapezoid;
import figures.Rectangle;
import figures.RightTriangle;
import figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int upperLimit = 10;
    private static final int numberOfFigures = 6;

    public static Figure[] getRandomFigureArray() {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[new Random().nextInt(6)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        return figures;
    }

    public void printFiguresArray(Figure[] figures) {
        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i]);
        }
    }

    public Figure getRandomFigure() {
        Figure figure;
        switch (new Random().nextInt(numberOfFigures)) {
            case 1:
                figure = new Circle(new Random().nextInt(upperLimit));
                return figure;
            case 2:
                figure = new Square(new Random().nextInt(upperLimit));
                return figure;
            case 3:
                figure = new IsoscelesTrapezoid(new Random()
                        .nextInt(upperLimit),
                        new Random().nextInt(upperLimit),
                        new Random().nextInt(upperLimit));
                return figure;
            case 4:
                figure = new Rectangle(new Random().nextInt(upperLimit),
                        new Random().nextInt(upperLimit));
                return figure;
            case 5:
                figure = new RightTriangle(new Random().nextInt(upperLimit),
                        new Random().nextInt(upperLimit),
                        new Random().nextInt(upperLimit));
                return figure;
            default:
                return new Rectangle(1, 1);
        }
    }
}

