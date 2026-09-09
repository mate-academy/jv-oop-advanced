package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier fs = new FigureSupplier();
        Figure[] figures = {
                fs.getRandomFigure(),
                fs.getRandomFigure(),
                fs.getRandomFigure(),
                fs.getDefaultFigure(),
                fs.getDefaultFigure(),
                fs.getDefaultFigure()
        };

        for (Figure el : figures) {
            el.draw();
        }
    }
}
