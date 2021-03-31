package core.basesyntax;
import java.util.Random;
public class FigureSupplier {
    double MIN = 1e-10;
    double MAX = 100000;
    public Figure randFigureProper(){
        Random r = new Random();
        Figure f;
        int num = r.nextInt(4);
        switch(num) {
            case 0:
                f = new Square(MIN + (MAX - MIN) * r.nextDouble());
                return f;
            case 1:
                f = new Rectangle(MIN + (MAX - MIN) * r.nextDouble(),
                        MIN + (MAX - MIN) * r.nextDouble());
                return f;
            case 2:
                f = new RigthTriangle(MIN + (MAX - MIN) * r.nextDouble(),
                        MIN + (MAX - MIN) * r.nextDouble(),
                        MIN + (MAX - MIN) * r.nextDouble());
                return f;
            case 3:
                f = new Circle(MIN + (MAX - MIN) * r.nextDouble());
                return f;
            case 4:
                f = new IsoscelesTrapezoid(MIN + (MAX - MIN) * r.nextDouble(),
                        MIN + (MAX - MIN) * r.nextDouble(),
                        MIN + (MAX - MIN) * r.nextDouble());
                return f;
            default:
                break;
        }
        return null;
    }
}
