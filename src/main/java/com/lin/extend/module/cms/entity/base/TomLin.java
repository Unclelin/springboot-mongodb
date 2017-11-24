package com.lin.extend.module.cms.entity.base;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @Author: cat-lin
 * @Description:
 * @Date: Created in 11:48 17/11/24
 * @Modified by:
 */
@Data
@Document
public class TomLin extends BaseEntity{

    @Id
    private String id;

    private String name;

    private String birth;

    private String job;

    private String experience;

    private Integer age;

    private String from;

    private String qq;

    private String email;

    private String phone;

}
