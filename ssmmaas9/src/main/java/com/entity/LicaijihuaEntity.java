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
 * 理财计划
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-25 13:44:29
 */
@TableName("licaijihua")
public class LicaijihuaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LicaijihuaEntity() {
		
	}
	
	public LicaijihuaEntity(T t) {
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
	 * 理财规划
	 */
					
	private String licaiguihua;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 收入项目
	 */
					
	private String shouruxiangmu;
	
	/**
	 * 支出项目
	 */
					
	private String zhichuxiangmu;
	
	/**
	 * 收入金额
	 */
					
	private Integer shourujine;
	
	/**
	 * 支出金额
	 */
					
	private Integer zhichujine;
	
	/**
	 * 余额
	 */
					
	private Integer yue;
	
	/**
	 * 余额状态
	 */
					
	private String yuezhuangtai;
	
	/**
	 * 照片
	 */
					
	private String zhaopian;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	
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
	 * 设置：理财规划
	 */
	public void setLicaiguihua(String licaiguihua) {
		this.licaiguihua = licaiguihua;
	}
	/**
	 * 获取：理财规划
	 */
	public String getLicaiguihua() {
		return licaiguihua;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
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
	 * 设置：收入项目
	 */
	public void setShouruxiangmu(String shouruxiangmu) {
		this.shouruxiangmu = shouruxiangmu;
	}
	/**
	 * 获取：收入项目
	 */
	public String getShouruxiangmu() {
		return shouruxiangmu;
	}
	/**
	 * 设置：支出项目
	 */
	public void setZhichuxiangmu(String zhichuxiangmu) {
		this.zhichuxiangmu = zhichuxiangmu;
	}
	/**
	 * 获取：支出项目
	 */
	public String getZhichuxiangmu() {
		return zhichuxiangmu;
	}
	/**
	 * 设置：收入金额
	 */
	public void setShourujine(Integer shourujine) {
		this.shourujine = shourujine;
	}
	/**
	 * 获取：收入金额
	 */
	public Integer getShourujine() {
		return shourujine;
	}
	/**
	 * 设置：支出金额
	 */
	public void setZhichujine(Integer zhichujine) {
		this.zhichujine = zhichujine;
	}
	/**
	 * 获取：支出金额
	 */
	public Integer getZhichujine() {
		return zhichujine;
	}
	/**
	 * 设置：余额
	 */
	public void setYue(Integer yue) {
		this.yue = yue;
	}
	/**
	 * 获取：余额
	 */
	public Integer getYue() {
		return yue;
	}
	/**
	 * 设置：余额状态
	 */
	public void setYuezhuangtai(String yuezhuangtai) {
		this.yuezhuangtai = yuezhuangtai;
	}
	/**
	 * 获取：余额状态
	 */
	public String getYuezhuangtai() {
		return yuezhuangtai;
	}
	/**
	 * 设置：照片
	 */
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}

}
