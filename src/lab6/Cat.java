package lab6;

public class Cat {
    private String giongMeo;
    private float canNang,tocDo;

    public Cat(String giongMeo, float canNang, float tocDo) {
        this.giongMeo = giongMeo;
        this.canNang = canNang;
        this.tocDo = tocDo;
    }

    public Cat() {
    }

    public String getGiongMeo() {
        return giongMeo;
    }

    public void setGiongMeo(String giongMeo) {
        this.giongMeo = giongMeo;
    }

    public float getCanNang() {
        return canNang;
    }

    public void setCanNang(float canNang) {
        this.canNang = canNang;
    }

    public float getTocDo() {
        return tocDo;
    }

    public void setTocDo(float tocDo) {
        this.tocDo = tocDo;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "giongMeo='" + giongMeo + '\'' +
                ", canNang=" + canNang +
                ", tocDo=" + tocDo +
                '}';
    }
    public void run(){
        System.out.println("Meo dang chay");
    }
    public boolean catchs(Bird vet){
        return this.tocDo> vet.getTocDo();
    }
}
