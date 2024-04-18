package core.basesyntax;

public class RightTriangle implements Figure{
    private int firstLeg;
    private int secondLeg;
    public RightTriangle(int firstLeg, int secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }
    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle, area: " + area + "sg. units, firstLeg: "
                + firstLeg + "units, secondLeg: " + secondLeg + "units, color: " + color);
    }
}

