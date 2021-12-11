package core.basesyntax;

public class MainFigures {
    public static void main(String[] args) {

        Figure[] outfigure = new Figure[6];
        FigureSupplier figsuplier = new FigureSupplier();

        for (int i = 0; i < outfigure.length; i++) {
            if (i < (outfigure.length / 2)) {
                outfigure[i] = figsuplier.getRandomFigure();
            } else {
                outfigure[i] = figsuplier.getDefaultFigure();
            }
            outfigure[i].draw();
        }
    }
}
