package core.basesyntax;

public class Square extends Figure{
    double firstSide;
    public Square(int firstSide, String color){
        super(color, firstSide * firstSide, "Square");
        this.firstSide = firstSide;

    }

    @Override
    public String getFigure() {
        return "Figure: " + super.name + ", area: " + super.area + " sq. units, side: " + firstSide + " units, color: " + super.color;
    }
}
