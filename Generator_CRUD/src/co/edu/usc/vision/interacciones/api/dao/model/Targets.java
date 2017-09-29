package co.edu.usc.vision.interacciones.api.dao.model;

import java.io.Serializable;

public class Targets implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column targets.idtarget
     *
     * @mbggenerated
     */
    private Integer idtarget;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column targets.nombre
     *
     * @mbggenerated
     */
    private String nombre;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table targets
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column targets.idtarget
     *
     * @return the value of targets.idtarget
     *
     * @mbggenerated
     */
    public Integer getIdtarget() {
        return idtarget;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column targets.idtarget
     *
     * @param idtarget the value for targets.idtarget
     *
     * @mbggenerated
     */
    public void setIdtarget(Integer idtarget) {
        this.idtarget = idtarget;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column targets.nombre
     *
     * @return the value of targets.nombre
     *
     * @mbggenerated
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column targets.nombre
     *
     * @param nombre the value for targets.nombre
     *
     * @mbggenerated
     */
    public void setNombre(String nombre) {
        this.nombre = nombre == null ? null : nombre.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table targets
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
        Targets other = (Targets) that;
        return (this.getIdtarget() == null ? other.getIdtarget() == null : this.getIdtarget().equals(other.getIdtarget()))
            && (this.getNombre() == null ? other.getNombre() == null : this.getNombre().equals(other.getNombre()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table targets
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdtarget() == null) ? 0 : getIdtarget().hashCode());
        result = prime * result + ((getNombre() == null) ? 0 : getNombre().hashCode());
        return result;
    }
}