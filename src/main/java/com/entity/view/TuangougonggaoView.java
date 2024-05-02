package com.entity.view;

import com.entity.TuangougonggaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 团购公告
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-15 11:22:43
 */
@TableName("tuangougonggao")
public class TuangougonggaoView  extends TuangougonggaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TuangougonggaoView(){
	}
 
 	public TuangougonggaoView(TuangougonggaoEntity tuangougonggaoEntity){
 	try {
			BeanUtils.copyProperties(this, tuangougonggaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
