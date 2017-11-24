package com.lin.extend.module.cms.service.category;

import com.lin.extend.module.cms.entity.base.Category;
import com.lin.extend.module.cms.util.MongoPagerHelper;
import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

/**
 * @Author: cat-lin
 * @Description:
 * @Date: Create in 09:00 17/7/2
 * @Modified by:
 */
public interface CategoryService {

    Category save(Category category);

    Category findById(String Id);

    Category findByCategoryName(String name);

    List<Category> findAll();

    void delete(String id);

    public Page<Category> findPage(Query query, MongoPagerHelper page);
//
//    Long count(Category category,Query query);

}
