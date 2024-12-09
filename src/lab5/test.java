package lab5;
public class test {

    public  static String GiaiToan(double a, double b , double c){
        if(a == 0){
            if( b == 0 && c == 0){
                return "Pt bac 1 vo so  nghiem";
            } else if (b == 0 && c != 0) {
                return "Phuong trinh bac 1 vo nghiem";
            }else {
                return "Phuong trinh bac nhat  co nghiem = "+(-c/b);
            }
        }
        else {
            double delta = (b * b ) - ( 4 * a * c);
            if(delta < 0 ){
                return "Phuong trinh vo nghiem";
            } else if (delta == 0) {
                return "Phuong trinh co 1 nghiem kep x= "+-b / (2 * a);
            }
            else {
                double x1 = (-b + Math.sqrt(delta)) / (2*a);
                double x2 = (-b - Math.sqrt(delta)) / (2 *a);
                return "Phuong trinh co 2 nghiem phan biet x1 = "+x1+" x2 =  "+x2;
            }
        }
    }
    public static void main(String[] args) {
        String kq = GiaiToan(2,5,0);
        System.out.println(kq);
    }
}