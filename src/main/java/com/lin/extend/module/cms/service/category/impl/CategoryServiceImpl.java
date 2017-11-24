package com.lin.extend.module.cms.service.category.impl;

import com.lin.extend.module.cms.entity.base.Category;
import com.lin.extend.module.cms.repository.category.CategoryRepository;
import com.lin.extend.module.cms.service.category.CategoryService;
import com.lin.extend.module.cms.util.MongoPagerHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: cat-lin
 * @Description:
 * @Date: Create in 09:00 17/7/2
 * @Modified by:
 */
@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private MongoTemplate mongoTemplate;


    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category findById(String Id) {
        return categoryRepository.findById(Id);
    }

    @Override
    public Category findByCategoryName(String name) {
        return categoryRepository.findByCategoryName(name);
    }

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public void delete(String id) {
        categoryRepository.delete(id);
    }

    @Override
    public Page<Category> findPage(Query query, MongoPagerHelper page) {

        List<Category> list = mongoTemplate.find(query.with(page) ,Category.class);
        // 将集合与分页结果封装
        Page<Category> pagelist = new PageImpl<Category>(list, page, this.count(query));
        return pagelist;
    }
//
//    @Override
    public Long count(Query query) {
        return mongoTemplate.count(query ,Category.class);
    }

}
