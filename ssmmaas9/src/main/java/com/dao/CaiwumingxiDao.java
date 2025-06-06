package com.dao;

import com.entity.CaiwumingxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CaiwumingxiVO;
import com.entity.view.CaiwumingxiView;


/**
 * 财务明细
 * 
 * @author 
 * @email 
 * @date 2021-04-25 13:44:29
 */
public interface CaiwumingxiDao extends BaseMapper<CaiwumingxiEntity> {
	
	List<CaiwumingxiVO> selectListVO(@Param("ew") Wrapper<CaiwumingxiEntity> wrapper);
	
	CaiwumingxiVO selectVO(@Param("ew") Wrapper<CaiwumingxiEntity> wrapper);
	
	List<CaiwumingxiView> selectListView(@Param("ew") Wrapper<CaiwumingxiEntity> wrapper);

	List<CaiwumingxiView> selectListView(Pagination page,@Param("ew") Wrapper<CaiwumingxiEntity> wrapper);
	
	CaiwumingxiView selectView(@Param("ew") Wrapper<CaiwumingxiEntity> wrapper);
	
}
