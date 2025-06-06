package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShouzhijiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShouzhijiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShouzhijiluView;


/**
 * 收支记录
 *
 * @author 
 * @email 
 * @date 2021-04-25 13:44:29
 */
public interface ShouzhijiluService extends IService<ShouzhijiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShouzhijiluVO> selectListVO(Wrapper<ShouzhijiluEntity> wrapper);
   	
   	ShouzhijiluVO selectVO(@Param("ew") Wrapper<ShouzhijiluEntity> wrapper);
   	
   	List<ShouzhijiluView> selectListView(Wrapper<ShouzhijiluEntity> wrapper);
   	
   	ShouzhijiluView selectView(@Param("ew") Wrapper<ShouzhijiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShouzhijiluEntity> wrapper);
   	
}

