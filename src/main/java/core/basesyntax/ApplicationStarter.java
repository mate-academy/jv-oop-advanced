package core.basesyntax;

public class ApplicationStarter {
    public static void main(String[] args) {
        FiguresGenerator generator = new FiguresGenerator();
        Figure[] figures = generator.generateFiguresArray();
        for (Figure figure : figures) {
            System.out.println(figure.getParameters());
        }
    }
}
