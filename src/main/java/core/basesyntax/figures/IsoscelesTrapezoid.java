package core.basesyntax.figures;

import core.basesyntax.Area;
import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    double base;
    double height;

    public IsoscelesTrapezoid(double base, double height, String color){
        this.base = base;
        this.height = height;
        this.color = color;
    }


    @Override
    public double obtainArea() {
        return base * height / 2;

    }

    @Override
    public void draw() {
        System.out.println("isoscelesTrapezoid area: " + obtainArea() + " base: " + base + " height " + height + " color: " + color);
    }
}
