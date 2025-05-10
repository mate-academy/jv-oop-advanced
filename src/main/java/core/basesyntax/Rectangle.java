package core.basesyntax;

public class Rectangle extends Figure {
    private double horizontalSide;
    private double verticalSide;

    @Override
    public double getArea() {
        return this.horizontalSide * this.verticalSide;
    }

    public double getHorizontalSide() {
        return horizontalSide;
    }

    public void setHorizontalSide(double horizontalSide) {
        if (horizontalSide > 0) {
            this.horizontalSide = horizontalSide;
        }
    }

    public double getVerticalSide() {
        return verticalSide;
    }

    public void setVerticalSide(double verticalSide) {
        if (verticalSide > 0) {
            this.verticalSide = verticalSide;
        }
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: rectangle, area: " + this.getArea()
                + " sq. units, verticalSide: "
                + this.verticalSide + " units, horizontalSide: "
                + this.horizontalSide + " units, color: " + this.getColor());

    }
}
