public class Main {
    public static void main(String[] args) {
        bai1 hinhThang1= new bai1(10, 15, 5, 5, 10);
        System.out.println("Hình thang 1 :" + hinhThang1);
        bai1 hinhThang2 = new bai1(15, 25, 10, 10, 15);
        System.out.println("Hình thang 2 :" + hinhThang2);

        double areaOne = hinhThang1.getArea();
        double areaTwo = hinhThang2.getArea();
        if (areaOne > areaTwo) {
            System.out.println("S hình thang 1 > S hình thang 2");
        } else {
            System.out.println("S hình thang 1 < S hình thang 2");
        }

        double chuVi1 = hinhThang1.getPerimeter();
        double chuVi2 = hinhThang2.getPerimeter();
        if (chuVi1 > chuVi2) {
            System.out.println("C hình thang 1 > C hình thang 2");
        } else {
            System.out.println("C hình thang 1 < C hình thang 2");
        }
    }
}