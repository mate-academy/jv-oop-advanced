package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figureList = new Figure[6];
        for (int i = 0; i < 6; i++) {
            figureList[i] = i < 3 ? new FigureSupplier().getRandomFigure() :
                    new FigureSupplier().getDefaultFigure();
        }
        System.out.println(figureList.length);
        for (Figure figureInfo: figureList) {
            figureInfo.infoAboutFigure();
        }
    }
}
