package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        /*
        Figure square = new Square(Color.WHITE, 25);
        square.draw();
        Figure rectangle = new Rectangle(Color.BLACK, 10, 20);
        rectangle.draw();
        Figure rightTriangle = new RightTriangle(Color.GREEN, 3, 4);
        rightTriangle.draw();
        Figure circle = new Circle(Color.RED, 5);
        circle.draw();
        Figure isoscelesTrapesoid = new IsoscelesTrapezoid(Color.BLUE, 8, 13, 7);
        isoscelesTrapesoid.draw();

        FigureSupplier figureSupplier = new FigureSupplier();
        Figure rnd = figureSupplier.getRandomFigure();
        rnd.draw();
        Figure def = figureSupplier.getDefaultFigure();
        def.draw(); */

        FigureSupplier figureSupplier = new FigureSupplier();
        final int numberOfFigures = 6;
        Figure[] figureArray = new Figure[numberOfFigures];

        for (int i = 0; i < numberOfFigures / 2; i++) {
            figureArray[i] = figureSupplier.getRandomFigure();
            figureArray[i].draw();
        }

        for (int i = numberOfFigures / 2; i < numberOfFigures; i++) {
            figureArray[i] = figureSupplier.getDefaultFigure();
            figureArray[i].draw();
        }
    }
}
