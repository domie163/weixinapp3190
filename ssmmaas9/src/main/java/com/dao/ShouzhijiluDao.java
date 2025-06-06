package com.dao;

import com.entity.ShouzhijiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShouzhijiluVO;
import com.entity.view.ShouzhijiluView;


/**
 * 收支记录
 * 
 * @author 
 * @email 
 * @date 2021-04-25 13:44:29
 */
public interface ShouzhijiluDao extends BaseMapper<ShouzhijiluEntity> {
	
	List<ShouzhijiluVO> selectListVO(@Param("ew") Wrapper<ShouzhijiluEntity> wrapper);
	
	ShouzhijiluVO selectVO(@Param("ew") Wrapper<ShouzhijiluEntity> wrapper);
	
	List<ShouzhijiluView> selectListView(@Param("ew") Wrapper<ShouzhijiluEntity> wrapper);

	List<ShouzhijiluView> selectListView(Pagination page,@Param("ew") Wrapper<ShouzhijiluEntity> wrapper);
	
	ShouzhijiluView selectView(@Param("ew") Wrapper<ShouzhijiluEntity> wrapper);
	
}
