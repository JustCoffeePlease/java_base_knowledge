
package L33_last_lesson_with_46_examples;

public class Test13 {}

class Book{}
interface Readable{}
class PaperBook extends Book implements Readable{}
class ElectronicBook extends Book{}
class TestBook{
    public static void main(String[] args) {
        Readable r = null;
        ElectronicBook eBook = new ElectronicBook();
        r = (Readable) eBook;
    }
}
//Output:
//    StackOverflowError