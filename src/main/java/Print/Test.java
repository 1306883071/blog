package Print;

public class Test {
    public static void main(String[] args) {
        ColorInkBox colorInkBox = new ColorInkBox();
        GrayInkBox grayInkBox = new GrayInkBox();
        A4Paper a4Paper = new A4Paper();
        A3Paper a3Paper = new A3Paper();
        Printer printer = new Printer();
        printer.print(colorInkBox,a3Paper);
        printer.print(colorInkBox,a4Paper);
        printer.print(grayInkBox,a3Paper);
        printer.print(grayInkBox,a4Paper);
    }
}
