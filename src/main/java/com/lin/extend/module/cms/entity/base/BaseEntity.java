package com.lin.extend.module.cms.entity.base;

import lombok.Data;

/**
 * @Author: cat-lin
 * @Description: BaseEntity
 * @Date: Create in 00:05 17/7/2
 * @Modified by:
 */
@Data
public class BaseEntity {

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 更新时间
     */
    private Long updateTime;


}
