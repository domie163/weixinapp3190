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
 * 财务明细
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-25 13:44:29
 */
@TableName("caiwumingxi")
public class CaiwumingxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CaiwumingxiEntity() {
		
	}
	
	public CaiwumingxiEntity(T t) {
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
	 * 账单
	 */
					
	private String zhangdan;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 商户名称
	 */
					
	private String shanghumingcheng;
	
	/**
	 * 收支状态
	 */
					
	private String shouzhizhuangtai;
	
	/**
	 * 交易金额
	 */
					
	private Integer jiaoyijine;
	
	/**
	 * 时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date shijian;
	
	/**
	 * 交易单号
	 */
					
	private String jiaoyidanhao;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
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
	 * 设置：账单
	 */
	public void setZhangdan(String zhangdan) {
		this.zhangdan = zhangdan;
	}
	/**
	 * 获取：账单
	 */
	public String getZhangdan() {
		return zhangdan;
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
	 * 设置：商户名称
	 */
	public void setShanghumingcheng(String shanghumingcheng) {
		this.shanghumingcheng = shanghumingcheng;
	}
	/**
	 * 获取：商户名称
	 */
	public String getShanghumingcheng() {
		return shanghumingcheng;
	}
	/**
	 * 设置：收支状态
	 */
	public void setShouzhizhuangtai(String shouzhizhuangtai) {
		this.shouzhizhuangtai = shouzhizhuangtai;
	}
	/**
	 * 获取：收支状态
	 */
	public String getShouzhizhuangtai() {
		return shouzhizhuangtai;
	}
	/**
	 * 设置：交易金额
	 */
	public void setJiaoyijine(Integer jiaoyijine) {
		this.jiaoyijine = jiaoyijine;
	}
	/**
	 * 获取：交易金额
	 */
	public Integer getJiaoyijine() {
		return jiaoyijine;
	}
	/**
	 * 设置：时间
	 */
	public void setShijian(Date shijian) {
		this.shijian = shijian;
	}
	/**
	 * 获取：时间
	 */
	public Date getShijian() {
		return shijian;
	}
	/**
	 * 设置：交易单号
	 */
	public void setJiaoyidanhao(String jiaoyidanhao) {
		this.jiaoyidanhao = jiaoyidanhao;
	}
	/**
	 * 获取：交易单号
	 */
	public String getJiaoyidanhao() {
		return jiaoyidanhao;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
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
