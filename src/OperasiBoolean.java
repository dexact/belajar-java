public class OperasiBoolean {
    public static void main(String[] args) {
        var absen = 70;
        var nilaiAKhir = 80;

        var lulusAbsen = absen >=70;
        var lulusUjian = nilaiAKhir>=75;

        var lulus = lulusAbsen && lulusUjian;

        System.out.print(lulus);

    }
}
