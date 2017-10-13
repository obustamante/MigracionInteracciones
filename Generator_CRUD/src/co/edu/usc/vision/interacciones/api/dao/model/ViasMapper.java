package co.edu.usc.vision.interacciones.api.dao.model;

import co.edu.usc.vision.interacciones.api.dao.model.Vias;
import co.edu.usc.vision.interacciones.api.dao.model.ViasExample;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface ViasMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vias
     *
     * @mbggenerated
     */
    int countByExample(ViasExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vias
     *
     * @mbggenerated
     */
    int deleteByExample(ViasExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vias
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(BigDecimal idvias);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vias
     *
     * @mbggenerated
     */
    int insert(Vias record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vias
     *
     * @mbggenerated
     */
    int insertSelective(Vias record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vias
     *
     * @mbggenerated
     */
    List<Vias> selectByExample(ViasExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vias
     *
     * @mbggenerated
     */
    Vias selectByPrimaryKey(BigDecimal idvias);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vias
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Vias record, @Param("example") ViasExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vias
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Vias record, @Param("example") ViasExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vias
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Vias record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vias
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Vias record);
}