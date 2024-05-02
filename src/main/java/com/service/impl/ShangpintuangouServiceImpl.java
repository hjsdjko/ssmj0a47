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


import com.dao.ShangpintuangouDao;
import com.entity.ShangpintuangouEntity;
import com.service.ShangpintuangouService;
import com.entity.vo.ShangpintuangouVO;
import com.entity.view.ShangpintuangouView;

@Service("shangpintuangouService")
public class ShangpintuangouServiceImpl extends ServiceImpl<ShangpintuangouDao, ShangpintuangouEntity> implements ShangpintuangouService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangpintuangouEntity> page = this.selectPage(
                new Query<ShangpintuangouEntity>(params).getPage(),
                new EntityWrapper<ShangpintuangouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangpintuangouEntity> wrapper) {
		  Page<ShangpintuangouView> page =new Query<ShangpintuangouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShangpintuangouVO> selectListVO(Wrapper<ShangpintuangouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShangpintuangouVO selectVO(Wrapper<ShangpintuangouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShangpintuangouView> selectListView(Wrapper<ShangpintuangouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangpintuangouView selectView(Wrapper<ShangpintuangouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
