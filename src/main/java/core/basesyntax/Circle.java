package core.basesyntax;

import java.util.Random;

public class Circle extends Figure implements FigureBehaviour {

    private int radius;
    private final Random random = new Random();
    private final int MAXRADIUS = 50;

    public Circle(){
         this.setName("circle");
     }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double obtainArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder(this.getName());
        builder.append(", area: ");
        builder.append(String.format("%.2f", this.obtainArea()));
        builder.append(" sq.units,");
        builder.append(" radius: ");
        builder.append(this.getRadius());
        builder.append(" units");
        builder.append(" color: ");
        builder.append(this.getColor());
        System.out.println(builder.toString());
    }

    @Override
    public void setRandomProperties() {
        super.setRandomProperties();
        setRadius(this.random.nextInt(MAXRADIUS));
    }
}
