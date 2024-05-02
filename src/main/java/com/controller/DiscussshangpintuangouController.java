package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscussshangpintuangouEntity;
import com.entity.view.DiscussshangpintuangouView;

import com.service.DiscussshangpintuangouService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 商品团购评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2021-05-15 11:22:43
 */
@RestController
@RequestMapping("/discussshangpintuangou")
public class DiscussshangpintuangouController {
    @Autowired
    private DiscussshangpintuangouService discussshangpintuangouService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscussshangpintuangouEntity discussshangpintuangou, 
		HttpServletRequest request){

        EntityWrapper<DiscussshangpintuangouEntity> ew = new EntityWrapper<DiscussshangpintuangouEntity>();
		PageUtils page = discussshangpintuangouService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussshangpintuangou), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscussshangpintuangouEntity discussshangpintuangou, 
		HttpServletRequest request){
        EntityWrapper<DiscussshangpintuangouEntity> ew = new EntityWrapper<DiscussshangpintuangouEntity>();
		PageUtils page = discussshangpintuangouService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussshangpintuangou), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscussshangpintuangouEntity discussshangpintuangou){
       	EntityWrapper<DiscussshangpintuangouEntity> ew = new EntityWrapper<DiscussshangpintuangouEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discussshangpintuangou, "discussshangpintuangou")); 
        return R.ok().put("data", discussshangpintuangouService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscussshangpintuangouEntity discussshangpintuangou){
        EntityWrapper< DiscussshangpintuangouEntity> ew = new EntityWrapper< DiscussshangpintuangouEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discussshangpintuangou, "discussshangpintuangou")); 
		DiscussshangpintuangouView discussshangpintuangouView =  discussshangpintuangouService.selectView(ew);
		return R.ok("查询商品团购评论表成功").put("data", discussshangpintuangouView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscussshangpintuangouEntity discussshangpintuangou = discussshangpintuangouService.selectById(id);
        return R.ok().put("data", discussshangpintuangou);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscussshangpintuangouEntity discussshangpintuangou = discussshangpintuangouService.selectById(id);
        return R.ok().put("data", discussshangpintuangou);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscussshangpintuangouEntity discussshangpintuangou, HttpServletRequest request){
    	discussshangpintuangou.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussshangpintuangou);

        discussshangpintuangouService.insert(discussshangpintuangou);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscussshangpintuangouEntity discussshangpintuangou, HttpServletRequest request){
    	discussshangpintuangou.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussshangpintuangou);

        discussshangpintuangouService.insert(discussshangpintuangou);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DiscussshangpintuangouEntity discussshangpintuangou, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discussshangpintuangou);
        discussshangpintuangouService.updateById(discussshangpintuangou);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discussshangpintuangouService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DiscussshangpintuangouEntity> wrapper = new EntityWrapper<DiscussshangpintuangouEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discussshangpintuangouService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
