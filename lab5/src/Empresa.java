
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Empresa {
    private String nombre;
    private int capital;
    private Date fundacion;
    private String ubicacion;
    private int ID;
    private String pin;
    private DefaultTreeModel modeloarbol=new DefaultTreeModel(new DefaultMutableTreeNode());
    private DefaultListModel modelolista=new DefaultListModel();

    public Empresa() {
    }

    public Empresa(String nombre, int capital, Date fundacion, String ubicacion, int ID, String pin) {
        this.nombre = nombre;
        this.capital = capital;
        this.fundacion = fundacion;
        this.ubicacion = ubicacion;
        this.ID = ID;
        this.pin = pin;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public Date getFundacion() {
        return fundacion;
    }

    public void setFundacion(Date fundacion) {
        this.fundacion = fundacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public DefaultTreeModel getModeloarbol() {
        return modeloarbol;
    }

    public void setModeloarbol(DefaultTreeModel modeloarbol) {
        this.modeloarbol = modeloarbol;
    }

    public DefaultListModel getModelolista() {
        return modelolista;
    }

    public void setModelolista(DefaultListModel modelolista) {
        this.modelolista = modelolista;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + "\n capital=" + capital + "\n fundacion=" + fundacion + "\n ubicacion=" + ubicacion + "\n ID=" + ID + "\n pin=" + pin + "\n modeloarbol=" + modeloarbol + "\n modelolista=" + modelolista ;
    }
    

    
    
}
