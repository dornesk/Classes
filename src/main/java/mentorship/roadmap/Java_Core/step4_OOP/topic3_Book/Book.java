package mentorship.roadmap.Java_Core.step4_OOP.topic3_Book;

public class Book {

    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        setYear(year);
    }

    @Override

    public String toString() {
        return "Book: " + this.title + " by " + this.author + " (" + this.year + ")";
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        if (year >= 0) {
            this.year = year;
        } else {
            System.out.println("Год не может быть отрицательным числом.");
            this.year = 0;
        }
    }
}
