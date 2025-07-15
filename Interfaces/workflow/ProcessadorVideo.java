
import java.util.ArrayList;

public class ProcessadorVideo {

    ArrayList<CanalNotificacao> canais = new ArrayList<>();

    public void registrarCanal(CanalNotificacao canal) {
        canais.add(canal);
    }
    
    public void processar(Video video){
        for (Object canal: canais){
            if (canal instanceof CanalNotificacao) {
                CanalNotificacao canalNotificacao = (CanalNotificacao) canal;
                Mensagem mensagem = new Mensagem();
                mensagem.tipoMensagem = TipoMensagem.LOG;
                mensagem.texto = video.arquivo + " - " + video.formato;
                canalNotificacao.notificar(mensagem);
            }
        }
    }
}
