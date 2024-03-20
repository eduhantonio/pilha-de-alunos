public class Lista {
   
    Aluno[] alunos;
    int tamanho;
    int capacidade;
   
    Lista (int c) {
        tamanho = 0;
        capacidade = c;
        alunos = new Aluno[capacidade];
    }
   
    void imprimir(){
        for (int i=0; i < tamanho; i++){
            System.out.println("Nome: "+alunos[i].nome);
            System.out.println("RA: "+alunos[i].RA);
            System.out.println("NP1: "+alunos[i].NP1);
            System.out.println("NP2: "+alunos[i].NP2);
            System.out.println();
        }
    }
   
    boolean cheia(){
        return tamanho == capacidade;
    }
   
    void adicionar(Aluno aluno){
        if(cheia()){
            System.out.println("Lista cheia !");
        } else {
            alunos[tamanho] = aluno;
            tamanho++;
        }
    }
}