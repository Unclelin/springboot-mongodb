package com.lin.extend.module.cms.controller.category;

import com.lin.extend.module.cms.common.Result;
import com.lin.extend.module.cms.common.ResultCode;
import com.lin.extend.module.cms.entity.base.Category;
import com.lin.extend.module.cms.service.category.CategoryService;
import com.lin.extend.module.cms.util.MongoPagerHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Autor: linjm
 * @Date : 2017/07/01
 * @Info : 栏目CategoryController restful
 */
@RestController
@RequestMapping("/api/v1.0/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * 获取列表页
     * @param pageNo
     * @param pageSize
     * @param
     * @return
     */
    @RequestMapping("")
    public Result list(@RequestParam(defaultValue = "1" , value = "pageNo", required = false) Integer pageNo ,
                       @RequestParam(defaultValue = "20" , value = "pageSize", required = false) Integer pageSize,
                       @RequestParam(defaultValue = "desc" , value = "order", required = false) String orderBy){
//        PageRequest page = null;
//        List<Category> list = categoryService.findAll();

//        MongoPagerHelper page = new MongoPagerHelper();
//        page.setPagenumber(pageNo);
//        if(pageSize!=20){
//            page.setPagerSize(pageSize);
//        }
//        Page<Category> list = categoryService.findByCategoryName("数码0", page);

        System.out.println(pageNo+"=="+pageSize);
        MongoPagerHelper pageable = new MongoPagerHelper();
        Query query = new Query();
//        List<Order> orders = new ArrayList<Order>();  //排序
//        orders.add(new Order(Sort.Direction.DESC, "id"));
        //排序规则
        List<String> orderlist = new ArrayList<String>();
        orderlist.add("categoryName");
        Sort sort = null;
        if(orderBy.toUpperCase().equals(Sort.Direction.DESC.toString())){
            sort = new Sort(Sort.Direction.DESC ,orderlist);
            System.out.println("desc");
        }else{
            sort = new Sort(Sort.Direction.ASC ,orderlist);
        }

        // 开始页
        pageable.setPageNo(pageNo);
        // 每页条数
        pageable.setPagesize(pageSize);
        // 排序
        pageable.setSort(sort);

        Page<Category> page = categoryService.findPage(query ,pageable);
        List<Category> list = page.getContent();
        for (int i = 0; i < list.size(); i++) {
            Category c= list.get(i);
            System.out.println("cName==="+c.getCategoryName());
        }
        Result result = new Result();
        result.setData(list);
        result.setMessage("获取成功");
        result.setCode(ResultCode.SUCCESS);
        return result;
    }

    /**
     * 保存
     * @param category
     * @return
     */
    @PostMapping("")
    public String addCategoruy(Category category){
        try{
//            for (int i=0; i<10; i++) {
//                Category category = new Category();
//                category.setCategoryName("数码"+i);
//                categoryService.save(category);
//            }
            categoryService.save(category);
        }catch (Exception e){
            e.printStackTrace();
            return "{'data':'data','msg':'操作失败,服务器异常','code':'500'}";
        }
        return "{'data':'data','msg':'操作成功','code':'200'}";
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public String deleteCategory(@PathVariable String id){
        try{
            categoryService.delete(id);
        }catch (Exception e){
            e.printStackTrace();
            return "{'data':'data','msg':'操作失败,服务器异常','code':'500'}";
        }
        return "{'data':'data','msg':'操作成功','code':'200'}";
    }

    /**
     * 更新
     * @param category
     * @return
     */
    @PutMapping("")
    public String updateCategory(Category category){
        try{
            //categoryService.save(id);
        }catch (Exception e){
            e.printStackTrace();
            return "{'data':'data','msg':'操作失败,服务器异常','code':'500'}";
        }
        return "{'data':'data','msg':'操作成功','code':'200'}";
    }

}
