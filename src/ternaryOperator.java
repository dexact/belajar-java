public class ternaryOperator {
    public static void main(String[] args) {
        var nilai=75;
        String ucapan;

        if (nilai>=65) {
            System.out.println("selamat anda lulus");
        }else{
            System.out.println("anda tidak lulus");
        }

        String ucapan2 = nilai >=70 ? "selamat anda lulus" : "silahkan coba lagi";
        System.out.println(ucapan2);
    }
}
