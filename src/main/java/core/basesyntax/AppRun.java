package core.basesyntax;

public class AppRun {
    public static void main(String [] arg) {
        FigureSupplier figSup = new FigureSupplier();
        Figure [] figure = new Figure[4];
        for (int i = 0; i < figure.length; i++) {
            figure [i] = (i < 3) ? figSup.getRandomFigure() : figSup.getDefaultFigure();
        }
        for (Figure fig: figure) {
            fig.getInfo();
        }
    }
}
