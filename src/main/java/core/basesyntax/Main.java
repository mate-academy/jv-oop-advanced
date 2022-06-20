package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = {new Square().getRandomFigure(),
                new IsoscelesTrapezoid().getRandomFigure(),
                new Rectangle().getRandomFigure(), new Circle().getDefaultFigure(),
                new Circle().getDefaultFigure(), new Circle().getDefaultFigure()};
        for (Figure figure: figures) {
            figure.print();
        }
    }
}
