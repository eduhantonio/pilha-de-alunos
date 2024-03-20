public class Main
{
    public static void main(String[] args)
    {
         Lista L1 = new Lista(3);
         L1.adicionar(new Aluno(Eduardo,0001X, 7, 8));
         L1.adicionar(new Aluno(Sabrina,0002X, 9, 8));
         L1.adicionar(new Aluno(Gustavo,0003X, 2, 10));
         L1.adicionar(new Aluno(Cruz,0004X, 3, 7));
         L1.adicionar(new Aluno(Johann,0005X, 8, 9));
         L1.imprimir();
       
         System.out.println(=========================);
         System.out.println(Pilha dos Números de cria);
         System.out.println(=========================);
       
         Pilha P1 = new Pilha(4);
         P1.empilhar(22);
         P1.empilhar(18);
         P1.empilhar(8);
         P1.empilhar(7);
       
         P1.listarPilha();
         System.out.println( );
         System.out.println(P1.desempilhar());
         P1.listarPilha();
       
        System.out.println(=========================);
        System.out.println(Pilha dos Alunos de cria);
        System.out.println(=========================);
       
        System.out.println( );
       
        PilhaAluno P1 = new PilhaAluno(5);
       
        P1.empilhar(new Aluno(Eduardo,1°, 7, 10));
        P1.empilhar(new Aluno(Sabrina,2°, 9, 8));
        P1.empilhar(new Aluno(Gustavo,3°, 9, 9));
        P1.empilhar(new Aluno(Cruz,4°, 8, 8));
        P1.empilhar(new Aluno(Johann,5°, 8, 10));
       
        P1.listar();
       
        System.out.println(P1.desempilhar().nome);
        System.out.println( );
       
        System.out.println(=========================);
        System.out.println(Pilha com nome Removido);
        System.out.println(=========================);
       
        System.out.println( );
       
        P1.listar();
       
    }
}
