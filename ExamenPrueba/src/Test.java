public class Test {
    public static void main(String[] args){
        int[] m = {5, 6, 3, 5, 3, 8, 1, 5};
        //int[] m = {1, 2, 3, 4, 5, 6, 7, 8};
        //int[] m = {8, 7, 6, 5, 4, 3, 2, 3};
        int numero = 3;

        System.out.println("Media Artimetica: " + MatriusSencersUtil.mitjaAritmetica(m));
        System.out.println("Valor minimo: " + MatriusSencersUtil.valorMinimo(m));
        System.out.println("Index minimo: " + MatriusSencersUtil.indexMinimo(m));
        System.out.println("Valor maximo: " + MatriusSencersUtil.valorMaximo(m));
        System.out.println("Index maximo: " + MatriusSencersUtil.indexMaximo(m));
        System.out.println("Esta ordenado ascendente: " + MatriusSencersUtil.estaOrdenadoAscendente(m));
        System.out.println("Esta ordenado descendiente: " + MatriusSencersUtil.estaOrdenadoDescendiente(m));
        System.out.println("Ordenado a la inversa: " + MatriusSencersUtil.invertir(m));
        System.out.println("Primer index del numero dado: " + MatriusSencersUtil.indexPrimeraOcurrencia(m, numero));
        System.out.println("Valor mas cercano a la media: " + MatriusSencersUtil.valorMasCercanoMedia(m, MatriusSencersUtil.mitjaAritmetica(m)));
        System.out.println("Matriz ordenada" + MatriusSencersUtil.arrayOrdenada(m));
        System.out.println("Fin");
    }
}
