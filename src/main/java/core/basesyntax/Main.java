package core.basesyntax;

import java.util.Random;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[] args) {

        FigureSupplier figureSupplier = new FigureSupplier();

        AbstractFigure [] figures = new AbstractFigure[6];

        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = (AbstractFigure) figureSupplier.getRandomFigure();
        }

        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = (AbstractFigure) figureSupplier.getDefaultFigure();
        }

        for (AbstractFigure f : figures) {
            System.out.println(f.getInfo());
        }

        System.out.println();
        getFigureList();
    }

    public static void getFigureList() {
        final Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();

        AbstractFigure circle = new Circle(random.nextInt(20), colorSupplier.getRandomColor());
        AbstractFigure trapezoid = new IsoscelesTrapezoid(random.nextInt(20),
                random.nextInt(20), random.nextInt(20), colorSupplier.getRandomColor());
        AbstractFigure triangle = new RightTriangle(random.nextInt(20), random.nextInt(20),
                colorSupplier.getRandomColor());
        AbstractFigure rectangle = new Rectangle(random.nextInt(20), random.nextInt(20),
                colorSupplier.getRandomColor());
        AbstractFigure square = new Square(random.nextInt(20), colorSupplier.getRandomColor());

        AbstractFigure [] figureList = new AbstractFigure[] {circle, trapezoid,
                triangle, rectangle, square};

        for (AbstractFigure figure: figureList) {
            System.out.println(figure.getInfo());
        }
    }

}

