package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;
    private int hypotenuse;
    private double area;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.hypotenuse = (int) Math.sqrt(Math.pow(firstLeg, 2) + Math.pow(secondLeg, 2));
        this.area = (double) 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle; First leg: " + firstLeg
                + " units; Second leg:  " + secondLeg
                + " units; hypotenuse: " + hypotenuse
                + " units; Area: " + area
                + "sq. units; Color: "
                + super.getColor());
    }
}
