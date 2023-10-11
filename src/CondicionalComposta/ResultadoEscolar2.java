package CondicionalComposta;

public class ResultadoEscolar2 {
    public static void main(String[] args) {
        int nota1 = 3;
        String resultado = nota1 >=7 ? "aprovdo" : nota1 >= 5 && nota1 < 7 ? "Recuperação" : "reprovado";
        System.out.println(resultado);
    }
}
