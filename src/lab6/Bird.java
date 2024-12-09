package lab6;

public class Bird {
    private String loaiChim;
    private String mauLong;
    private float tocDo;

    public Bird() {
    }

    public Bird(String loaiChim, String mauLong, float tocDo) {
        this.loaiChim = loaiChim;
        this.mauLong = mauLong;
        this.tocDo = tocDo;
    }

    public String getLoaiChim() {
        return loaiChim;
    }

    public void setLoaiChim(String loaiChim) {
        this.loaiChim = loaiChim;
    }

    public String getMauLong() {
        return mauLong;
    }

    public void setMauLong(String mauLong) {
        this.mauLong = mauLong;
    }

    public float getTocDo() {
        return tocDo;
    }

    public void setTocDo(float tocDo) {
        this.tocDo = tocDo;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "loaiChim='" + loaiChim + '\'' +
                ", mauLong='" + mauLong + '\'' +
                ", tocDo=" + tocDo +
                '}';
    }
    public void fly(){
        System.out.println("Chim dang bay");
    }
}
