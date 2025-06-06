package com.entity.view;

import com.entity.ShouzhijiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 收支记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-25 13:44:29
 */
@TableName("shouzhijilu")
public class ShouzhijiluView  extends ShouzhijiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShouzhijiluView(){
	}
 
 	public ShouzhijiluView(ShouzhijiluEntity shouzhijiluEntity){
 	try {
			BeanUtils.copyProperties(this, shouzhijiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
