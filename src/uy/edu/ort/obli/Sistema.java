package uy.edu.ort.obli;

import java.util.ArrayList;

import uy.edu.ort.obli.Retorno.Resultado;

public class Sistema implements ISistema {
	
	ABB <Usuario> usuarios;
	Grafo direcciones;
	/* Grafo direccionesTransporte; */

	@Override
	public Retorno inicializarSistema(int maxPuntos) {
		
		if(maxPuntos<=0) {
			return new Retorno(Resultado.ERROR_1);
		}
		
		usuarios = new ABB <Usuario>();
		
		
		direcciones = new Grafo(maxPuntos, false);
		
		return new Retorno(Resultado.OK);
	}

	@Override
	public Retorno destruirSistema() {
		
		usuarios = null;
		direcciones= null;
		return new Retorno(Resultado.OK);
	}

	@Override
	public Retorno registrarUsuario(String email, String nombre, String password) {

		Usuario u = new Usuario (nombre,email,password);
		if (!u.ValidarEmail()) {
			return new Retorno(Resultado.ERROR_1);
		}
		else {
			if (usuarios.pertenece(u)){
				return new Retorno(Resultado.ERROR_2);
				}
			else {
				usuarios.insertar(u);
				return new Retorno(Resultado.OK);
			}
		}
	}

	@Override
	public Retorno buscarUsuario(String email) {
		
		Retorno r = new Retorno (Resultado.OK);
		
		Usuario u = new Usuario (email);
		
		if(!u.ValidarEmail()) {
			r = new Retorno (Resultado.ERROR_1);
		}
		Usuario buscado = usuarios.buscar(u);

		if(buscado!= null){
			r.valorString = buscado.toString();
			r.valorEntero = usuarios.buscarPos(buscado);
		}else {
			r = new Retorno (Resultado.ERROR_2);
		}
		
		return r;
	}

	@Override
	public Retorno listarUsuarios() {
		
		Retorno r = new Retorno (Resultado.OK);
		r.valorString = usuarios.listarAscendiente();
		return r;
	}

	@Override
	public Retorno direccionesDeUsuario(String email) {
		return new Retorno(Resultado.NO_IMPLEMENTADA);
	}

	@Override
	public Retorno registrarEsquina(double coordX, double coordY) {
		return new Retorno(Resultado.NO_IMPLEMENTADA);
	}

	@Override
	public Retorno registrarTramo(double coordXi, double coordYi, double coordXf, double coordYf, int metros, int minutos) {
		return new Retorno(Resultado.NO_IMPLEMENTADA);
	}

	@Override
	public Retorno registrarDelivery(String cedula, Double coordX, Double coordY) {
		return new Retorno(Resultado.NO_IMPLEMENTADA);
	}

	@Override
	public Retorno registrarMovil(String matricula, Double coordX, Double coordY) {
		return new Retorno(Resultado.NO_IMPLEMENTADA);
	}

	@Override
	public Retorno movilMasCercano(Double coordXi, Double coordYi) {
		return new Retorno(Resultado.NO_IMPLEMENTADA);
	}

	@Override
	public Retorno deliveryMasCercano(Double coordXi, Double coordYi) {
		return new Retorno(Resultado.NO_IMPLEMENTADA);
	}

	@Override
	public Retorno caminoMinimoMovil(Double coordXi, Double coordYi, Double coordXf, Double coordYf) {
		return new Retorno(Resultado.NO_IMPLEMENTADA);
	}

	@Override
	public Retorno caminoMinimoDelivery(Double coordXi, Double coordYi, Double coordXf, Double coordYf) {
		return new Retorno(Resultado.NO_IMPLEMENTADA);
	}

	@Override
	public Retorno dibujarMapa() {
		return new Retorno(Resultado.NO_IMPLEMENTADA);
	}

}
