package com.entity.model;

import com.entity.TuisuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 退宿信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-03-22 18:50:22
 */
public class TuisuxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 所属楼宇
	 */
	
	private String suoshulouyu;
		
	/**
	 * 楼层
	 */
	
	private String louceng;
		
	/**
	 * 退宿时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tuisushijian;
		
	/**
	 * 退宿原因
	 */
	
	private String tuisuyuanyin;
		
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
	 * 设置：所属楼宇
	 */
	 
	public void setSuoshulouyu(String suoshulouyu) {
		this.suoshulouyu = suoshulouyu;
	}
	
	/**
	 * 获取：所属楼宇
	 */
	public String getSuoshulouyu() {
		return suoshulouyu;
	}
				
	
	/**
	 * 设置：楼层
	 */
	 
	public void setLouceng(String louceng) {
		this.louceng = louceng;
	}
	
	/**
	 * 获取：楼层
	 */
	public String getLouceng() {
		return louceng;
	}
				
	
	/**
	 * 设置：退宿时间
	 */
	 
	public void setTuisushijian(Date tuisushijian) {
		this.tuisushijian = tuisushijian;
	}
	
	/**
	 * 获取：退宿时间
	 */
	public Date getTuisushijian() {
		return tuisushijian;
	}
				
	
	/**
	 * 设置：退宿原因
	 */
	 
	public void setTuisuyuanyin(String tuisuyuanyin) {
		this.tuisuyuanyin = tuisuyuanyin;
	}
	
	/**
	 * 获取：退宿原因
	 */
	public String getTuisuyuanyin() {
		return tuisuyuanyin;
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
