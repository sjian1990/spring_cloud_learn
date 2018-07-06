package com.learn.jpa.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="fin_platform")
public class FinPlatform implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 主键ID **/
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	/** 资金平台名称 **/
	@Column(name = "plat_name")
	private String platName;
	
	/** 资金平台代码 **/
	@Column(name = "plat_code")
	private String platCode;
	
	/** 资金平台所属机构代码 **/
	@Column(name = "ins_code")
	private String insCode;
	
	/** 资金平台描述 **/
	@Column(name = "plat_desc")
	private String platDesc;
	
	/** 资金平台类型 **/
	@Column(name = "plat_type")
	private String platType;
	
	/** 资金平台优先级 **/
	@Column(name = "plat_priority")
	private String platPriority;
	
	/** 状态 **/
	@Column(name = "status")
	private String status;
	
	/** 联系人 **/
	@Column(name = "contacts_person")
	private String contactsPerson;
	
	/** 联系电话 **/
	@Column(name = "contacts_phone")
	private String contactsPhone;
	
	/** 联系邮箱 **/
	@Column(name = "contacts_email")
	private String contactsEmail;
	
	/** 创建时间 **/
	@Column(name = "create_time")
	private Date createTime;
	
	/** 创建人 **/
	@Column(name = "create_user")
	private String createUser;
	
	/** 最近修改时间 **/
	@Column(name = "update_time")
	private Date updateTime;
	
	/** 最近修改人 **/
	@Column(name = "update_user")
	private String updateUser;
	
}
