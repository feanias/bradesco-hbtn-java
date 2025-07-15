public class Slack implements CanalNotificacao {

    @Override
    public void notificar(Mensagem mensagem) {
        System.out.printf("[SLACK] {%s} - %s\n", mensagem.tipoMensagem.toString(), mensagem.texto);
    }
    
}
