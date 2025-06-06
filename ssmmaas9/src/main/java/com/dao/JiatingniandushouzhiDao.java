package com.dao;

import com.entity.JiatingniandushouzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiatingniandushouzhiVO;
import com.entity.view.JiatingniandushouzhiView;


/**
 * 家庭年度收支
 * 
 * @author 
 * @email 
 * @date 2021-04-25 13:44:29
 */
public interface JiatingniandushouzhiDao extends BaseMapper<JiatingniandushouzhiEntity> {
	
	List<JiatingniandushouzhiVO> selectListVO(@Param("ew") Wrapper<JiatingniandushouzhiEntity> wrapper);
	
	JiatingniandushouzhiVO selectVO(@Param("ew") Wrapper<JiatingniandushouzhiEntity> wrapper);
	
	List<JiatingniandushouzhiView> selectListView(@Param("ew") Wrapper<JiatingniandushouzhiEntity> wrapper);

	List<JiatingniandushouzhiView> selectListView(Pagination page,@Param("ew") Wrapper<JiatingniandushouzhiEntity> wrapper);
	
	JiatingniandushouzhiView selectView(@Param("ew") Wrapper<JiatingniandushouzhiEntity> wrapper);
	
}
