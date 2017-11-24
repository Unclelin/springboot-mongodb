package com.lin.extend.module.cms.controller;

import com.lin.extend.module.cms.common.Result;
import com.lin.extend.module.cms.common.ResultCode;
import com.lin.extend.module.cms.entity.base.TomLin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: cat-lin
 * @Description:
 * @Date: Created in 11:44 17/11/24
 * @Modified by:
 */
@RestController
@RequestMapping("resume")
public class ResumeController {

    @RequestMapping("/index")
    public Result Resume(){
        TomLin tomLin = new TomLin();
        tomLin.setName("林建茂");
        tomLin.setAge(32);
        tomLin.setBirth("1986-05-16");
        tomLin.setExperience("6 years");
        tomLin.setEmail("578169426@qq.com");
        tomLin.setFrom("广西柳州");
        tomLin.setJob("JAVA Developer");
        tomLin.setPhone("15910576548");
        tomLin.setQq("578169426");
        Result result = new Result();
        result.setData(tomLin);
        result.setMessage("林建茂-dev");
        result.setCode(ResultCode.SUCCESS);
        return result;
    }
}
