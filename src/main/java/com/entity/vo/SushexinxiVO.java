package com.entity.vo;

import com.entity.SushexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 宿舍信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-03-22 18:50:22
 */
public class SushexinxiVO  implements Serializable {
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
	 * 最大入住人数
	 */
	
	private Integer zuidaruzhurenshu;
		
	/**
	 * 已住人数
	 */
	
	private Integer yizhurenshu;
		
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
	 * 设置：最大入住人数
	 */
	 
	public void setZuidaruzhurenshu(Integer zuidaruzhurenshu) {
		this.zuidaruzhurenshu = zuidaruzhurenshu;
	}
	
	/**
	 * 获取：最大入住人数
	 */
	public Integer getZuidaruzhurenshu() {
		return zuidaruzhurenshu;
	}
				
	
	/**
	 * 设置：已住人数
	 */
	 
	public void setYizhurenshu(Integer yizhurenshu) {
		this.yizhurenshu = yizhurenshu;
	}
	
	/**
	 * 获取：已住人数
	 */
	public Integer getYizhurenshu() {
		return yizhurenshu;
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
