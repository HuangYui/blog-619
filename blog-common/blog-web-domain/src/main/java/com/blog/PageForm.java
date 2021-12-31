package com.blog;

import lombok.Data;

import java.io.Serializable;

/**
 * @author HY
 */
@Data
public class PageForm implements Serializable{

	private static final long serialVersionUID = 1L;
	/**
	 * 当前页 默认第一页
	 */
    private int pageNumber = 1;
    /**
     * 每页的数量 默认20
     */
    private int pageSize = 20;
    
   /**
    * 总记录数
    */
    private long total;
    /**
     * 总页数
     */
    private int pages;
    /**
     * 搜索关键词
     */
    private String searchKeywords;
    /**
     * 搜索关键字类型判断 1-表示姓名搜索 0-表示手机号搜索 2无需模糊搜索
     */
    private String searchType;

}
