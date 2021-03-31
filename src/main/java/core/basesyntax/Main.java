package core.basesyntax;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(10000) + 1;

        FigureSupplier figSup = new FigureSupplier();
        ColorSupplier randColor = new ColorSupplier();
        Figure[] figArray = new Figure[num];

        for(int i = 0; i < num; i++) {
            figArray[i] = figSup.randFigureProper();
            randColor.generateColor(figArray[i]);
        }
        showFigureArray(figArray);
    }

    public static void showFigureArray(Figure[] figArr){
        for(Figure fig: figArr) {
            fig.drawFigure();
        }
    }
}
