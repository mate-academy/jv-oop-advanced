package core.basesyntax;

public class IsoscelesTrapesoid extends Figure {
    private int sideOne;
    private int sideTwo;
    private int sideThree;

    public IsoscelesTrapesoid(int sideOne, int sideTwo, int sideThree, Color colors) {
        super(colors);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    @Override
    public double getArea() {
        return ((sideOne + sideTwo) / 2) * (Math.sqrt((sideThree * sideThree)
                - ((sideOne - sideTwo) * (sideOne - sideTwo)) / 4));
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapesoid; "
                + "area:"
                + getArea()
                + ", side_one: "
                + sideOne
                + ", side_two: "
                + sideTwo
                + ", side_three: "
                + sideThree
                + ", color: "
                + getColor());
    }
}
