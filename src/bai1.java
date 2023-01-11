public class bai1 {
    public double dayNho;
    public double dayLon;
    public double canhBen1;
    public double canhBen2;
    public double chieuCao;

    public bai1(double canhDayNho, double canhDayLon, double canhBen1, double canhBen2, double chieuCao) {
        this.dayNho = dayNho;
        this.dayLon = dayLon;
        this.canhBen1 = canhBen1;
        this.canhBen2 = canhBen2;
        this.chieuCao = chieuCao;
    }

    public double getPerimeter() {
        return this.dayNho + this.dayLon + this.canhBen2 + this.canhBen1;
    }

    public double getArea() {
        return chieuCao * (dayNho + dayLon) / 2;
    }

    @Override
    public String toString() {
        return
                "cạnh đáy nhỏ = " + dayNho +
                        ", cạnh đáy lớn = " + dayLon +
                        ", cạnh bên 1 = " + canhBen1 +
                        ", cạnh bên 2 = " + canhBen2 +
                        ", chiều cao = " + chieuCao ;

    }
}
