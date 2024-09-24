public class fabricaRelatorioExcel extends RelatorioFactory {

    @Override
    public iRelatorio gerarRelatorio() {
        return new RelatorioExcel();
    }
}
