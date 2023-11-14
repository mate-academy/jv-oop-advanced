package core.basesyntax;

public class RightTriangle extends Figure implements FigureInfo{
    private final double firstLeg;
    private final double secondLeg;

    private Color color;

    public RightTriangle(double firstLeg, double secondLeg,String color){
        super(color);
        this.firstLeg=firstLeg;
        this.secondLeg=secondLeg;

    }

    @Override
    public double getArea() {
        return firstLeg*secondLeg*0.5;
    }

    @Override
    public void draw() {
        System.out.println("Figure"+" "+"RightTriangle"+" "+"firstLeg"+" "+firstLeg+" "+"secondLeg"+" "+secondLeg+" "+"Area"+" "+getArea()+" ");

    }
}
