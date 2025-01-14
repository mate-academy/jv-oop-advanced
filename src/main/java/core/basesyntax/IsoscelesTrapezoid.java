package core.basesyntax;

public class IsoscelesTrapezoid extends Figure{
    double firstLeg;
    double secondLeg;
    double height;

    public IsoscelesTrapezoid(int firstLeg, int secondLeg, int height, String color) {
    this.firstLeg = firstLeg;
    this.secondLeg = secondLeg;
    this.height = height;
    super.color = color;
    super.name = "IsoscelesTrapezoid";
    super.area = (double) ((firstLeg + secondLeg) / 2) * height;
    }
    @Override
    public String getFigure(){
        return "Figure: " + super.name + ", area: " + super.area + " sq. units, firstLeg: " + firstLeg + " units, secondLeg: " + secondLeg + " units, height: " + height + " units, color: " + super.color;
    }
}
