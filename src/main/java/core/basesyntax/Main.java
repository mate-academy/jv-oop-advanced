package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] Figures = new Figure[6];
        for (int i = 0; i < Figures.length / 2; i++) {
            Figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = Figures.length / 2; i < Figures.length; i++) {
            Figures[i] = figureSupplier.getDefaultFigure();
        }

        for(Figure figure:Figures){
            figure.draw();
            System.out.println();
        }


    }
}
