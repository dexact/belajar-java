public class switchStatemen {
    public static void main(String[] args) {

        var nilai="E";
        switch (nilai){
            case "A":
                System.out.println("Selamat anda lulus dengan nilai terbaik");
                break;
            case "B":
                System.out.println("Selamat anda lulus dengan nilai baik");
                break;
            case "C":
                System.out.println("Selamat anda lulus dengan nilai cukup");
                break;
            case "D":
            case "E":
                System.out.println("Anda lulus namun dengan nilai kurang ");
                break;
            case "F":
                System.out.println("Anda tidak lulus");
                break;
            default:
            System.out.println("Mungkin anda salah jurusan");



        }
    }
}
