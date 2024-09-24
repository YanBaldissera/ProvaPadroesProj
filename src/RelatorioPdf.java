public class RelatorioPdf implements iRelatorio{

    @Override
    public void relatorio(String model_relatorio){
        System.out.println("PDF: " + model_relatorio);
    }
}
