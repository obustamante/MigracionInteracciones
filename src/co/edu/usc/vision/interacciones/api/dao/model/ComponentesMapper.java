package co.edu.usc.vision.interacciones.api.dao.model;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ComponentesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table componentes
     *
     * @mbggenerated
     */
    int countByExample(ComponentesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table componentes
     *
     * @mbggenerated
     */
    int deleteByExample(ComponentesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table componentes
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String codigoatc);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table componentes
     *
     * @mbggenerated
     */
    int insert(Componentes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table componentes
     *
     * @mbggenerated
     */
    int insertSelective(Componentes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table componentes
     *
     * @mbggenerated
     */
    List<Componentes> selectByExample(ComponentesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table componentes
     *
     * @mbggenerated
     */
    Componentes selectByPrimaryKey(String codigoatc);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table componentes
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Componentes record, @Param("example") ComponentesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table componentes
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Componentes record, @Param("example") ComponentesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table componentes
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Componentes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table componentes
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Componentes record);
}