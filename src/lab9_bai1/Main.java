package lab9_bai1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Ticket> ticketList = new ArrayList<>();
        RegularTicket regularTicket = new RegularTicket();
        System.out.println("Nhập thông tin vé thường");
        System.out.println("Nhập mã vé:");
        regularTicket.setTicketId(sc.nextLine());
        System.out.println("Nhập tên phim:");
        regularTicket.setMovieName(sc.nextLine());
        System.out.println("Nhập giá vé:");
        regularTicket.setPrice(sc.nextFloat());
        ticketList.add(regularTicket);
        VIPTicket vipTicket = new VIPTicket();
        sc.nextLine();
        System.out.println("Nhập thông tin vé vip");
        System.out.println("Nhập mã vé:");
        vipTicket.setTicketId(sc.nextLine());
        System.out.println("Nhập tên phim:");
        vipTicket.setMovieName(sc.nextLine());
        System.out.println("Nhập giá vé:");
        vipTicket.setPrice(sc.nextFloat());
        ticketList.add(vipTicket);
        for (Ticket ticket: ticketList){
            System.out.println(ticket.toString());
        }
    }
}
