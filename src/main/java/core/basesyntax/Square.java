package core.basesyntax;

public class Square extends Figure{
    double firstSide;
    public Square(int firstSide, String color){
        this.firstSide = firstSide;
        super.color = color;
        super.name = "Square";
        super.area = firstSide * firstSide;
    }

    @Override
    public String getFigure() {
        return "Figure: " + super.name + ", area: " + super.area + " sq. until, side: " + firstSide + " until, color: " + super.color;
    }
}
