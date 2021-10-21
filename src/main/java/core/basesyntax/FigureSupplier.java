package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure[] generateRandomFigureList(Figure[] figures) {
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = getRandomFigure();
        }
        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = getDefaultFigure();
        }
        return figures;
    }

    public Figure getRandomFigure() {
        final int AMOUNT_OF_FIGURES = 5;
        int randomFigure = new Random().nextInt(AMOUNT_OF_FIGURES - 1) + 1;
        switch (randomFigure) {
            case 1: return getRandomCircle();
            case 2: return getRandomIsoscelesTrapezoid();
            case 3: return getRandomRectangle();
            case 4: return getRandomRightTriangle();
            case 5: return getRandomSquare();
        }
        return new Figure("");
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), 10 );
    }

    public Figure getRandomCircle () {
        return new Circle(new ColorSupplier().getRandomColor(),
                new Random().nextInt(20) + 1);
    }

    public Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                new Random().nextInt(20) + 1,
                new Random().nextInt(20) + 1,
                new Random().nextInt(20) + 1);
    }

    public Figure getRandomRectangle() {
        return new Rectangle(new ColorSupplier().getRandomColor(),
                new Random().nextInt(20) + 1,
                new Random().nextInt(20) + 1);
    }

    public Figure getRandomRightTriangle() {
        return new RightTriangle(new ColorSupplier().getRandomColor(),
                new Random().nextInt(20) + 1,
                new Random().nextInt(20) + 1);
    }

    public Figure getRandomSquare() {
        return new Square(new ColorSupplier().getRandomColor(),
                new Random().nextInt(20) + 1);
    }
}
