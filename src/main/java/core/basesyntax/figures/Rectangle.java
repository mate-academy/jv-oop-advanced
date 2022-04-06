package core.basesyntax.figures;

public class Rectangle extends Figure {
    public Rectangle(String color, int firstLeg, int secondLeg) {
        this.color = color.toLowerCase();
        this.secondLeg = secondLeg;
        this.firstLeg = firstLeg;
        area();
    }

    @Override
    public void area() {
        area = secondLeg * firstLeg;
    }

    @Override
    public String draw() {
        return "Figure: rectangle, " + "area: " + area + " sq.units, " + "firstLeg: " + firstLeg + " units, "
                + "secondLeg: " + secondLeg + " units, " + " color: " + color;
    }
}
