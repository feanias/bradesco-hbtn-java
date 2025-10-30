
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.Random;


public class ProcessamentoDePagamentos {


    // Logger SLF4j
    private static final Logger logger = LoggerFactory.getLogger(ProcessamentoDePagamentos.class);


    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 1; i <= 5; i++) {
            logger.info("Iniciando o processamento do pagamento {}", i);

            try {
                // Simular tempo de processamento (1 segundo)
                Thread.sleep(1000);

                int resultado = random.nextInt(3);

                switch (resultado) {
                    case 0: // Sucesso
                        logger.info("Pagamento {} processado com sucesso.", i);
                        break;
                    case 1: // Falha
                        logger.error("Erro ao processar o pagamento {}: Falha na transação.", i);
                        break;
                    case 2: // Pendente
                        logger.warn("Pagamento {} está pendente. Aguardando confirmação.", i);
                        break;
                }

            } catch (InterruptedException e) {
                logger.error("Erro de interrupção durante o processamento do pagamento {}: {}", i, e.getMessage());
                Thread.currentThread().interrupt();
            }
        }

        logger.info("Processamento de pagamentos concluído.");
    }
}
