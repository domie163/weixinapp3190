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


import com.dao.ShouzhijiluDao;
import com.entity.ShouzhijiluEntity;
import com.service.ShouzhijiluService;
import com.entity.vo.ShouzhijiluVO;
import com.entity.view.ShouzhijiluView;

@Service("shouzhijiluService")
public class ShouzhijiluServiceImpl extends ServiceImpl<ShouzhijiluDao, ShouzhijiluEntity> implements ShouzhijiluService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShouzhijiluEntity> page = this.selectPage(
                new Query<ShouzhijiluEntity>(params).getPage(),
                new EntityWrapper<ShouzhijiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShouzhijiluEntity> wrapper) {
		  Page<ShouzhijiluView> page =new Query<ShouzhijiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShouzhijiluVO> selectListVO(Wrapper<ShouzhijiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShouzhijiluVO selectVO(Wrapper<ShouzhijiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShouzhijiluView> selectListView(Wrapper<ShouzhijiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShouzhijiluView selectView(Wrapper<ShouzhijiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
