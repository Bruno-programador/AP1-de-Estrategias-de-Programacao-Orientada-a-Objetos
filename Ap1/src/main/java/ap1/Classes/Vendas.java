/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ap1.Classes;

/**
 *
 * @author Bruno 5600
 */
public class Vendas {
    
    private String id;
    private Cliente cliente;
    private Motocicleta motocicleta;
    private String parcelas;
    private double valorParcelas;
    
    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Motocicleta getMotocicleta() {
        return motocicleta;
    }

    public void setMotocicleta(Motocicleta motocicleta) {
        this.motocicleta = motocicleta;
    }

    public String getParcelas() {
        return parcelas;
    }

    public void setParcelas(String parcelas) {
        this.parcelas = parcelas;
    }
    
    public double getValorParcelas() {
        return valorParcelas;
    }

    public void setValorParcelas(double valorParcelas) {
        this.valorParcelas = valorParcelas;
    }
    
    @Override
    public String toString(){
        return this.id;
    }
}
