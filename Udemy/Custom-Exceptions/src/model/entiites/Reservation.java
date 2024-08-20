package model.entiites;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkin;
    private Date checkout;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Integer roomNumber, Date checkin, Date checkout) {
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return checkin;
    }


    public Date getChecout() {
        return checkout;
    }

    public long duration(){
        //calculo da diferenca entre datas
        long diff = checkout.getTime() - checkin.getTime(); //diferença das datas entre milissegundos
        //converter para dias
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public String updateDates(Date checkin, Date checkout){
        Date now = new Date();
        if (checkin.before(now) || checkout.before(now)){
            return "Error in reservation: Reservation dates for update must be future dates.";
        }
        if (!checkout.after(checkin)){
            return "Error in reservation: Checkout date must be after checkin date.";
        }
        this.checkin = checkin;
        this.checkout = checkout;
        return null;
    }

    @Override
    public String toString() {
        return "Room: " + roomNumber +", checkin: " + sdf.format(checkin) +", checkout: " + sdf.format(checkout)
                + ", duration: " + duration() + " nights. ";
    }
}
