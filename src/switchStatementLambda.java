public class switchStatementLambda {
    public static void main(String[] args) {
        var nilai="A";
        switch (nilai){
            case "A" -> System.out.println("Selamat anda lulus dengan nilai memuaskan");
            case "B",  "C" -> System.out.println("selamat anda lulus");
            case "D",  "E" -> System.out.println("Anda tidak lulus");
            default -> {
                System.out.println("sepertinya anda salah jurusan");
            }
        }

    }
}
