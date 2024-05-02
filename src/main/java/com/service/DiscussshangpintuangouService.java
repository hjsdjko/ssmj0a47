package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshangpintuangouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshangpintuangouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshangpintuangouView;


/**
 * 商品团购评论表
 *
 * @author 
 * @email 
 * @date 2021-05-15 11:22:43
 */
public interface DiscussshangpintuangouService extends IService<DiscussshangpintuangouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshangpintuangouVO> selectListVO(Wrapper<DiscussshangpintuangouEntity> wrapper);
   	
   	DiscussshangpintuangouVO selectVO(@Param("ew") Wrapper<DiscussshangpintuangouEntity> wrapper);
   	
   	List<DiscussshangpintuangouView> selectListView(Wrapper<DiscussshangpintuangouEntity> wrapper);
   	
   	DiscussshangpintuangouView selectView(@Param("ew") Wrapper<DiscussshangpintuangouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshangpintuangouEntity> wrapper);
   	
}

