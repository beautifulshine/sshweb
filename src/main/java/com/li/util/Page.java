package com.li.util;

import java.io.Serializable;
import java.util.List;

public class Page<T> implements Serializable {
   /**
    * 当前页
    */
  private int pageNum;
  /**
   * 页面大小
   */
  private int pageSize = 20;
  /**
   * mysql 分页记录开始的index(limit startNum,pageSize)
   */
  private int startNum;
  /**
   * 总页数
   */
  private int pageTotal;
  /**
   * 总记录数
   */
  private int itemTotal;
  /**
   * 结果集
   */
  private List<T> list;
  
  
  /**
   * previousPage 前一页
   */
  private int previousPage;
  /**
   * nextPage 下一页
   */
  private int nextPage;
  /**
   * firstPage 第一页
   */
  private int firstPage = 1;
  /**
   * lastPage 最后一页
   */
  private int lastPage;

}
