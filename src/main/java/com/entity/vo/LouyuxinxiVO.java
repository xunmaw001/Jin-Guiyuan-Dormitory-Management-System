package com.entity.vo;

import com.entity.LouyuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 楼宇信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-03-22 18:50:21
 */
public class LouyuxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 楼宇位置
	 */
	
	private String louyuweizhi;
				
	
	/**
	 * 设置：楼宇位置
	 */
	 
	public void setLouyuweizhi(String louyuweizhi) {
		this.louyuweizhi = louyuweizhi;
	}
	
	/**
	 * 获取：楼宇位置
	 */
	public String getLouyuweizhi() {
		return louyuweizhi;
	}
			
}
