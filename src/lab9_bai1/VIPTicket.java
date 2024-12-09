package lab9_bai1;

public class VIPTicket extends Ticket{
    @Override
    public float tinhGiaVeCuoi() {
        return getPrice() + (getPrice() * 20 /100);
    }

    public VIPTicket() {
    }

    public VIPTicket(String ticketId, String movieName, float price) {
        super(ticketId, movieName, price);
    }

}
