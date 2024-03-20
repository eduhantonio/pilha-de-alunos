public class Pilha
{
    int topo, capacidade;
    int[] dados;
   
    Pilha(int c)
    {
        capacidade = c;
        topo= -1;
        dados = new int[capacidade];
    }
   
    public boolean pilhaVazia()
    {
        return topo == -1;
    }
   
    public boolean pilhaCheia()
    {
        return topo == capacidade-1;
    }
   
    public void empilhar(int n)
    {
        if (pilhaCheia())
        {
            System.out.println("Pilha está cheia !!!");
        } else {
            topo++;
            dados[topo] = n;
        }
    }
   
    public int desempilhar()
    {
        int aux = -1;
       
        if (pilhaVazia())
        {
            System.out.println("Pilha Vazia !!!");
        } else {
            aux = dados[topo];
            topo--;
        }
        return aux;
    }
   
    public void listarPilha()
    {
        for(int t=topo; t >= 0; t--)
        {
            if(t==0) {
                System.out.print(dados[t]);
            } else {
                System.out.print(dados[t]+"-");  
            }
        }
    }
}
