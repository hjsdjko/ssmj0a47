package com.dao;

import com.entity.DiscussshangpintuangouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshangpintuangouVO;
import com.entity.view.DiscussshangpintuangouView;


/**
 * 商品团购评论表
 * 
 * @author 
 * @email 
 * @date 2021-05-15 11:22:43
 */
public interface DiscussshangpintuangouDao extends BaseMapper<DiscussshangpintuangouEntity> {
	
	List<DiscussshangpintuangouVO> selectListVO(@Param("ew") Wrapper<DiscussshangpintuangouEntity> wrapper);
	
	DiscussshangpintuangouVO selectVO(@Param("ew") Wrapper<DiscussshangpintuangouEntity> wrapper);
	
	List<DiscussshangpintuangouView> selectListView(@Param("ew") Wrapper<DiscussshangpintuangouEntity> wrapper);

	List<DiscussshangpintuangouView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshangpintuangouEntity> wrapper);
	
	DiscussshangpintuangouView selectView(@Param("ew") Wrapper<DiscussshangpintuangouEntity> wrapper);
	
}
