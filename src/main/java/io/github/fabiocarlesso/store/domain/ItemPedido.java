package io.github.fabiocarlesso.store.domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
public class ItemPedido implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @JsonIgnore
    @EmbeddedId
    private ItemPedidoPK id = new ItemPedidoPK();

    private Double desconto;
    private Integer quantidade;
    private Double preco;

    public ItemPedido(Pedido pedido, Produto produto, Double desconto, Integer quantidade, Double preco) {
        super();
        id.setPedido(pedido);
        id.setProduto(produto);
        this.desconto = desconto;
        this.quantidade = quantidade;
        this.preco = preco;
    }    
    
    @JsonIgnore
    public Pedido getPedido(){
        return id.getPedido();
    }

    @JsonIgnore
    public Produto getProduto(){
        return id.getProduto();
    }

}
