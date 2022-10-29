package Print;

public class Printer {
    public void print(InkBox inkBox,Paper paper){
        System.out.println("使用"+inkBox.getColor()+"墨盒在"+paper.getSize()+"纸上打印");
    }
}
