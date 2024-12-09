package lab9_bai1;

public class RegularTicket extends Ticket{

    public RegularTicket() {
    }

    public RegularTicket(String ticketId, String movieName, float price) {
        super(ticketId, movieName, price);
    }

    @Override
    public float tinhGiaVeCuoi() {
        return getPrice() ;
    }

}
