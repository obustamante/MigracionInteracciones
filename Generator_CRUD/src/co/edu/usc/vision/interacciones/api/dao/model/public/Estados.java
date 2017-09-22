package co.edu.usc.vision.interacciones.api.dao.model.public;

import java.io.Serializable;
import java.math.BigDecimal;

public class Estados implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.estados.idestado
     *
     * @mbggenerated
     */
    private BigDecimal idestado;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.estados.nombre
     *
     * @mbggenerated
     */
    private String nombre;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.estados
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.estados.idestado
     *
     * @return the value of public.estados.idestado
     *
     * @mbggenerated
     */
    public BigDecimal getIdestado() {
        return idestado;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.estados.idestado
     *
     * @param idestado the value for public.estados.idestado
     *
     * @mbggenerated
     */
    public void setIdestado(BigDecimal idestado) {
        this.idestado = idestado;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.estados.nombre
     *
     * @return the value of public.estados.nombre
     *
     * @mbggenerated
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.estados.nombre
     *
     * @param nombre the value for public.estados.nombre
     *
     * @mbggenerated
     */
    public void setNombre(String nombre) {
        this.nombre = nombre == null ? null : nombre.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.estados
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
        Estados other = (Estados) that;
        return (this.getIdestado() == null ? other.getIdestado() == null : this.getIdestado().equals(other.getIdestado()))
            && (this.getNombre() == null ? other.getNombre() == null : this.getNombre().equals(other.getNombre()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.estados
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdestado() == null) ? 0 : getIdestado().hashCode());
        result = prime * result + ((getNombre() == null) ? 0 : getNombre().hashCode());
        return result;
    }
}