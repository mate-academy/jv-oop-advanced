package core.basesyntax;

import java.awt.*;

public class IsoscelesTrapezoid extends Figure implements Drawing, AreaCalculator {
    private int topLeg, bottomLeg, sides;

    public IsoscelesTrapezoid(int topLeg, int bottomLeg, int sides, Colors color) {
        this.topLeg = topLeg;
        this.bottomLeg = bottomLeg;
        this.sides = sides;
        this.setColor(color);
    }

    public void setTopLeg(int topLeg) {
        this.topLeg = topLeg;
    }

    public double getTopLeg() {
        return topLeg;
    }

    public void setBottomLeg(int bottomLeg) {
        this.bottomLeg = bottomLeg;
    }

    public int getBottomLeg() {
        return bottomLeg;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public double getSides() {
        return sides;
    }

    @Override
    public double calculateArea() {
        double osp = Math.abs(getTopLeg() - getBottomLeg()) / 2;
        double height = Math.sqrt(getSides() * getSides() - osp * osp);
        return (getTopLeg() + getBottomLeg()) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Isosceles trapezoid , area is " + calculateArea() + " sq. units, top leg: " +  getTopLeg() + " units," +
                " bottom leg: " + getBottomLeg() + " sides : " + getSides() + " units, color: " + getColor();
    }
}
