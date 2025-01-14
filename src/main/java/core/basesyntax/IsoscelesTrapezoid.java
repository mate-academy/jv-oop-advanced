package core.basesyntax;

public class IsoscelesTrapezoid extends Figure{
    double firstLeg;
    double secondLeg;
    double height;

    public IsoscelesTrapezoid(int firstLeg, int secondLeg, int height, String color) {
        super(color, (double) ((firstLeg + secondLeg) / 2) * height, "IsoscelesTrapezoid");
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.height = height;
    }
    @Override
    public String getFigure(){
        return "Figure: " + super.name + ", area: " + super.area + " sq. units, firstLeg: " + firstLeg + " units, secondLeg: " + secondLeg + " units, height: " + height + " units, color: " + super.color;
    }
}
