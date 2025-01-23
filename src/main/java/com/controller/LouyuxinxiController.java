package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.LouyuxinxiEntity;
import com.entity.view.LouyuxinxiView;

import com.service.LouyuxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 楼宇信息
 * 后端接口
 * @author 
 * @email 
 * @date 2023-03-22 18:50:21
 */
@RestController
@RequestMapping("/louyuxinxi")
public class LouyuxinxiController {
    @Autowired
    private LouyuxinxiService louyuxinxiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,LouyuxinxiEntity louyuxinxi, 
		HttpServletRequest request){

        EntityWrapper<LouyuxinxiEntity> ew = new EntityWrapper<LouyuxinxiEntity>();


		PageUtils page = louyuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, louyuxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,LouyuxinxiEntity louyuxinxi, 
		HttpServletRequest request){
        EntityWrapper<LouyuxinxiEntity> ew = new EntityWrapper<LouyuxinxiEntity>();

		PageUtils page = louyuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, louyuxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( LouyuxinxiEntity louyuxinxi){
       	EntityWrapper<LouyuxinxiEntity> ew = new EntityWrapper<LouyuxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( louyuxinxi, "louyuxinxi")); 
        return R.ok().put("data", louyuxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(LouyuxinxiEntity louyuxinxi){
        EntityWrapper< LouyuxinxiEntity> ew = new EntityWrapper< LouyuxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( louyuxinxi, "louyuxinxi")); 
		LouyuxinxiView louyuxinxiView =  louyuxinxiService.selectView(ew);
		return R.ok("查询楼宇信息成功").put("data", louyuxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        LouyuxinxiEntity louyuxinxi = louyuxinxiService.selectById(id);
        return R.ok().put("data", louyuxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        LouyuxinxiEntity louyuxinxi = louyuxinxiService.selectById(id);
        return R.ok().put("data", louyuxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody LouyuxinxiEntity louyuxinxi, HttpServletRequest request){
    	louyuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(louyuxinxi);

        louyuxinxiService.insert(louyuxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody LouyuxinxiEntity louyuxinxi, HttpServletRequest request){
    	louyuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(louyuxinxi);

        louyuxinxiService.insert(louyuxinxi);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody LouyuxinxiEntity louyuxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(louyuxinxi);
        louyuxinxiService.updateById(louyuxinxi);//全部更新
        return R.ok();
    }
    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        louyuxinxiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<LouyuxinxiEntity> wrapper = new EntityWrapper<LouyuxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = louyuxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}
