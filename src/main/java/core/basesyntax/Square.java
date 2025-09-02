package core.basesyntax;

public class Square extends Figure {
    private int side;
    public void setSide(int side) {
        this.side = side;
    }
    public int getSide() {
        return side;
    }
    @Override
    public void draw() {
        System.out.println("square, " +
                "area: " + getArea() + "sq. units, " +
                "side: " + getSide() + "units, " +
                "color: " + getColor());
    }
    @Override
    public int getArea() {
        return side * side;
    }
}
