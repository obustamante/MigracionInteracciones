package co.edu.usc.vision.interacciones.api.dao.model;

import java.io.Serializable;

public class Efectos implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column efectos.idefectos
     *
     * @mbggenerated
     */
    private Short idefectos;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column efectos.nombre
     *
     * @mbggenerated
     */
    private String nombre;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table efectos
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column efectos.idefectos
     *
     * @return the value of efectos.idefectos
     *
     * @mbggenerated
     */
    public Short getIdefectos() {
        return idefectos;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column efectos.idefectos
     *
     * @param idefectos the value for efectos.idefectos
     *
     * @mbggenerated
     */
    public void setIdefectos(Short idefectos) {
        this.idefectos = idefectos;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column efectos.nombre
     *
     * @return the value of efectos.nombre
     *
     * @mbggenerated
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column efectos.nombre
     *
     * @param nombre the value for efectos.nombre
     *
     * @mbggenerated
     */
    public void setNombre(String nombre) {
        this.nombre = nombre == null ? null : nombre.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table efectos
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
        Efectos other = (Efectos) that;
        return (this.getIdefectos() == null ? other.getIdefectos() == null : this.getIdefectos().equals(other.getIdefectos()))
            && (this.getNombre() == null ? other.getNombre() == null : this.getNombre().equals(other.getNombre()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table efectos
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdefectos() == null) ? 0 : getIdefectos().hashCode());
        result = prime * result + ((getNombre() == null) ? 0 : getNombre().hashCode());
        return result;
    }
}