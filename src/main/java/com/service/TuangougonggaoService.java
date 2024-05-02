package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TuangougonggaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TuangougonggaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TuangougonggaoView;


/**
 * 团购公告
 *
 * @author 
 * @email 
 * @date 2021-05-15 11:22:43
 */
public interface TuangougonggaoService extends IService<TuangougonggaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TuangougonggaoVO> selectListVO(Wrapper<TuangougonggaoEntity> wrapper);
   	
   	TuangougonggaoVO selectVO(@Param("ew") Wrapper<TuangougonggaoEntity> wrapper);
   	
   	List<TuangougonggaoView> selectListView(Wrapper<TuangougonggaoEntity> wrapper);
   	
   	TuangougonggaoView selectView(@Param("ew") Wrapper<TuangougonggaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TuangougonggaoEntity> wrapper);
   	
}

