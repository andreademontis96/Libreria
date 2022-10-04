public class Reservation {

    int[] ReservationDays = new int[30];

    public void insertDate(int month, int day){
        int days = month*30 + day;

        for(int i=0; i<30; i++){
            this.ReservationDays[i]=days;
            days++;
        }
    }

    public void validateReservation(Book B){
            int flag_prenotazione=0;
            int[] BookingDays = B.getBookingDays();

            for(int i=0; i<30; i++){
                for(int j=0; i<30; i++) {
                    if (BookingDays[i] == ReservationDays[j]) {
                        i = 30;
                        j = 30;
                        flag_prenotazione = 1;
                    }
                }
            }

            if(flag_prenotazione==1){
                System.out.println("ReservationFailed");
            }
            else{
                B.setReservation(ReservationDays);
                System.out.println("ReservationCompleted");
            }
    }





}
