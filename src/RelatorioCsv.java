public class RelatorioCsv implements iRelatorio {

    @Override
    public void relatorio(String model_relatorio){
        System.out.println("CSV: " + model_relatorio);
    }
}
