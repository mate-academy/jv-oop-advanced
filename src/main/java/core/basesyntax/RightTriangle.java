package core.basesyntax;

public class RightTriangle implements Figure {
    private double firstLeg;
    private double secondLeg;
    private String color;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, area: "
                + getArea() + " sq. units, firstLeg: "
                + firstLeg + " units, secondLeg: " + secondLeg + " units, color: " 
                + color);
    }
}

/*package core.basesyntax;

public class RightTriangle extends Figure {
    double firstLeg;
    double secondLeg;
    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }
    @Override 
     public double getArea() {
        return (firstLeg * secondLeg) / 2;
     }
    @Override
    public void draw() {
        System.out.println("Figure : RightTriangle, area :" + getArea()
         + " units, firstLeg : " + firstLeg + "units, secondLeg :" 
         + secondLeg + " units, color :" + color);
    }
}*/
