package com.lin.extend.module.cms.repository.category;

import com.lin.extend.module.cms.entity.base.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @Author: cat-lin
 * @Description: 栏目mongodb repository
 * @Date: Create in 00:05 17/7/2
 * @Modified by:
 */
@Repository
public interface CategoryRepository extends MongoRepository<Category, String > {

    Category save(Category category);

    Category findById(String Id);

    Category findByCategoryName(String name);

    List<Category> findAll();

    void delete(String id);

//    Page<Category> findByCategoryName(String categoryName, Pageable var2);

//    List<Category> findByQuery(Category category, Query query, MongoPagerHelper page);
//
//    Long count(Category category,Query query);

}
