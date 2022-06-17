package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = {new Square().getRandomFigure(),
                new IsoscelesTrapezoid().getRandomFigure(),
                new Rectangle().getRandomFigure(), new Figure().getDefaultFigure(),
                new Figure().getDefaultFigure(), new Figure().getDefaultFigure()};
        for (Figure figure: figures) {
            figure.print();
        }
    }
}
