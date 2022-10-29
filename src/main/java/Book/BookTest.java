package Book;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class BookTest {
    public static void main(String[] args) {
        HashSet<Book> bookHashSet = new HashSet<Book>();
        bookHashSet.add(new Book("TP311","java高级编程",22.0));
        bookHashSet.add(new Book("TP311","java编程基础",21.0));
        bookHashSet.add(new Book("TP321","python程序设计",23.0));
        bookHashSet.add(new Book("TP305","网页前端设计",22.9));
        System.out.println(bookHashSet);
        //删除指定书名的图书
        Iterator<Book> iterator = bookHashSet.iterator();
        Book book;
        while (iterator.hasNext()){
            book = iterator.next();
            if (book.getNo().equals("TP321")){
                iterator.remove();
            }
        }
        System.out.println("删除图书后的集合元素信息");
        System.out.println(bookHashSet);
    }
}
