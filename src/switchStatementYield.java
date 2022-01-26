public class switchStatementYield {
    public static void main(String[] args) {
        var nilai="A";
        String ucapan = switch (nilai){
            case "A" : yield "Selamat anda lulus dengan nilai memuaskan";
            case "B",  "C" : yield"selamat anda lulus";
            case "D",  "E" : yield"Anda tidak lulus";
            default : {
                 yield"sepertinya anda salah jurusan";
            }

        };
        System.out.println(ucapan);
    }
}
