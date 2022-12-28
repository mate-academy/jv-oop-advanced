package core.basesyntax.figure;

import core.basesyntax.color.Color;
import core.basesyntax.constants.Messages;

public class RightTriangle extends Figure {
    private static final String FIGURE_NAME = "right triangle";
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg) {
        if (firstLeg <= 0 || secondLeg <= 0) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_PARAMS);
        }

        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        if (firstLeg <= 0 || secondLeg <= 0) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_PARAMS);
        }

        if (color == null || color.isBlank()) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_COLOR);
        }

        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        if (firstLeg <= 0 || secondLeg <= 0) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_PARAMS);
        }

        if (color == null) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_COLOR);
        }

        this.color = color.name().toLowerCase();
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        String str = "Figure: " + FIGURE_NAME + ", area: " + getArea() + " sq.units, first leg: "
                + firstLeg + ", second leg: " + secondLeg + ", color: " + color;

        System.out.println(str);
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    public void setFirstLeg(double firstLeg) {
        if (firstLeg <= 0) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_PARAMS);
        }

        this.firstLeg = firstLeg;
    }

    public void setSecondLeg(double secondLeg) {
        if (secondLeg <= 0) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_PARAMS);
        }

        this.secondLeg = secondLeg;
    }

    public void setLegs(double firstLeg, double secondLeg) {
        if (firstLeg <= 0 || secondLeg <= 0) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_PARAMS);
        }

        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }
}
