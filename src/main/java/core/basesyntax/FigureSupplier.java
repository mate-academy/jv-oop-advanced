package core.basesyntax;

public class FigureSupplier {
    private static final Circle c = new Circle();
    private static final IsoscelesTrapezoid it = new IsoscelesTrapezoid();
    private static final Rectangle r = new Rectangle();
    private static final RightTriangle rt = new RightTriangle();
    private static final Square s = new Square();
    private static final String[] figures =
            {it.draw(), it.draw(), c.draw(), r.draw(), rt.draw(), s.draw()};

    public static double getRandomProperties() {
        double max = 1.0;
        double min = 15.0;
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static String getRandomFigures() {
        int min = 1;
        int max = figures.length;
        int randomNumber = (int) (Math.random() * (max - min)) + min;
        StringBuilder sb = new StringBuilder();
        while (randomNumber != 0 && randomNumber <= figures.length) {
            sb.append(figures[randomNumber]).append("\n");
            randomNumber--;
        }
        return sb.toString();
    }
}
