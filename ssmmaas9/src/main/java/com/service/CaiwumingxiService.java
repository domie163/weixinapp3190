package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CaiwumingxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CaiwumingxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CaiwumingxiView;


/**
 * 财务明细
 *
 * @author 
 * @email 
 * @date 2021-04-25 13:44:29
 */
public interface CaiwumingxiService extends IService<CaiwumingxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CaiwumingxiVO> selectListVO(Wrapper<CaiwumingxiEntity> wrapper);
   	
   	CaiwumingxiVO selectVO(@Param("ew") Wrapper<CaiwumingxiEntity> wrapper);
   	
   	List<CaiwumingxiView> selectListView(Wrapper<CaiwumingxiEntity> wrapper);
   	
   	CaiwumingxiView selectView(@Param("ew") Wrapper<CaiwumingxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CaiwumingxiEntity> wrapper);
   	
}

