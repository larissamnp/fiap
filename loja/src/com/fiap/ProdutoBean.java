package com.fiap;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="p")
public class ProdutoBean {
	
	private String nmProduto;
	private String fotoProduto;
	private int cdProduto;
	
	public String btnPesquisar(){
		setNmProduto((getCdProduto() == 1 ? "Calça" : "Blusa"));
		setFotoProduto((getCdProduto() == 1 ? "Calca.jpg" : "Blusa.jpg"));
		return "";
	}
	
	
	public String getNmProduto() {
		return nmProduto;
	}
	public void setNmProduto(String nmProduto) {
		this.nmProduto = nmProduto;
	}
	public int getCdProduto() {
		return cdProduto;
	}
	public void setCdProduto(int cdProduto) {
		this.cdProduto = cdProduto;
	}
	public String getFotoProduto() {
		return fotoProduto;
	}
	public void setFotoProduto(String fotoProduto) {
		this.fotoProduto = fotoProduto;
	}
	
	

}
