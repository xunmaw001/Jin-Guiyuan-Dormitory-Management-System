package com.entity.view;

import com.entity.LouyuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 楼宇信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-22 18:50:21
 */
@TableName("louyuxinxi")
public class LouyuxinxiView  extends LouyuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LouyuxinxiView(){
	}
 
 	public LouyuxinxiView(LouyuxinxiEntity louyuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, louyuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
