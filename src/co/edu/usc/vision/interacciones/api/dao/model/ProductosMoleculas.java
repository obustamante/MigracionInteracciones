package co.edu.usc.vision.interacciones.api.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class ProductosMoleculas implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productos_moleculas.idmolecula
     *
     * @mbggenerated
     */
    private BigDecimal idmolecula;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productos_moleculas.molecula
     *
     * @mbggenerated
     */
    private Long molecula;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productos_moleculas.idcum
     *
     * @mbggenerated
     */
    private BigDecimal idcum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productos_moleculas.unidaddilusion
     *
     * @mbggenerated
     */
    private String unidaddilusion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productos_moleculas.unidadcomponente
     *
     * @mbggenerated
     */
    private String unidadcomponente;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productos_moleculas.concentracionmolecula
     *
     * @mbggenerated
     */
    private BigDecimal concentracionmolecula;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table productos_moleculas
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productos_moleculas.idmolecula
     *
     * @return the value of productos_moleculas.idmolecula
     *
     * @mbggenerated
     */
    public BigDecimal getIdmolecula() {
        return idmolecula;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productos_moleculas.idmolecula
     *
     * @param idmolecula the value for productos_moleculas.idmolecula
     *
     * @mbggenerated
     */
    public void setIdmolecula(BigDecimal idmolecula) {
        this.idmolecula = idmolecula;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productos_moleculas.molecula
     *
     * @return the value of productos_moleculas.molecula
     *
     * @mbggenerated
     */
    public Long getMolecula() {
        return molecula;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productos_moleculas.molecula
     *
     * @param molecula the value for productos_moleculas.molecula
     *
     * @mbggenerated
     */
    public void setMolecula(Long molecula) {
        this.molecula = molecula;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productos_moleculas.idcum
     *
     * @return the value of productos_moleculas.idcum
     *
     * @mbggenerated
     */
    public BigDecimal getIdcum() {
        return idcum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productos_moleculas.idcum
     *
     * @param idcum the value for productos_moleculas.idcum
     *
     * @mbggenerated
     */
    public void setIdcum(BigDecimal idcum) {
        this.idcum = idcum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productos_moleculas.unidaddilusion
     *
     * @return the value of productos_moleculas.unidaddilusion
     *
     * @mbggenerated
     */
    public String getUnidaddilusion() {
        return unidaddilusion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productos_moleculas.unidaddilusion
     *
     * @param unidaddilusion the value for productos_moleculas.unidaddilusion
     *
     * @mbggenerated
     */
    public void setUnidaddilusion(String unidaddilusion) {
        this.unidaddilusion = unidaddilusion == null ? null : unidaddilusion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productos_moleculas.unidadcomponente
     *
     * @return the value of productos_moleculas.unidadcomponente
     *
     * @mbggenerated
     */
    public String getUnidadcomponente() {
        return unidadcomponente;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productos_moleculas.unidadcomponente
     *
     * @param unidadcomponente the value for productos_moleculas.unidadcomponente
     *
     * @mbggenerated
     */
    public void setUnidadcomponente(String unidadcomponente) {
        this.unidadcomponente = unidadcomponente == null ? null : unidadcomponente.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productos_moleculas.concentracionmolecula
     *
     * @return the value of productos_moleculas.concentracionmolecula
     *
     * @mbggenerated
     */
    public BigDecimal getConcentracionmolecula() {
        return concentracionmolecula;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productos_moleculas.concentracionmolecula
     *
     * @param concentracionmolecula the value for productos_moleculas.concentracionmolecula
     *
     * @mbggenerated
     */
    public void setConcentracionmolecula(BigDecimal concentracionmolecula) {
        this.concentracionmolecula = concentracionmolecula;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productos_moleculas
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
        ProductosMoleculas other = (ProductosMoleculas) that;
        return (this.getIdmolecula() == null ? other.getIdmolecula() == null : this.getIdmolecula().equals(other.getIdmolecula()))
            && (this.getMolecula() == null ? other.getMolecula() == null : this.getMolecula().equals(other.getMolecula()))
            && (this.getIdcum() == null ? other.getIdcum() == null : this.getIdcum().equals(other.getIdcum()))
            && (this.getUnidaddilusion() == null ? other.getUnidaddilusion() == null : this.getUnidaddilusion().equals(other.getUnidaddilusion()))
            && (this.getUnidadcomponente() == null ? other.getUnidadcomponente() == null : this.getUnidadcomponente().equals(other.getUnidadcomponente()))
            && (this.getConcentracionmolecula() == null ? other.getConcentracionmolecula() == null : this.getConcentracionmolecula().equals(other.getConcentracionmolecula()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productos_moleculas
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdmolecula() == null) ? 0 : getIdmolecula().hashCode());
        result = prime * result + ((getMolecula() == null) ? 0 : getMolecula().hashCode());
        result = prime * result + ((getIdcum() == null) ? 0 : getIdcum().hashCode());
        result = prime * result + ((getUnidaddilusion() == null) ? 0 : getUnidaddilusion().hashCode());
        result = prime * result + ((getUnidadcomponente() == null) ? 0 : getUnidadcomponente().hashCode());
        result = prime * result + ((getConcentracionmolecula() == null) ? 0 : getConcentracionmolecula().hashCode());
        return result;
    }
}