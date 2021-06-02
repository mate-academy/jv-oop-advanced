package core.basesyntax;

import core.basesyntax.behavior.Draw;

public class IsoscelesTrapezoid extends Figure implements Draw, AreaCalculater {
    private double upBase;
    private double downBase;
    private double leftBase;
    private double rightBase;

    public IsoscelesTrapezoid(String color, double upBase, double downBase, double leftBase, double rightBase){
        this.upBase = upBase;
        this.downBase = downBase;
        this.leftBase = leftBase;
        this.rightBase = rightBase;
        this.color = color;
        area();
    }

    @Override
    public Figure draw() {

        return null;
    }

    @Override
    public void area() {
        this.area = (upBase + downBase) * ((upBase + downBase) / 2) / 2;
    }
}
