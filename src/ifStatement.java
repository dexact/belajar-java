public class ifStatement {
    public static void main(String[] args) {
        var nilai=75;
        var absen=85;

        var lulus=nilai>=70 && absen>=70;
        if (nilai>=75 && absen >=90) {
            System.out.println("selamat anda lulus");
        }else if (nilai>=70 && absen>=70){
            System.out.println("anda malas");
        } else {
            System.out.println("anda tidak lulus");
        }
    }
}
