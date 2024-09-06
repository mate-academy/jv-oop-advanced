package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;
    private final int hypotenuse;
    private final int index = 2;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.hypotenuse = (int) (Math.sqrt(Math.pow(firstLeg,index))
                               + Math.sqrt(Math.pow(secondLeg,index)));
    }

    @Override
    public double calculateArea() {
        return (firstLeg * secondLeg) / index;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle," + " area: " + calculateArea() + " sq. units,"
                            + " firsLeg: " + firstLeg + " units," + " second leg: " + secondLeg
                            + " units," + " hypotenuse: " + hypotenuse
                            + " units," + " color: " + color);

    }
}
