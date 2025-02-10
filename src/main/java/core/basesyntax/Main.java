package core.basesyntax;

public class Main {
    public static void main(String[] args) {

        FigureSupplier figureSupplier = new FigureSupplier();

        Figure randomRightTriangle = figureSupplier.getRandomFigure();
        Figure randomCircle = figureSupplier.getRandomFigure();
        Figure randomSquare = figureSupplier.getRandomFigure();
        Figure randomTrapezoid = figureSupplier.getRandomFigure();
        Figure whiteTriangle = figureSupplier.getDefaultFigure();

        Figure[] figures = {randomRightTriangle, randomCircle, randomSquare, randomTrapezoid, whiteTriangle};
        for (int i = 0; i < figures.length; i++) {
            if (i <= figures.length / 2) {
                System.out.println(figures[i].getArea());
            }
        }
        System.out.println(whiteTriangle.getArea() +" " + Color.WHITE);
    }
}
