package core.basesyntax;

public class RightTriangle extends Figure {
    int firstLeg;
    int secondLeg;
    int thirdLeg;

    public RightTriangle(int[] legs) {
        firstLeg = legs[0];
        secondLeg = legs[1];
        thirdLeg = legs[2];
        area = 0.5 * (firstLeg * thirdLeg);
        color = new ColorSupplier().getRandomColor();
        name = "rightTriangle";
        System.out.println("Figure: " + name + ", area: " + area + " sq.units, side: " + firstLeg + " units," + " side: " + secondLeg + " units," + " side: " + thirdLeg + " units," + "color: " +  color);
    }
}
