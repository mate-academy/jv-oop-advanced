package core.basesyntax;

public class HelloWorld {
    public static void main(String[] args) {
        Figures [] figures = new Figures [(int) (Math.random() * 5 + 1)];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (Figures figure : figures) {
            System.out.println(figure.informationOfFigure());
        }
    }

}
