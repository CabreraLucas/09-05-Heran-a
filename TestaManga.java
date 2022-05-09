import javafx.print.PrintColor;

public class TestaManga {
    public static void main(String[] args) {
        
        Manga manga=new Manga();
        manga.setFolhas("Largas");
        manga.setPreco(6.59);
        manga.setTronco(1);
        manga.setRaizes("Internas");
        manga.setFruto("Sim");

        System.out.println("Folhas: "+manga.getFolhas());
        System.out.println("Preço: "+manga.getPreco());
        System.out.println("Tronco: "+manga.getTronco());
        System.out.println("Raizes: "+manga.getRaizes());
        System.out.println("Fruto: "+manga.getFruto());
    }
}
