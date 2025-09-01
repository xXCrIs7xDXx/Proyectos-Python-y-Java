package Grafos;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//true = grafo no dirigido
		//false = grafo dirigido
		GrafoMAD g = new GrafoMAD(6, true);
		
		g.insertaArista(0, 1);
		g.insertaArista(0, 2);
		g.insertaArista(0, 3);
		
		g.insertaArista(1, 2);
		g.insertaArista(1, 5);
		
		g.insertaArista(2, 4);
		
		g.insertaArista(3, 4);
		
		g.insertaArista(4, 5);
		
		g.insertaArista(5, 5);
		
		//System.out.println(g.grado(1));
		g.imprimeGrafo();
		//siempre y cuando el grafo sea DIRIGIDO
		System.out.println("Interno: " + g.gradoInterno(0));
		System.out.println("Externo: " + g.gradoExterno(0));
		
		//siempre y cuando el grafo sea NO DIRIGIDO
		System.out.println("Grado: " + g.grado(0));
		
		
		System.out.println();
	//	System.out.println(g.gradoExterno(3));
	//	System.out.println(g.gradoInterno(3));
		
		//System.out.println(g.grado(3));
		System.out.println("Recorrido");
		System.out.println("Anchura(BFS):");
		g.amplitud(g);
		System.out.println("\nProfundidad(DFS):");
		g.profundidad(g);
		
		
	}

}
