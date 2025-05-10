package core.basesyntax;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        FigureSupplier figure = new FigureSupplier();
        System.out.print("Input list size:");
        Scanner scanner = new Scanner(System.in);
        int listLen = scanner.nextInt();
        Figure[] figurelist = new Figure[listLen];
        for (int i = 0; i < figurelist.length; i++) {
            if (i < figurelist.length / 2) {
                figurelist[i] = figure.getRandomFigure();
                System.out.print((i + 1) + ") ");
                System.out.println(figurelist[i].toDraw());
            } else if (i >= figurelist.length / 2) {
                figurelist[i] = figure.getDefaultFigure();
                System.out.print((i + 1) + ") ");
                System.out.println(figurelist[i].toDraw());
            }
        }
    }

}
