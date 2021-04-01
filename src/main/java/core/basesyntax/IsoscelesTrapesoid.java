package core.basesyntax;

public class IsoscelesTrapesoid extends  Figure{
    private int side_one;
    private int side_two;
    private int side_three;

    public IsoscelesTrapesoid(int side_one, int side_two, int side_three, Colors colors) {
        super(colors);
        this.side_one = side_one;
        this.side_two = side_two;
        this.side_three = side_three;
    }

    @Override
    public double getArea() {
        return ((side_one + side_two) / 2) * (Math.sqrt((side_three * side_three) - ((side_one - side_two) * (side_one - side_two)) / 4));
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapesoid; " + "area:" + getArea() + ", side_one: " + side_one + ", side_two: " + side_two + ", side_three: " + side_three + ", color: " + getColor());
    }
}
