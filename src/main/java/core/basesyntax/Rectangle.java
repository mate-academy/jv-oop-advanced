package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public double areaOfFigure() {
        return firstSide * secondSide;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: rectangle"
                + ", firstSide = "
                + firstSide
                + " units"
                + ", secondSide = "
                + secondSide
                + " units"
                + ", area = "
                + areaOfFigure()
                + " units"
                + ", color = "
                + getColor()
        );
    }

    @Override
    public Figure getRandomFigure() {
        Rectangle rectangle = new Rectangle();
        rectangle.setColor(ColorSupplier.getRandomColor());
        rectangle.setFirstSide(random.nextDouble(30));
        rectangle.setSecondSide(random.nextDouble(30));
        return rectangle;
    }
}
