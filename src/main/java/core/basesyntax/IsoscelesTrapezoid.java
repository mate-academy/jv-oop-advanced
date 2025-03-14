package core.basesyntax;

public  class IsoscelesTrapezoid extends Figure implements Area, Draw {
    private int shorterSide;
    private int longerSide;
    private int height;
    private static final String NAME = "Isosceles Trapezoid";

    public IsoscelesTrapezoid(int shorterSide, int longerSide, int height, String color) {
        super(color);
        this.shorterSide = shorterSide;
        this.longerSide = longerSide;
        this.height = height;
    }

    @Override
    public double printArea() {
        return ((shorterSide + longerSide) * height) / 2.0;
    }

    @Override
    public void draw() {
        String firstPart = "Figure: " + NAME + ", area: " + printArea();
        String secondPart = " sq. units, shorter site: " + shorterSide + " units, longer site: ";
        String thirdPart = longerSide + " units, height: " + height + " units, color: " + getColor();
        System.out.println(firstPart + secondPart + thirdPart);
    }
}
