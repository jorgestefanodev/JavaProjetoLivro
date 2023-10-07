public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        // Pessoa 1 e 2
        p[0] = new Pessoa("Jorge", 39, "M");
        p[1] = new Pessoa("Erika", 35, "F");

        // Livro 1, 2 e 3
        l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
        l[1] = new Livro("POO para iniciantes", "Pedro Paulo", 500, p[1]);
        l[2] = new Livro("Java Avançado", "Maria Candido", 800, p[0]);

        System.out.println("======= Detalhes do Livro =======");
        l[0].detalhes();
        System.out.println("=================================");
        System.out.println("                                 ");
        System.out.println("======= Detalhes da Pessoa =======");
        System.out.println("Nome: " + p[0].getNome());
        System.out.println("Idade: " + p[0].getIdade());
        System.out.println("Sexo: " + p[0].getSexo());

        System.out.println("                                 ");
        System.out.println("=================================");
        // Livro 1
        l[0].abrir();
        l[0].folhear(100);
        l[0].avancarPag();
        l[0].detalhes();

        System.out.println("                                 ");
        System.out.println("=================================");
        // Livro 2
        l[1].detalhes();
        l[1].abrir();
        l[1].folhear(110);
        l[1].detalhes();
        l[1].avancarPag();
        l[1].detalhes();

    }
}