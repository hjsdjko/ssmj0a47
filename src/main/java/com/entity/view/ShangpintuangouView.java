package com.entity.view;

import com.entity.ShangpintuangouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 商品团购
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-15 11:22:43
 */
@TableName("shangpintuangou")
public class ShangpintuangouView  extends ShangpintuangouEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShangpintuangouView(){
	}
 
 	public ShangpintuangouView(ShangpintuangouEntity shangpintuangouEntity){
 	try {
			BeanUtils.copyProperties(this, shangpintuangouEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
