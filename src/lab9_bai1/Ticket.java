package lab9_bai1;

public abstract class Ticket {
    private String ticketId, movieName;
    private float price;

    public abstract float tinhGiaVeCuoi();
    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId='" + ticketId + '\'' +
                ", movieName='" + movieName + '\'' +
                ", price=" + price +
                ", giá cuối cùng=" + tinhGiaVeCuoi() +
                '}';
    }

    public Ticket() {
    }

    public Ticket(String ticketId, String movieName, float price) {
        this.ticketId = ticketId;
        this.movieName = movieName;
        this.price = price;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
