public class fabricaRelatorioCsv extends RelatorioFactory{

    @Override
    public iRelatorio gerarRelatorio(){
        return new RelatorioCsv();
    }
}
