package core.basesyntax;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        final int figuresCount = 8;
        ColorSupplier colorSupp = new ColorSupplier();
        FigureSupplier figSupp = new FigureSupplier();
        Random randomValue = new Random();
        Figure[] figures = new Figure[figuresCount];
        for (int i = 0; i < figures.length / 2; i++) {
            switch (figSupp.getRundomFigure()) {
                case CIRCLE:
                    figures[i] = new Circle(
                            colorSupp.getRandomColor(),
                            randomValue.nextInt(100));
                    break;
                case ISOSCELESTRAPEZOID:
                    figures[i] = new IsoscelesTrapezoid(
                            colorSupp.getRandomColor(),
                            randomValue.nextInt(100),
                            randomValue.nextInt(100),
                            randomValue.nextInt(100));
                    break;
                case RECTANGLE:
                    figures[i] = new Rectangle(
                            colorSupp.getRandomColor(),
                            randomValue.nextInt(100),
                            randomValue.nextInt(100));
                    break;
                case RIGHTTRIANGLE:
                    figures[i] = new RightTriangle(
                            colorSupp.getRandomColor(),
                            randomValue.nextInt(100),
                            randomValue.nextInt(100));
                    break;
                case SQUARE:
                    figures[i] = new Square(
                            colorSupp.getRandomColor(),
                            randomValue.nextInt(100));
                    break;
                default:break;
            }
        }
        for (int i = figures.length / 2; i < figures.length; i++) {
            FigureSupplier figureSupplier = new FigureSupplier();
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (int i = 0; i < figures.length; i++) {
            System.out.println("Figure " + (i + 1) + ": "
                    + figures[i].getType()
                    + ", area: " + figures[i].getArea()
                    + " sq.units," + figures[i].getSizes()
                    + " color: " + figures[i].getColor());
        }
    }
}
