package co.edu.usc.vision.interacciones.api.dao.model;

import java.io.Serializable;

public class Moleculas implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column moleculas.idmoleculas
     *
     * @mbggenerated
     */
    private Long idmoleculas;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column moleculas.nombre
     *
     * @mbggenerated
     */
    private String nombre;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column moleculas.tiempovida
     *
     * @mbggenerated
     */
    private Integer tiempovida;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table moleculas
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column moleculas.idmoleculas
     *
     * @return the value of moleculas.idmoleculas
     *
     * @mbggenerated
     */
    public Long getIdmoleculas() {
        return idmoleculas;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column moleculas.idmoleculas
     *
     * @param idmoleculas the value for moleculas.idmoleculas
     *
     * @mbggenerated
     */
    public void setIdmoleculas(Long idmoleculas) {
        this.idmoleculas = idmoleculas;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column moleculas.nombre
     *
     * @return the value of moleculas.nombre
     *
     * @mbggenerated
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column moleculas.nombre
     *
     * @param nombre the value for moleculas.nombre
     *
     * @mbggenerated
     */
    public void setNombre(String nombre) {
        this.nombre = nombre == null ? null : nombre.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column moleculas.tiempovida
     *
     * @return the value of moleculas.tiempovida
     *
     * @mbggenerated
     */
    public Integer getTiempovida() {
        return tiempovida;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column moleculas.tiempovida
     *
     * @param tiempovida the value for moleculas.tiempovida
     *
     * @mbggenerated
     */
    public void setTiempovida(Integer tiempovida) {
        this.tiempovida = tiempovida;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table moleculas
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
        Moleculas other = (Moleculas) that;
        return (this.getIdmoleculas() == null ? other.getIdmoleculas() == null : this.getIdmoleculas().equals(other.getIdmoleculas()))
            && (this.getNombre() == null ? other.getNombre() == null : this.getNombre().equals(other.getNombre()))
            && (this.getTiempovida() == null ? other.getTiempovida() == null : this.getTiempovida().equals(other.getTiempovida()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table moleculas
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdmoleculas() == null) ? 0 : getIdmoleculas().hashCode());
        result = prime * result + ((getNombre() == null) ? 0 : getNombre().hashCode());
        result = prime * result + ((getTiempovida() == null) ? 0 : getTiempovida().hashCode());
        return result;
    }
}