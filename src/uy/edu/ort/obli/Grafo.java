package uy.edu.ort.obli;

public class Grafo {
	private int tope;
	private int cant;
	private Punto[] vertices;
	private Arista[][] matAdy;

	public Grafo(int tope, boolean esDirigido) {
		this.tope = tope;
		this.vertices = new Punto[tope];
		this.matAdy = new Arista[tope][tope];
		if (esDirigido) {
			for (int i = 0; i < matAdy.length; i++) {
				for (int j = 0; j < matAdy.length; j++) {
					matAdy[i][j] = new Arista();
				}
			}
		} else {
			for (int i = 0; i < matAdy.length; i++) {
				for (int j = i; j < matAdy.length; j++) {
					matAdy[i][j] = matAdy[j][i] = new Arista();
				}
			}
		}
	}

	public boolean esLleno() {
		return cant == tope;
	}

	public boolean esVacio() {
		return cant == 0;
	}

	// Pre: !esLleno()
	public void agregarVertice(Punto dato) {
		int pos = posHueco();
		vertices[pos] = dato;
		cant++;
	}

	private int posHueco() {
		int pos = 0;
		while (vertices[pos] != null)
			pos++;
		return pos;
	}

	public boolean existeVertice(Punto origen) {
		return buscarPos(origen) != -1;
	}

	// Pre: existeVertice(origen) && existeVertice(destino)
	public boolean existeArista(Punto origen, Punto destino) {
		int posOrigen = buscarPos(origen);
		int posDestino = buscarPos(destino);

		return matAdy[posOrigen][posDestino].isExiste();
	}

	// Pre: existeVertice(origen) && existeVertice(destino)
	public void borrarArista(Punto origen, Punto destino) {
		int posOrigen = buscarPos(origen);
		int posDestino = buscarPos(destino);

		matAdy[posOrigen][posDestino].setExiste(false);
	}

	// Pre: existeVertice(origen)
	public void borrarVertice(Punto origen) {
		int posOrigen = buscarPos(origen);
		cant--;
		vertices[posOrigen] = null;
		for (int i = 0; i < tope; i++) {
			matAdy[i][posOrigen].setExiste(false);
			matAdy[posOrigen][i].setExiste(false);
		}
	}

	// Pre: existeVertice(origen) && existeVertice(destino) && !existeArista(origen,
	// destino)
	public void agregarArista(Punto origen, Punto destino, int costo) {
		int posOrigen = buscarPos(origen);
		int posDestino = buscarPos(destino);

		matAdy[posOrigen][posDestino].setExiste(true);
		matAdy[posOrigen][posDestino].setCosto(costo);
	}

	private int buscarPos(Punto destino) {
		for (int i = 0; i < tope; i++) {
			if (destino.equals(vertices[i])) {
				return i;
			}
		}
		return -1;
	}

}
