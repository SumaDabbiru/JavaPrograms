package Assignment1;

class Book {
    double price;
    // nested class

    class Magazine{

        // members of nested class
        int pages;
        String author;

        double getIsle(){
            return 4;
        }
    }
    class Education{

        // members of nested class
        int pages;
        String author;

        double getIsle(){
            return 3;
        }
    }
    class Maps{

        // members of nested class
        int pages;
        String author;

        double getIsle(){
            return 5;
        }
    }
    class Newspapers{

        // members of nested class
        int pages;
        String author;

        double getIsle(){
            return 6;
        }
    }
    class Articles{

        // members of nested class
        int pages;
        String author;

        double getIsle(){
            return 7;
        }
    }
    class Publishers{

        // members of nested class
        int pages;
        String author;

        double getIsle(){
            return 8;
        }
    }
    class Cds{

        // members of nested class
        int pages;
        String author;

        double getIsle(){
            return 9;
        }
    }
    class SaleBooks{

        // members of nested class
        int pages;
        String author;

        double getIsle(){
            return 10;
        }
    }

    class Archives{

        // members of nested class
        int pages;
        String author;

        double getIsle(){
            return 1;
        }
    }




    // nested protected class
    protected class Novel{

        // members of protected nested class
        // members of nested class
        int pages;
        String author;

        double getIsle(){
            return 2;
        }
    }
}

public class InnerClassConcept {
    public static void main(String[] args) {

        // create object of Outer class CPU
        Book book = new Book();

       // create an object of inner class Processor using outer class
        Book.Magazine magazine = book.new Magazine();
        Book.Education acedemic = book.new Education();
        Book.Novel novel = book.new Novel();
        Book.Articles a = book.new Articles();
        Book.Publishers p = book.new Publishers();
        Book.Maps m = book.new Maps();
        Book.Newspapers n = book.new Newspapers();
        Book.Cds cd = book.new Cds();
        Book.SaleBooks sb = book.new SaleBooks();
        Book.Archives ar = book.new Archives();
        
        
        System.out.println("Educative books are in isle = " + acedemic.getIsle());
        System.out.println("Magazines are in isle = " + magazine.getIsle());
        System.out.println("Novels are in isle = " + novel.getIsle());
        System.out.println("Articles are in isle = " + a.getIsle());
        System.out.println("Publishers are in isle = " + p.getIsle());
        System.out.println("Maps are in isle = " + m.getIsle());
        System.out.println("Newspapers are in isle = " + n.getIsle());
        System.out.println("CDs are in isle = " + cd.getIsle());
        System.out.println("SaleBooks are in isle = " + sb.getIsle());
        System.out.println("Archives are in isle = " + ar.getIsle());
    }
}