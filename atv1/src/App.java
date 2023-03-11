import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Livro livro1 = new Livro();
        System.out.print("Digite o título do livro: ");
        String titulo1=scanner.nextLine();
        livro1.setTitulo(titulo1);
        System.out.print("Digite o nome do autor do livro: ");
        String autor1=scanner.nextLine();
        livro1.setAutor(autor1);
        livro1.exibirMensagem();
        scanner.close();
    }
}