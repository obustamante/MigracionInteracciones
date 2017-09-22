package co.edu.usc.vision.interacciones.api.dao.model.public;

import co.edu.usc.vision.interacciones.api.dao.model.public.Targets;
import co.edu.usc.vision.interacciones.api.dao.model.public.TargetsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TargetsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.targets
     *
     * @mbggenerated
     */
    int countByExample(TargetsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.targets
     *
     * @mbggenerated
     */
    int deleteByExample(TargetsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.targets
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer idtarget);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.targets
     *
     * @mbggenerated
     */
    int insert(Targets record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.targets
     *
     * @mbggenerated
     */
    int insertSelective(Targets record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.targets
     *
     * @mbggenerated
     */
    List<Targets> selectByExample(TargetsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.targets
     *
     * @mbggenerated
     */
    Targets selectByPrimaryKey(Integer idtarget);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.targets
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Targets record, @Param("example") TargetsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.targets
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Targets record, @Param("example") TargetsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.targets
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Targets record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.targets
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Targets record);
}