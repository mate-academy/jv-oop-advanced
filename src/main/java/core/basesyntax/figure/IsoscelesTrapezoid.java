package core.basesyntax.figure;

import core.basesyntax.color.Color;
import core.basesyntax.constants.Messages;

public class IsoscelesTrapezoid extends Figure{
    private double leg;
    private double topBase;
    private double bottomBase;
    private static final String FIGURE_NAME = "isosceles trapezoid";

    public IsoscelesTrapezoid(double topBase, double bottomBase, double leg){
        if (topBase <= 0 || bottomBase <= 0 || leg <= 0) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_PARAMS);
        }

        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.leg = leg;
    }

    public IsoscelesTrapezoid(String color, double topBase, double bottomBase, double leg){
        if (topBase <= 0 || bottomBase <= 0 || leg <= 0) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_PARAMS);
        }

        if (color == null || color.isBlank()) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_COLOR);
        }

        this.color = color;
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.leg = leg;
    }

    public IsoscelesTrapezoid(Color color, double topBase, double bottomBase, double leg){
        if (topBase <= 0 || bottomBase <= 0 || leg <= 0) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_PARAMS);
        }

        if (color == null) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_COLOR);
        }

        this.color = color.name().toLowerCase();
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.leg = leg;
    }

    @Override
    public void draw() {
        String str = "Figure: " + FIGURE_NAME + ", area: " + getArea() + " sq.units, top base: " + topBase + ", bottom base: "
                + bottomBase + ", leg: " + leg + ", color: " + color;

        System.out.println(str);
    }

    @Override
    public double getArea() {
        double height = Math.sqrt(Math.pow(leg, 2) - Math.pow(Math.abs(topBase - bottomBase) / 2, 2));
        return (topBase + bottomBase) * height / 2;
    }

    public void setTopBase(double topBase) {
        if (topBase <= 0) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_PARAMS);
        }

        this.topBase = topBase;
    }

    public void setBottomBase(double bottomBase) {
        if (bottomBase <= 0) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_PARAMS);
        }

        this.bottomBase = bottomBase;
    }

    public void setLeg(double leg) {
        if (leg <= 0) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_PARAMS);
        }

        this.leg = leg;
    }

    public double getTopBase() {
        return topBase;
    }

    public double getBottomBase() {
        return bottomBase;
    }

    public double getLeg() {
        return leg;
    }
}
