package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;
    
    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }
    
    public double getCountSquare() {
        return (1 / 2) * firstLeg * secondLeg;
    }
    
    @Override
    public void draw() {
        String rectanglePrint = "Figure: rightTriangle: rectangle, area: " + getCountSquare()
                + " sq.units, firstLeg: " + firstLeg + " units, secondLeg: "
                + secondLeg + " units, color: "
                + getColor();
        System.out.println(rectanglePrint);
    }
}
