package com.entity.vo;

import com.entity.LicaijihuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 理财计划
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-25 13:44:29
 */
public class LicaijihuaVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
