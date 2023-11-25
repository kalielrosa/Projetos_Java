public class Principal {
    public static void main(String[] args) {
        FolhaDePagamento fp = new FolhaDePagamento();

        Mensalista m1 = new Mensalista("Luiz", "123.456.786-34", 1500, 8);
        Comissionado c1 = new Comissionado("Ana", "153.267.089-34", 2345, 245, 60);
        Horista h1 = new Horista("Júlia", "536.678.253-22", 1200, 65, 4);

        fp.adicionarAssalariado(m1);
        fp.adicionarAssalariado(c1);
        fp.adicionarAssalariado(h1);

        fp.imprimirTotal();

    }
}
