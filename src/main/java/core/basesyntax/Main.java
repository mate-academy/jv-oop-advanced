package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        FigureSupplier x = new FigureSupplier();
        Figure[] arrFigures = new Figure[6];
        for (int i = 0; i < 3; i++) {
            arrFigures[i] = x.getRandomFigure();
            arrFigures[i + 3] = x.getDefaultFigure();
        }
        for (int i = 0; i < 6; i++) {
            System.out.println("Figure: " + arrFigures[i].getFigureInfo());
            //System.out.println("Figure: " + x.getDefaultFigure().getFigureInfo());
        }
    }
}
