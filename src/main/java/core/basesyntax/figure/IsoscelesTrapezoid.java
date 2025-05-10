package core.basesyntax.figure;

import core.basesyntax.behaviour.Figure;

public class IsoscelesTrapezoid extends Figure {
    private int topSide;
    private int botSide;
    private int height;

    public IsoscelesTrapezoid(String color, int topSide, int botSide, int height) {
        super.setColor(color);
        this.topSide = topSide;
        this.botSide = botSide;
        this.height = height;
    }

    public int getTopSide() {
        return topSide;
    }

    public void setTopSide(int topSide) {
        this.topSide = topSide;
    }

    public int getBotSide() {
        return botSide;
    }

    public void setBotSide(int botSide) {
        this.botSide = botSide;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((topSide + botSide) / 2.0) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid, "
                + "area: " + this.getArea() + " sq.units, "
                + "topSide: " + this.topSide + " units, "
                + "botSide: " + this.botSide + " units, "
                + "height: " + this.height + " units, "
                + "color: " + super.getColor());
    }
}
