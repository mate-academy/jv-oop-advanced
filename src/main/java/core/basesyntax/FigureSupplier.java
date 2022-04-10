package core.basesyntax;

public class FigureSupplier {
    static Figure[] figures = {
            new Square (),
            new Rectangle (),
            new RightTriangle (),
            new Circle (),
            new IsoscelesTrapezoid ()
    };

    public static Figure getRandomFigure() {
        int index = Main.random.nextInt(figures.length);
        return figures[index].setRandomParameters();
    }

    public static Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(10);
        circle.setColor("white");
        return circle;
    }
}
