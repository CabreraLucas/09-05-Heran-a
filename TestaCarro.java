public class TestaCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        
        carro.setMarca("Fiat");
        carro.setModelo("Pálio");
        carro.setPlaca("EDD-2503");
        carro.setRenavam(1234567890);

        System.out.println("Marca: "+carro.getMarca());
        System.out.println("Modelo: "+carro.getModelo());
        System.out.println("Placa: "+carro.getPlaca());
        System.out.println("Renavam: "+carro.getRenavam());
    }
}
