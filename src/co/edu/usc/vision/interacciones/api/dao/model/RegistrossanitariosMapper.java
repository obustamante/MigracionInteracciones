package co.edu.usc.vision.interacciones.api.dao.model;

import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface RegistrossanitariosMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registrossanitarios
     *
     * @mbggenerated
     */
    int countByExample(RegistrossanitariosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registrossanitarios
     *
     * @mbggenerated
     */
    int deleteByExample(RegistrossanitariosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registrossanitarios
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(BigDecimal idcodigoinvima);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registrossanitarios
     *
     * @mbggenerated
     */
    int insert(Registrossanitarios record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registrossanitarios
     *
     * @mbggenerated
     */
    int insertSelective(Registrossanitarios record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registrossanitarios
     *
     * @mbggenerated
     */
    List<Registrossanitarios> selectByExample(RegistrossanitariosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registrossanitarios
     *
     * @mbggenerated
     */
    Registrossanitarios selectByPrimaryKey(BigDecimal idcodigoinvima);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registrossanitarios
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Registrossanitarios record, @Param("example") RegistrossanitariosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registrossanitarios
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Registrossanitarios record, @Param("example") RegistrossanitariosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registrossanitarios
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Registrossanitarios record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registrossanitarios
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Registrossanitarios record);
}