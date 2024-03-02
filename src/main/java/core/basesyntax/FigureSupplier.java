package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final int FIGURE_COUNT = 4;
    static final int FIGURE_SIZE = 50;
    private Random random = new Random();
    private Figure[] listFigure = new Figure[4];
    private Square square = new Square();
    private Rectangle rectangle = new Rectangle();
    private RightTriangle rightTriangle = new RightTriangle();
    private Circle circle = new Circle();
    private IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        if (index == 0) {
            square.setSideSquare(random.nextInt(FIGURE_SIZE));
            square.setColor(colorSupplier.getRandomColor());
            square.getArea();
            square.paintFigure();
        }
        if (index == 1) {
            rectangle.setFirstSideRectangle(random.nextInt(FIGURE_SIZE));
            rectangle.setSecondSideRectangle(random.nextInt(FIGURE_SIZE));
            rectangle.setColor(colorSupplier.getRandomColor());
            rectangle.getArea();
            rectangle.paintFigure();
        }
        if (index == 2) {
            rightTriangle.setFirstLeg(random.nextInt(FIGURE_SIZE));
            rightTriangle.setSecondLeg(random.nextInt(FIGURE_SIZE));
            rightTriangle.setColor(colorSupplier.getRandomColor());
            rightTriangle.getArea();
            rightTriangle.paintFigure();
        }
        if (index == 3) {
            circle.setRadius(random.nextInt(FIGURE_SIZE));
            circle.setColor(colorSupplier.getRandomColor());
            circle.getArea();
            circle.paintFigure();
        }
        if (index == 4) {
            isoscelesTrapezoid.setHightTrapesoid(random.nextInt(FIGURE_SIZE));
            isoscelesTrapezoid.setUpSideTrapesoid(random.nextInt(FIGURE_SIZE));
            isoscelesTrapezoid.setDownSideTrapesoid(random.nextInt(FIGURE_SIZE));
            isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
            isoscelesTrapezoid.getArea();
            isoscelesTrapezoid.paintFigure();
        }
        return listFigure[index];
    }

    public Figure getDefaultFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        if (index == 0) {
            square.getArea();
            square.paintFigure();
        }
        if (index == 1) {
            rectangle.getArea();
            rectangle.paintFigure();
        }
        if (index == 2) {
            rightTriangle.getArea();
            rightTriangle.paintFigure();
        }
        if (index == 3) {
            circle.getArea();
            circle.paintFigure();
        }
        if (index == 4) {
            isoscelesTrapezoid.getArea();
            isoscelesTrapezoid.paintFigure();
        }
        return listFigure[index];
    }

}
