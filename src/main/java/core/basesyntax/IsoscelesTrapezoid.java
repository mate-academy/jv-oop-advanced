package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int heightLength;
    private int topLength;
    private int bottomLength;

    public IsoscelesTrapezoid(int legLength, int topLength,
                              int bottomLength, String color, String name) {
        super(color, name);
        this.heightLength = legLength;
        this.topLength = topLength;
        this.bottomLength = bottomLength;
        setName("IsoscelesTrapezoid");
    }

    @Override
    public int area() {
        return ((topLength + bottomLength) / 2) * heightLength;
    }

    @Override
    public String giveAllTheInformation() {
        return "Figure: " + getName() + "area: " + area() + "sq.units, " + "heightLength: "
                + heightLength + " units" + " topLength: " + topLength + " units"
                + topLength + "bottomLength: " + bottomLength + " units" + " color: " + getColor();
    }
}
