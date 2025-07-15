public class Sms implements CanalNotificacao {

    @Override
    public void notificar(Mensagem mensagem) {
        System.out.printf("[SMS] {%s} - %s\n", mensagem.tipoMensagem.toString(), mensagem.texto);
    }
    
}
