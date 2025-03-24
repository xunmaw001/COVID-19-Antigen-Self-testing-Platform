package com.dao;

import com.entity.FanghuzhishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.FanghuzhishiView;

/**
 * 防护知识 Dao 接口
 *
 * @author 
 */
public interface FanghuzhishiDao extends BaseMapper<FanghuzhishiEntity> {

   List<FanghuzhishiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
