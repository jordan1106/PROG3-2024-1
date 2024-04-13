package com.pucp.seguridad;
public class CuentaUsuario{
	private int idCuentaUsuario;
	private String username;
	private String password;
	
	public int getIdCuentaUsuario(){
		return idCuentaUsuario;
	}
	public void setIdCuentaUsuario(int idCuentaUsuario){
		this.idCuentaUsuario = idCuentaUsuario;
	}
	public String getUsername(){
		return username;
	}
	public void setUsername(String username){
		this.username = username;
	}
}