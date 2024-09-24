public class RelatorioExcel implements iRelatorio{

    @Override
    public void relatorio(String model_relatorio){
        System.out.println("Excel: " + model_relatorio);
    }
}
