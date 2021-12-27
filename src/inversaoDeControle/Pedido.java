package inversaoDeControle;

public class Pedido {
    public static void main(String[] args){

        Pedido pedido = new Pedido();
        pedido.gravar();

    }

    private EnviarEmail enviar = EnviarEmail.obterDadods();

    public void gravar(){
       
        this.enviar.retornar("Pedido criado!");
    }
}
