public class Livro {
    private String titulo, autor;

    public void setTitulo(String titulo1){
        titulo = titulo1;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setAutor(String autor1){
        autor = autor1;
    }

    public String getAutor(){
        return autor;
    }

    public void exibirMensagem(){
        System.out.println(getTitulo());
        System.out.println(getAutor());
    }
}