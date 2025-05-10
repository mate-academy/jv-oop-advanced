package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[6];
        //Filling first half of an array
        int index = 0;
        for (int i = 0; i < figures.length / 2;i++) {
            figures[i] = figureSupplier.getRandomFigure();
            index++;
        }
        //Filling the other part of an array
        for (int i = index;i < figures.length;i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        //Displaying entire list of objects
        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
