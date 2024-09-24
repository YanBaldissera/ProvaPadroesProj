public class teste_relatorio {

    public static void main(String[] args) {

        relatorioService service = new relatorioService();

        service.efetivarRelatorio(new fabricaRelatorioCsv(),

                "texto do relatório");

        service.efetivarRelatorio(new fabricaRelatorioExcel(),

                "texto do relatório");

        service.efetivarRelatorio(new fabricaRelatorioPdf(),

                "texto do relatório");

    }
}
