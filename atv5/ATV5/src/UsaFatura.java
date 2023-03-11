public class UsaFatura {
    public static void main(String[] args) {
        Fatura fatura = new Fatura("001", "Teclado", 2, 50.0);

        System.out.println("Número da fatura: " + fatura.getNumero());
        System.out.println("Descrição da fatura: " + fatura.getDescricao());
        System.out.println("Quantidade comprada: " + fatura.getQuantidade());
        System.out.println("Preço por item: " + fatura.getPreco());
        System.out.println("Quantidade da fatura: " + fatura.getQtdeFatura());
    }
}