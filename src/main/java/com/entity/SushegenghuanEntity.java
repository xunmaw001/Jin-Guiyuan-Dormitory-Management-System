package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 宿舍更换
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-22 18:50:22
 */
@TableName("sushegenghuan")
public class SushegenghuanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public SushegenghuanEntity() {
		
	}
	
	public SushegenghuanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 宿舍号
	 */
					
	private String sushehao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：宿舍号
	 */
	public void setSushehao(String sushehao) {
		this.sushehao = sushehao;
	}
	/**
	 * 获取：宿舍号
	 */
	public String getSushehao() {
		return sushehao;
	}
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
