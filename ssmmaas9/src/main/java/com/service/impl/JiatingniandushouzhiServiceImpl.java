package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiatingniandushouzhiDao;
import com.entity.JiatingniandushouzhiEntity;
import com.service.JiatingniandushouzhiService;
import com.entity.vo.JiatingniandushouzhiVO;
import com.entity.view.JiatingniandushouzhiView;

@Service("jiatingniandushouzhiService")
public class JiatingniandushouzhiServiceImpl extends ServiceImpl<JiatingniandushouzhiDao, JiatingniandushouzhiEntity> implements JiatingniandushouzhiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiatingniandushouzhiEntity> page = this.selectPage(
                new Query<JiatingniandushouzhiEntity>(params).getPage(),
                new EntityWrapper<JiatingniandushouzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiatingniandushouzhiEntity> wrapper) {
		  Page<JiatingniandushouzhiView> page =new Query<JiatingniandushouzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiatingniandushouzhiVO> selectListVO(Wrapper<JiatingniandushouzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiatingniandushouzhiVO selectVO(Wrapper<JiatingniandushouzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiatingniandushouzhiView> selectListView(Wrapper<JiatingniandushouzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiatingniandushouzhiView selectView(Wrapper<JiatingniandushouzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
