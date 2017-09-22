package co.edu.usc.vision.interacciones.api.dao.model.public;

import co.edu.usc.vision.interacciones.api.dao.model.public.Interaccionescomponentes;
import co.edu.usc.vision.interacciones.api.dao.model.public.InteraccionescomponentesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InteraccionescomponentesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.interaccionescomponentes
     *
     * @mbggenerated
     */
    int countByExample(InteraccionescomponentesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.interaccionescomponentes
     *
     * @mbggenerated
     */
    int deleteByExample(InteraccionescomponentesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.interaccionescomponentes
     *
     * @mbggenerated
     */
    int insert(Interaccionescomponentes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.interaccionescomponentes
     *
     * @mbggenerated
     */
    int insertSelective(Interaccionescomponentes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.interaccionescomponentes
     *
     * @mbggenerated
     */
    List<Interaccionescomponentes> selectByExample(InteraccionescomponentesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.interaccionescomponentes
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Interaccionescomponentes record, @Param("example") InteraccionescomponentesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.interaccionescomponentes
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Interaccionescomponentes record, @Param("example") InteraccionescomponentesExample example);
}