package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureOne = new FigureSupplier();
        Figure firstFigure = figureOne.getRandomFigure();
        FigureSupplier figureTwo = new FigureSupplier();
        Figure secondFigure = figureTwo.getRandomFigure();
        FigureSupplier figureThree = new FigureSupplier();
        Figure thirdFigure = figureThree.getRandomFigure();
        Figure[] arraysFigure = {firstFigure, secondFigure, thirdFigure};
        for (int i = 0; i < arraysFigure.length; i++) {
            System.out.println(arraysFigure[i].getDraw());
        }
    }
}
