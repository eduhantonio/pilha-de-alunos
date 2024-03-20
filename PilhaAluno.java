public class PilhaAluno {
    int topo, capacidade;
    Aluno[] dados;
   
    PilhaAluno(int c)
    {
        capacidade = c;
        topo = -1;
        dados = new Aluno[capacidade];
    }
   
    public boolean vazia()
    {
        return topo == -1;
    }
   
    public boolean cheia()
    {
        return topo == capacidade-1;
    }
   
    public void empilhar(Aluno n)
    {  
        if (cheia())
        {
            System.out.println("Pilha está cheia !!!");
        } else {
            topo++;
            dados[topo] = n;
        }
    }
   
    public Aluno desempilhar()
    {
        Aluno aux = null;
        if (vazia()) {
            System.out.println("Pilha está vazia !!!");
        } else {
            aux = dados[topo];
            topo--;
        }
        return aux;
    }
   
    public void listar() {
        for (int t=topo; t >= 0; t--)
        {
            System.out.print(">> "+dados[t].nome+" - ");
            System.out.print(dados[t].RA+" - ");
            System.out.print(dados[t].NP1+" - ");
            System.out.println(dados[t].NP2+" ");
            System.out.println(" ");
        }    
    }
}
