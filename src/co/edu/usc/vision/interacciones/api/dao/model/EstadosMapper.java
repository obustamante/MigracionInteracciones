package co.edu.usc.vision.interacciones.api.dao.model;

import co.edu.usc.vision.interacciones.api.dao.model.Estados;
import co.edu.usc.vision.interacciones.api.dao.model.EstadosExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EstadosMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table estados
     *
     * @mbggenerated
     */
    int countByExample(EstadosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table estados
     *
     * @mbggenerated
     */
    int deleteByExample(EstadosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table estados
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(BigDecimal idestado);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table estados
     *
     * @mbggenerated
     */
    int insert(Estados record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table estados
     *
     * @mbggenerated
     */
    int insertSelective(Estados record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table estados
     *
     * @mbggenerated
     */
    List<Estados> selectByExample(EstadosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table estados
     *
     * @mbggenerated
     */
    Estados selectByPrimaryKey(BigDecimal idestado);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table estados
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Estados record, @Param("example") EstadosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table estados
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Estados record, @Param("example") EstadosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table estados
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Estados record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table estados
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Estados record);
}