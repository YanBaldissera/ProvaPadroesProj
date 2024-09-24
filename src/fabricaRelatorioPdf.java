public class fabricaRelatorioPdf extends RelatorioFactory {

    @Override
    public iRelatorio gerarRelatorio() {
        return new RelatorioPdf();
    }
}
