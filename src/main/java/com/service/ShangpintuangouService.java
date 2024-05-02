package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShangpintuangouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShangpintuangouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangpintuangouView;


/**
 * 商品团购
 *
 * @author 
 * @email 
 * @date 2021-05-15 11:22:43
 */
public interface ShangpintuangouService extends IService<ShangpintuangouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangpintuangouVO> selectListVO(Wrapper<ShangpintuangouEntity> wrapper);
   	
   	ShangpintuangouVO selectVO(@Param("ew") Wrapper<ShangpintuangouEntity> wrapper);
   	
   	List<ShangpintuangouView> selectListView(Wrapper<ShangpintuangouEntity> wrapper);
   	
   	ShangpintuangouView selectView(@Param("ew") Wrapper<ShangpintuangouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangpintuangouEntity> wrapper);
   	
}

