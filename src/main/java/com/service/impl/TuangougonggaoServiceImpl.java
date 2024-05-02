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


import com.dao.TuangougonggaoDao;
import com.entity.TuangougonggaoEntity;
import com.service.TuangougonggaoService;
import com.entity.vo.TuangougonggaoVO;
import com.entity.view.TuangougonggaoView;

@Service("tuangougonggaoService")
public class TuangougonggaoServiceImpl extends ServiceImpl<TuangougonggaoDao, TuangougonggaoEntity> implements TuangougonggaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TuangougonggaoEntity> page = this.selectPage(
                new Query<TuangougonggaoEntity>(params).getPage(),
                new EntityWrapper<TuangougonggaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TuangougonggaoEntity> wrapper) {
		  Page<TuangougonggaoView> page =new Query<TuangougonggaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TuangougonggaoVO> selectListVO(Wrapper<TuangougonggaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TuangougonggaoVO selectVO(Wrapper<TuangougonggaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TuangougonggaoView> selectListView(Wrapper<TuangougonggaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TuangougonggaoView selectView(Wrapper<TuangougonggaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
