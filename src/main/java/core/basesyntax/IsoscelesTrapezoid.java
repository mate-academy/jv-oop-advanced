package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements FigureInfo{
    private final double firstLeg;
    private final double secondLeg;
    private final double high;

    public IsoscelesTrapezoid (double firstLeg, double secondLeg, double high,String color){
        super(color);
        this.firstLeg=firstLeg;
        this.secondLeg=secondLeg;
        this.high=high;

    }

    @Override
    public double getArea() {
        return 0.5*(firstLeg+secondLeg)*high;
    }

    @Override
    public void draw() {
        System.out.println("Figure"+" "+"IsoscelesTrapezoid"+" "+"firstLeg"+" "+firstLeg+" "+"secondLeg"+" "+secondLeg+" "+"high"+" "+high+" "+"Area"+" "+getArea()+" ");

    }
}
