package com.dao;

import com.entity.ShangpintuangouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangpintuangouVO;
import com.entity.view.ShangpintuangouView;


/**
 * 商品团购
 * 
 * @author 
 * @email 
 * @date 2021-05-15 11:22:43
 */
public interface ShangpintuangouDao extends BaseMapper<ShangpintuangouEntity> {
	
	List<ShangpintuangouVO> selectListVO(@Param("ew") Wrapper<ShangpintuangouEntity> wrapper);
	
	ShangpintuangouVO selectVO(@Param("ew") Wrapper<ShangpintuangouEntity> wrapper);
	
	List<ShangpintuangouView> selectListView(@Param("ew") Wrapper<ShangpintuangouEntity> wrapper);

	List<ShangpintuangouView> selectListView(Pagination page,@Param("ew") Wrapper<ShangpintuangouEntity> wrapper);
	
	ShangpintuangouView selectView(@Param("ew") Wrapper<ShangpintuangouEntity> wrapper);
	
}
