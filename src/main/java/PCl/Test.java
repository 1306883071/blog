package PCl;

public class Test {
    public static void main(String[] args) {
        Assembler assembler = new Assembler();
        assembler.print(new NetCard());
        assembler.print(new SoundCard());
        assembler.print(new ShowCard());
    }
}
