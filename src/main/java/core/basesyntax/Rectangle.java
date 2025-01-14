package core.basesyntax;

public class Rectangle extends Figure{
    double firstSide;
    double secondSide;

    public Rectangle(int firstSide, int secondSide, String color) {
        super(color, firstSide * secondSide, "Rectangle");
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }


    @Override
    public String getFigure() {
        return "Figure: " + super.name + ", area: " + super.area + " sq. units, firstSide: " + firstSide + " units, secondSide: " + secondSide + " units, color: " + super.color;
    }
}
