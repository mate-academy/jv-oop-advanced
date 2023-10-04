package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        Figure[] figures = new Figure[8];
        Circle circle = new Circle();
        figures[0] = circle.getRandomFigure();
        RightTriangle rightTriangle = new RightTriangle();
        figures[1] = rightTriangle.getRandomFigure();
        Rectangle rectangle = new Rectangle();
        figures[2] = rectangle.getRandomFigure();
        Square square = new Square();
        figures[3] = square.getRandomFigure();
        figures[4] = circle.getDefaultFigure();
        figures[5] = rectangle.getDefaultFigure();
        figures[6] = square.getDefaultFigure();
        figures[7] = rightTriangle.getDefaultFigure();
        for (int i = 0; i < 8; i++) {
            System.out.println(figures[i]);
        }
    }
}
