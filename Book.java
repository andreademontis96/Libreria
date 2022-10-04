public class Book {
    String title;
    String author;
    int[] BookingDays = new int[30];

    public Book(String titolo, String author,){
        this.title=title;
        this.autore=author;
    }

    public String geTitle()
        return title;

    public String getAuthor()
        return author;

    public int[] getBookingDays()
        return BookingDays;

    public setReservation(int[] bd){
        BookingDays=bd;
    }

}

