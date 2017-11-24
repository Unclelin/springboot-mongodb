package com.lin.extend.module.cms.entity.base;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @Author: cat-lin
 * @Description: Category
 * @Date: Create in 00:05 17/7/2
 * @Modified by:
 */
@Data
@Document
public class Category extends BaseEntity{

    @Id
    private String id;

    /**
     * 栏目名称
     */
    private String categoryName;


}
