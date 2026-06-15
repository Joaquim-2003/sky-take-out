package com.sky.mapper;

import org.apache.ibatis.annotations.Select;

public interface SetmealMapper {
    /**
     * 根据id查询套餐数量
     * @param id
     * @return
     */
    @Select("select count(id) from setmeal where category_id = #{categoryId}")
    Integer countByCategoryId(Long id);
}
