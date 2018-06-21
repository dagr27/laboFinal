/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Daniel Gómez
 */
public class Filtro {
    private int id;
    private String codigo;
    private String marca;
    private int stock;
    private boolean existencia;
    
    public Filtro(){
    }
    public Filtro(int id, String codigo, String marca, int stock, boolean existencia){
    this.id = id;
    this.codigo = codigo;
    this.marca = marca;
    this.stock = stock;
    this.existencia = existencia;
    }
    public Filtro(String codigo, String marca, int stock, boolean existencia) {
        this.codigo = codigo;
        this.marca = marca;
        this.stock = stock;
        this.existencia = existencia;
    }
    public Filtro(String marca, int stock, boolean existencia){
    this.marca = marca;
    this.stock = stock;
    this.existencia= existencia;
    }
    public int getId(){
        return this.id;
    }
    public String getCodigo(){
        return this.codigo;
    }
    public String getMarca(){
        return this.marca;
    }
    public int getStock(){
        return this.stock;
    }
    public boolean getExistencia(){
        return this.existencia;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setExistencia(boolean existencia) {
        this.existencia = existencia;
    }
}
