public class relatorioService {

    public void efetivarRelatorio(RelatorioFactory fabrica, String model_relatorio){
        iRelatorio relatorio = fabrica.gerarRelatorio();
        relatorio.relatorio(model_relatorio);
    }
}
