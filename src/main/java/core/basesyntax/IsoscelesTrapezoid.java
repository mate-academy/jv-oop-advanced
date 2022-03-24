package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double area;
    private int lowerSide;
    private int topSide;
    private int height;

    public IsoscelesTrapezoid(String color, int lowerSide, int topSide, int height) {
        super(color);

        this.lowerSide = lowerSide;
        this.topSide = topSide;
        this.height = height;
        this.area = (double)((lowerSide + topSide) * height) / 2;
    }

    @Override
    public String toString() {
        return "Figure: " + "isosceles trapezoid"
                + ", area: " + area + " sq.units"
                + ", lower_side: " + lowerSide + " units"
                + ", top_side: " + topSide + " units"
                + ", height: " + height + " units"
                + ", color: " + super.getColor().toLowerCase();
    }

    @Override
    public void paint() {
        System.out.println(this);
    }
}

//Формула площади равнобедренной трапеции через основания и высоту