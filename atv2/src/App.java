import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Turma turma1 = new Turma();
        System.out.print("Digite o nome do curso: ");
        String curso1=scanner.nextLine();
        turma1.setCurso(curso1);
        System.out.print("Digite o nome da disciplina: ");
        String disciplina1=scanner.nextLine();
        turma1.setDisciplina(disciplina1);

        Turma turma2 = new Turma();
        System.out.print("Digite o nome do curso: ");
        String curso2=scanner.nextLine();
        turma2.setCurso(curso2);
        System.out.print("Digite o nome da disciplina: ");
        String disciplina2=scanner.nextLine();
        turma2.setDisciplina(disciplina2);

        turma1.exibirMensagem();
        turma2.exibirMensagem();
        scanner.close();
    }
}