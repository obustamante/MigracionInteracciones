package co.edu.usc.vision.interacciones.api.dao.model;

import co.edu.usc.vision.interacciones.api.dao.model.Interaccionescomponentes;
import co.edu.usc.vision.interacciones.api.dao.model.InteraccionescomponentesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InteraccionescomponentesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table interaccionescomponentes
     *
     * @mbggenerated
     */
    int countByExample(InteraccionescomponentesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table interaccionescomponentes
     *
     * @mbggenerated
     */
    int deleteByExample(InteraccionescomponentesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table interaccionescomponentes
     *
     * @mbggenerated
     */
    int insert(Interaccionescomponentes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table interaccionescomponentes
     *
     * @mbggenerated
     */
    int insertSelective(Interaccionescomponentes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table interaccionescomponentes
     *
     * @mbggenerated
     */
    List<Interaccionescomponentes> selectByExample(InteraccionescomponentesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table interaccionescomponentes
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Interaccionescomponentes record, @Param("example") InteraccionescomponentesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table interaccionescomponentes
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Interaccionescomponentes record, @Param("example") InteraccionescomponentesExample example);
}