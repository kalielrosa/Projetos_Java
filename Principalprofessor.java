public class Principalprofessor {
    public static void main(String[] args) {
        Professor p = new Professor(123456789, "Alan", "Física");
        System.out.println(p.getMatricula());
        System.out.println(p.getNome());
        System.out.println(p.getDepartamento());

        System.out.println(p.toString());
    }
}
