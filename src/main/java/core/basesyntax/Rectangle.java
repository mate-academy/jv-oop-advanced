package core.basesyntax;

//прямокутник
public class Rectangle extends Figure {
    public Rectangle(String color, double sideA, double sideB) {
        super(color);

    }

    @Override
    public double getAreaCalculator() {
        return getSideA() * getSideB();
    }

    @Override
    public String getDrawable() {
        return "Figure : rectangle, area: " + getAreaCalculator() + "sq.units, firstLeg: "
                + getSideA() + " units secondLeg:" + getSideB() + " units, color: " + getColor();
    }
}








