package core.basesyntax;

public class Square extends Figure {
    private int sideLength;

    public Square(String name, int sideLength, String color) {
        super(name, color);
        this.sideLength = sideLength;
        setName("Square");
    }

    @Override
    public int area() {
        return sideLength * sideLength;
    }

    @Override
    public String giveAllTheInformation() {
        return "Figure: " + getName() + "area: " + area() + "sq.units, " + "sideLength: "
                + sideLength + " units" + " color: " + getColor();
    }
}
