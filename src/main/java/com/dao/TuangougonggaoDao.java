package com.dao;

import com.entity.TuangougonggaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TuangougonggaoVO;
import com.entity.view.TuangougonggaoView;


/**
 * 团购公告
 * 
 * @author 
 * @email 
 * @date 2021-05-15 11:22:43
 */
public interface TuangougonggaoDao extends BaseMapper<TuangougonggaoEntity> {
	
	List<TuangougonggaoVO> selectListVO(@Param("ew") Wrapper<TuangougonggaoEntity> wrapper);
	
	TuangougonggaoVO selectVO(@Param("ew") Wrapper<TuangougonggaoEntity> wrapper);
	
	List<TuangougonggaoView> selectListView(@Param("ew") Wrapper<TuangougonggaoEntity> wrapper);

	List<TuangougonggaoView> selectListView(Pagination page,@Param("ew") Wrapper<TuangougonggaoEntity> wrapper);
	
	TuangougonggaoView selectView(@Param("ew") Wrapper<TuangougonggaoEntity> wrapper);
	
}
