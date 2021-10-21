package com.zxw.dreamer.base.auto.generator.controller;

import com.baomidou.mybatisplus.annotation.IdType;
import com.zxw.dreamer.base.auto.generator.dto.GeneratorDTO;
import com.zxw.dreamer.base.auto.generator.service.IGeneratorService;
import com.zxw.dreamer.common.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author zxw
 * @date 2021-10-19
 */
@RestController
@RequestMapping("generator")
public class GeneratorController {
    @Autowired
    private IGeneratorService service;

    @PostMapping("add")
    public Result generator(GeneratorDTO dto){
        return service.generator(dto);
    }

}
