public class Main {
        public static void main(String[] args){
        conectaDAO conector = new conectaDAO();
        conector.connectDB();

        cadastroVIEW tela = new cadastroVIEW();
        tela.setVisible(true);
    }
}
