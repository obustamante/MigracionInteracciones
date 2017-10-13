package co.edu.usc.vision.interacciones.api.dao.model;

import co.edu.usc.vision.interacciones.api.dao.model.Unidadesmedida;
import co.edu.usc.vision.interacciones.api.dao.model.UnidadesmedidaExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UnidadesmedidaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unidadesmedida
     *
     * @mbggenerated
     */
    int countByExample(UnidadesmedidaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unidadesmedida
     *
     * @mbggenerated
     */
    int deleteByExample(UnidadesmedidaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unidadesmedida
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String abreviatura);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unidadesmedida
     *
     * @mbggenerated
     */
    int insert(Unidadesmedida record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unidadesmedida
     *
     * @mbggenerated
     */
    int insertSelective(Unidadesmedida record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unidadesmedida
     *
     * @mbggenerated
     */
    List<Unidadesmedida> selectByExample(UnidadesmedidaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unidadesmedida
     *
     * @mbggenerated
     */
    Unidadesmedida selectByPrimaryKey(String abreviatura);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unidadesmedida
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Unidadesmedida record, @Param("example") UnidadesmedidaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unidadesmedida
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Unidadesmedida record, @Param("example") UnidadesmedidaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unidadesmedida
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Unidadesmedida record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unidadesmedida
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Unidadesmedida record);
}