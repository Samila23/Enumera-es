
package application;
import java.util.Date;

import entidade.enums.StatusDoPedido;
import entities.Pedidos;

public class Program {

	
	public static void main(String[] args) {
		
		Pedidos pedidos = new Pedidos (1080 , new Date() , StatusDoPedido.AGUARDANDO_PAGAMENTO);
		
		System.out.println(pedidos);
		
		// Converter String para Enum
		StatusDoPedido status01 = StatusDoPedido.ENTREGUE;
		StatusDoPedido status02 = StatusDoPedido.valueOf("ENTREGUE");
		
		System.out.println(status01);
		System.out.println(status02);
	}
} 

package entities;
import java.util.Date;
import entidade.enums.StatusDoPedido;

public class Pedidos {
	private Integer id;
	private Date data;
	private StatusDoPedido status;
	
	public Pedidos() {
	}
	public Pedidos(Integer id, Date data, StatusDoPedido status) {
		this.id = id;
		this.data = data;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public StatusDoPedido getStatus() {
		return status;
	}

	public void setStatus(StatusDoPedido status) {
		this.status = status;
	}

	public String toString() {
		return "Pedidos [id=" + id + ", data=" + data + ", status=" + status + "]";
	}
	
}

package entidade.enums;

public enum StatusDoPedido {
	AGUARDANDO_PAGAMENTO, 
	PROCESSANDO,
	ENVIADO,
	ENTREGUE
}
