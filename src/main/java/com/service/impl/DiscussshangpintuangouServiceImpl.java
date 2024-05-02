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


import com.dao.DiscussshangpintuangouDao;
import com.entity.DiscussshangpintuangouEntity;
import com.service.DiscussshangpintuangouService;
import com.entity.vo.DiscussshangpintuangouVO;
import com.entity.view.DiscussshangpintuangouView;

@Service("discussshangpintuangouService")
public class DiscussshangpintuangouServiceImpl extends ServiceImpl<DiscussshangpintuangouDao, DiscussshangpintuangouEntity> implements DiscussshangpintuangouService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshangpintuangouEntity> page = this.selectPage(
                new Query<DiscussshangpintuangouEntity>(params).getPage(),
                new EntityWrapper<DiscussshangpintuangouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshangpintuangouEntity> wrapper) {
		  Page<DiscussshangpintuangouView> page =new Query<DiscussshangpintuangouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshangpintuangouVO> selectListVO(Wrapper<DiscussshangpintuangouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshangpintuangouVO selectVO(Wrapper<DiscussshangpintuangouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshangpintuangouView> selectListView(Wrapper<DiscussshangpintuangouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshangpintuangouView selectView(Wrapper<DiscussshangpintuangouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
