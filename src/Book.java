public class Book {
    public String title;
    public String author;
    public int[] BookingDays = new int[30];

    public Book(String title, String author){
        this.title=title;
        this.author=author;
    }

    public String geTitle(){
        return this.title;
    }


    public String getAuthor(){
        return author;
    }


    public int[] getBookingDays(){
        return BookingDays;
    }


    public void setReservation(int[] bd){
        BookingDays=bd;
    }

}

