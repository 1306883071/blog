package Book;
public class Book {
    private String no;
    private String name;
    private double price;
    public Book(String no, String name, double price) {
        this.no = no;
        this.name = name;
        this.price = price;
    }
    public Book() {}
    public String getNo() {
        return no;}
    public void setNo(String no) {
        this.no = no;}
    public String getName() {
        return name;}
    public void setName(String name) {
        this.name = name;}
    public double getPrice() {
        return price;}
    public void setPrice(double price) {
        this.price = price;}
    @Override
    public String toString() {
        return "[no:"+no+",name"+name+",price:"+price+"]";}
    @Override
    public int hashCode() {
        return this.no.hashCode();}
    @Override
    public boolean equals(Object obj) {
        Book book = (Book) obj;
        return no.equals(book.getNo());}
}

