package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades.enums.StatusPedido;

public class Pedido {

	private Date momento;
	private StatusPedido status;

	private Cliente cliente;
	private List<ItemDePedido> itemDePedido = new ArrayList<>();

	public Pedido() {
	}

	public Pedido(Date momento, StatusPedido status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void addItem(ItemDePedido itemPedido) {
		itemDePedido.add(itemPedido);
	}

	public void removeItem(ItemDePedido itemPedido) {
		itemDePedido.remove(itemPedido);
	}

	public Double total() {

		double total = 0;
		
		for (ItemDePedido p : itemDePedido) {

			total += p.subTotal();
		}

		return total;
	}

}
