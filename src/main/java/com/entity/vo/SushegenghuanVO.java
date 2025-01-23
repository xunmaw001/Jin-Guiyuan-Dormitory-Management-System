package com.entity.vo;

import com.entity.SushegenghuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 宿舍更换
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-03-22 18:50:22
 */
public class SushegenghuanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 更换后宿舍
	 */
	
	private String genghuanhousushe;
		
	/**
	 * 更换时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date genghuanshijian;
		
	/**
	 * 更换原因
	 */
	
	private String genghuanyuanyin;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 宿管账号
	 */
	
	private String suguanzhanghao;
		
	/**
	 * 宿管姓名
	 */
	
	private String suguanxingming;
				
	
	/**
	 * 设置：更换后宿舍
	 */
	 
	public void setGenghuanhousushe(String genghuanhousushe) {
		this.genghuanhousushe = genghuanhousushe;
	}
	
	/**
	 * 获取：更换后宿舍
	 */
	public String getGenghuanhousushe() {
		return genghuanhousushe;
	}
				
	
	/**
	 * 设置：更换时间
	 */
	 
	public void setGenghuanshijian(Date genghuanshijian) {
		this.genghuanshijian = genghuanshijian;
	}
	
	/**
	 * 获取：更换时间
	 */
	public Date getGenghuanshijian() {
		return genghuanshijian;
	}
				
	
	/**
	 * 设置：更换原因
	 */
	 
	public void setGenghuanyuanyin(String genghuanyuanyin) {
		this.genghuanyuanyin = genghuanyuanyin;
	}
	
	/**
	 * 获取：更换原因
	 */
	public String getGenghuanyuanyin() {
		return genghuanyuanyin;
	}
				
	
	/**
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：宿管账号
	 */
	 
	public void setSuguanzhanghao(String suguanzhanghao) {
		this.suguanzhanghao = suguanzhanghao;
	}
	
	/**
	 * 获取：宿管账号
	 */
	public String getSuguanzhanghao() {
		return suguanzhanghao;
	}
				
	
	/**
	 * 设置：宿管姓名
	 */
	 
	public void setSuguanxingming(String suguanxingming) {
		this.suguanxingming = suguanxingming;
	}
	
	/**
	 * 获取：宿管姓名
	 */
	public String getSuguanxingming() {
		return suguanxingming;
	}
			
}
