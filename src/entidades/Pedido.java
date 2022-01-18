package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades.enums.StatusPedido;

public class Pedido {

	private Date momento;
	private StatusPedido status;

	private Cliente cliente;
	private List<ItemDePedido> itemDePedido = new ArrayList<>();
	
	SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
	
	public Pedido() {
	}

	public Pedido(Date momento, StatusPedido status) {
		this.momento = momento;
		this.status = status;
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

	public List<ItemDePedido> getItemDePedido() {
		return itemDePedido;
	}

	public void addItem(ItemDePedido itemPedido) {
		itemDePedido.add(itemPedido);
	}

	public void removeItem(ItemDePedido itemPedido) {
		itemDePedido.remove(itemPedido);
	}

	public Double total() {

		double total = 0.0;

		for (ItemDePedido p : itemDePedido) {

			total += p.subTotal();
		}

		return total;
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Momento da ordem: " + sdf.format(momento) + "\n");
		sb.append("Status da ordem: " + status + "\n");
		sb.append("Cliente" + cliente);
//		sb.append("(" + cliente.getDataDeNascimento() + ")" + cliente.getEmail() + "\n");
		sb.append("Itens da ordem:\n" );
		for(ItemDePedido p : itemDePedido) {
			sb.append(p.getProduto() + ", quantidade: ");
			sb.append(p.getQuantidade() + ", subTotal: ");
			sb.append(p.subTotal() + "\n");
		}
	sb.append("Total: " + total());
		return sb.toString();
	}
	
	

}
