package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final double FIGURE_VALUE_MIN = 2;
    public static final double FIGURE_VALUE_MAX = 40;
    private ColorSupplier color = new ColorSupplier();
    private Random random = new Random();
    private Figure result;

    public Figure getRandomFigure() {
        double scale = Math.pow(10, 0);
        double [] figureValue = new double[3];
        int figureNumber = random.nextInt(FIGURE_COUNT);
        for (int i = 0; i < figureValue.length; i++) {
            figureValue[i] = FIGURE_VALUE_MIN + (FIGURE_VALUE_MAX - FIGURE_VALUE_MIN)
                    * random.nextDouble();
            figureValue[i] = Math.ceil(figureValue[i] * scale) / scale;
        }
        switch (figureNumber) {
            case 0:
                result = new Circle(figureValue[0]);
                break;
            case 1:
                result = new Square(figureValue[0]);
                break;
            case 2:
                result = new Rectangle(figureValue[0], figureValue[1]);
                break;
            case 3:
                result = new RightTriangle(figureValue[0], figureValue[1]);
                break;
            case 4:
                result = new IsoscelesTrapezoid(figureValue[0], figureValue[1], figureValue[2]);
                break;
            default:
                break;
        }
        result.setColor(color.getRandomColor());
        return result;
    }

    public Figure getDefaultFigure() {
        Figure circle = new Figure() {
            @Override
            public void draw() {
                System.out.println("Figure: circle, area: 314.16 sq.units, radius: 10 units, "
                        + "color: " + getColor());
            }
        };
        circle.setColor("white");
        return circle;
    }
}
