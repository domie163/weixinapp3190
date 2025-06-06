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


import com.dao.CaiwumingxiDao;
import com.entity.CaiwumingxiEntity;
import com.service.CaiwumingxiService;
import com.entity.vo.CaiwumingxiVO;
import com.entity.view.CaiwumingxiView;

@Service("caiwumingxiService")
public class CaiwumingxiServiceImpl extends ServiceImpl<CaiwumingxiDao, CaiwumingxiEntity> implements CaiwumingxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CaiwumingxiEntity> page = this.selectPage(
                new Query<CaiwumingxiEntity>(params).getPage(),
                new EntityWrapper<CaiwumingxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CaiwumingxiEntity> wrapper) {
		  Page<CaiwumingxiView> page =new Query<CaiwumingxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CaiwumingxiVO> selectListVO(Wrapper<CaiwumingxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CaiwumingxiVO selectVO(Wrapper<CaiwumingxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CaiwumingxiView> selectListView(Wrapper<CaiwumingxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CaiwumingxiView selectView(Wrapper<CaiwumingxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
