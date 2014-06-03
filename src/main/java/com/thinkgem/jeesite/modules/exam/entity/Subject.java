package com.thinkgem.jeesite.modules.exam.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;
import com.thinkgem.jeesite.common.utils.excel.annotation.ExcelField;


/**
 * ##########################################################################################   
 * 项目名称：MyExam   
 * 类名称： Subject   
 * 类描述： 科目 Entity   
 * 创建人： 李桥文 525219246@qq.com   
 * 创建时间：Feb 4, 2014 6:24:14 PM  
 * ------------------------------------------------------ 
 * 修改人：   
 * 修改时间：Feb 4, 2014 6:24:14 PM   
 * 修改备注：   
 * @version    
 * ##########################################################################################
 */
@Entity
@Table(name = "exam_subject")
@DynamicInsert @DynamicUpdate
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Subject extends DataEntity{
	
	private static final long serialVersionUID = 1L;
	private Long id;		  // 编号
	private String name;      // 名称
	private Subject parent;   // 父级科目
	private String parentIds; // 所有父级编号

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_exam_subject")
//	@SequenceGenerator(name = "seq_exam_subject", sequenceName = "seq_exam_subject")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Length(min=1, max=100)
	@ExcelField(title="科目名程", align=2, sort=30)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="parent_id")
	@NotFound(action = NotFoundAction.IGNORE)
	@NotNull
	public Subject getParent() {
		return parent;
	}

	public void setParent(Subject parent) {
		this.parent = parent;
	}

	
	@Length(min=1, max=255)
	public String getParentIds() {
		return parentIds;
	}

	public void setParentIds(String parentIds) {
		this.parentIds = parentIds;
	}
	
	
	
	

}
