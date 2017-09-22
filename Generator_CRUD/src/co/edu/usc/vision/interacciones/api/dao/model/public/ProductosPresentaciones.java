package co.edu.usc.vision.interacciones.api.dao.model.public;

import java.io.Serializable;
import java.math.BigDecimal;

public class ProductosPresentaciones implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.productos_presentaciones.idcum
     *
     * @mbggenerated
     */
    private BigDecimal idcum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.productos_presentaciones.cum
     *
     * @mbggenerated
     */
    private String cum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.productos_presentaciones.presentacion
     *
     * @mbggenerated
     */
    private BigDecimal presentacion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.productos_presentaciones.via
     *
     * @mbggenerated
     */
    private BigDecimal via;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.productos_presentaciones.idcodigoinvima
     *
     * @mbggenerated
     */
    private BigDecimal idcodigoinvima;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.productos_presentaciones.volumen
     *
     * @mbggenerated
     */
    private Integer volumen;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.productos_presentaciones
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.productos_presentaciones.idcum
     *
     * @return the value of public.productos_presentaciones.idcum
     *
     * @mbggenerated
     */
    public BigDecimal getIdcum() {
        return idcum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.productos_presentaciones.idcum
     *
     * @param idcum the value for public.productos_presentaciones.idcum
     *
     * @mbggenerated
     */
    public void setIdcum(BigDecimal idcum) {
        this.idcum = idcum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.productos_presentaciones.cum
     *
     * @return the value of public.productos_presentaciones.cum
     *
     * @mbggenerated
     */
    public String getCum() {
        return cum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.productos_presentaciones.cum
     *
     * @param cum the value for public.productos_presentaciones.cum
     *
     * @mbggenerated
     */
    public void setCum(String cum) {
        this.cum = cum == null ? null : cum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.productos_presentaciones.presentacion
     *
     * @return the value of public.productos_presentaciones.presentacion
     *
     * @mbggenerated
     */
    public BigDecimal getPresentacion() {
        return presentacion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.productos_presentaciones.presentacion
     *
     * @param presentacion the value for public.productos_presentaciones.presentacion
     *
     * @mbggenerated
     */
    public void setPresentacion(BigDecimal presentacion) {
        this.presentacion = presentacion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.productos_presentaciones.via
     *
     * @return the value of public.productos_presentaciones.via
     *
     * @mbggenerated
     */
    public BigDecimal getVia() {
        return via;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.productos_presentaciones.via
     *
     * @param via the value for public.productos_presentaciones.via
     *
     * @mbggenerated
     */
    public void setVia(BigDecimal via) {
        this.via = via;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.productos_presentaciones.idcodigoinvima
     *
     * @return the value of public.productos_presentaciones.idcodigoinvima
     *
     * @mbggenerated
     */
    public BigDecimal getIdcodigoinvima() {
        return idcodigoinvima;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.productos_presentaciones.idcodigoinvima
     *
     * @param idcodigoinvima the value for public.productos_presentaciones.idcodigoinvima
     *
     * @mbggenerated
     */
    public void setIdcodigoinvima(BigDecimal idcodigoinvima) {
        this.idcodigoinvima = idcodigoinvima;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.productos_presentaciones.volumen
     *
     * @return the value of public.productos_presentaciones.volumen
     *
     * @mbggenerated
     */
    public Integer getVolumen() {
        return volumen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.productos_presentaciones.volumen
     *
     * @param volumen the value for public.productos_presentaciones.volumen
     *
     * @mbggenerated
     */
    public void setVolumen(Integer volumen) {
        this.volumen = volumen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.productos_presentaciones
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ProductosPresentaciones other = (ProductosPresentaciones) that;
        return (this.getIdcum() == null ? other.getIdcum() == null : this.getIdcum().equals(other.getIdcum()))
            && (this.getCum() == null ? other.getCum() == null : this.getCum().equals(other.getCum()))
            && (this.getPresentacion() == null ? other.getPresentacion() == null : this.getPresentacion().equals(other.getPresentacion()))
            && (this.getVia() == null ? other.getVia() == null : this.getVia().equals(other.getVia()))
            && (this.getIdcodigoinvima() == null ? other.getIdcodigoinvima() == null : this.getIdcodigoinvima().equals(other.getIdcodigoinvima()))
            && (this.getVolumen() == null ? other.getVolumen() == null : this.getVolumen().equals(other.getVolumen()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.productos_presentaciones
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdcum() == null) ? 0 : getIdcum().hashCode());
        result = prime * result + ((getCum() == null) ? 0 : getCum().hashCode());
        result = prime * result + ((getPresentacion() == null) ? 0 : getPresentacion().hashCode());
        result = prime * result + ((getVia() == null) ? 0 : getVia().hashCode());
        result = prime * result + ((getIdcodigoinvima() == null) ? 0 : getIdcodigoinvima().hashCode());
        result = prime * result + ((getVolumen() == null) ? 0 : getVolumen().hashCode());
        return result;
    }
}