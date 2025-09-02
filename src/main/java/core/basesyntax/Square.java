package core.basesyntax;

public class Square extends Figure {
    int side;
    @Override
    public String draw() {
        return "square, " +
                "area: " + getArea() + "sq. units, " +
                "side: " + side + "units, " +
                "color: " + color;
    }
    @Override
    public int getArea() {
        return side * side;
    }
}
