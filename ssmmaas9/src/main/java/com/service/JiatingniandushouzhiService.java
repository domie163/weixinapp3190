package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiatingniandushouzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiatingniandushouzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiatingniandushouzhiView;


/**
 * 家庭年度收支
 *
 * @author 
 * @email 
 * @date 2021-04-25 13:44:29
 */
public interface JiatingniandushouzhiService extends IService<JiatingniandushouzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiatingniandushouzhiVO> selectListVO(Wrapper<JiatingniandushouzhiEntity> wrapper);
   	
   	JiatingniandushouzhiVO selectVO(@Param("ew") Wrapper<JiatingniandushouzhiEntity> wrapper);
   	
   	List<JiatingniandushouzhiView> selectListView(Wrapper<JiatingniandushouzhiEntity> wrapper);
   	
   	JiatingniandushouzhiView selectView(@Param("ew") Wrapper<JiatingniandushouzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiatingniandushouzhiEntity> wrapper);
   	
}

