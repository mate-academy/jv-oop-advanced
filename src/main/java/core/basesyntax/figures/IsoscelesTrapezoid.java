package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    public IsoscelesTrapezoid(String color, int firstLeg, int secondLeg) {
        this.color = color;
        this.secondLeg = secondLeg;
        this.firstLeg = firstLeg;
        area();
    }

    @Override
    public void area() {
        area = Math.sqrt(firstLeg * secondLeg) * (firstLeg + secondLeg) / 2;
    }

    @Override
    public String draw() {
        return "Figure: rectangle," + "area:" + area + " sq.units," + "firstLeg:" + firstLeg + "units,"
                + "secondLeg:" + secondLeg + "units," + "color:" + color;
    }
}
