package core.basesyntax.figures;

import core.basesyntax.Area;
import core.basesyntax.Draw;
import core.basesyntax.Figure;

public class Circle extends Figure implements Draw, Area {

    private double radius;


    public Circle(String color, double radius) {
        this.radius = radius;
        setColor(color);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return  (Math.PI * radius * radius);
    }

    @Override
    public String getDraw() {
        return "Figure: circle, area: " + getArea() + " sq. units, radius length: " + getRadius() + " units, color: " + getColor();
    }

}
