package core.basesyntax;

public class Square extends Figure {
    int firstLeg;
    int secondLeg;
    int thirdLeg;
    int fourthLeg;


    public Square(int[] legs) {
        firstLeg = legs[0];
        secondLeg = legs[0];
        thirdLeg = legs[0];
        fourthLeg = legs[0];
        area = firstLeg * secondLeg;
        color = new ColorSupplier().getRandomColor();
        name = "square";
        System.out.println("Figure: " + name + ", area: " + area + " sq.units, side: " + firstLeg + " units," + " side: " + secondLeg + " units," + " side: " + thirdLeg + " units," + " side: " + fourthLeg + " units, " + "color: " + color);
    }
}