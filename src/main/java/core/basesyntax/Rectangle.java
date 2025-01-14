package core.basesyntax;

public class Rectangle extends Figure{
    double firstSide;
    double secondSide;

    public Rectangle(int firstSide, int secondSide, String color) {
        super.color = color;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        super.name = "Rectangle";
        super.area = firstSide * secondSide;
    }


    @Override
    public String getFigure() {
        return "Figure: " + super.name + ", area: " + super.area + " sq. until, firstSide: " + firstSide + " until, secondSide: " + secondSide + " until, color: " + super.color;
    }
}
