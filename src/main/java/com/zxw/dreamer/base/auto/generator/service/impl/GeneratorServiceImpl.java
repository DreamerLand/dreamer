package com.zxw.dreamer.base.auto.generator.service.impl;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.INameConvert;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.po.TableField;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.engine.BeetlTemplateEngine;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.baomidou.mybatisplus.generator.engine.VelocityTemplateEngine;
import com.baomidou.mybatisplus.generator.fill.Column;
import com.baomidou.mybatisplus.generator.fill.Property;
import com.zxw.dreamer.base.auto.generator.dto.GeneratorDTO;
import com.zxw.dreamer.base.auto.generator.service.IGeneratorService;
import com.zxw.dreamer.common.base.BaseEntity;
import com.zxw.dreamer.common.base.BaseMapper;
import com.zxw.dreamer.common.base.BaseServiceImpl;
import com.zxw.dreamer.common.base.IBaseService;
import com.zxw.dreamer.common.vo.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


import java.util.Collections;

/**
 * @author zxw
 * @date 2021-10-19
 */
@Component
public class GeneratorServiceImpl implements IGeneratorService {
    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;


    @Override
    public Result generator(GeneratorDTO dto) {
        DataSourceConfig.Builder dataSourceConfig = new DataSourceConfig
                .Builder(url,
                username,
                password);

        String packageName = "";
        if (dto.getParentModuleName() != null) {
            packageName = dto.getParentModuleName();
        }
        if (dto.getChildrenModuleName() != null) {
            packageName = packageName + "." + dto.getChildrenModuleName();
        }

        String finalPackageName = packageName;
        FastAutoGenerator.create(dataSourceConfig)
                // 全局配置
                .globalConfig((scanner, builder) ->
                        builder.author(dto.getPinyin())
                                .fileOverride()
                                .disableOpenDir()
                                .outputDir(dto.getUrl())
                                .commentDate("yyyy-MM-dd").build())
                // 包配置
                .packageConfig((scanner, builder) ->
                        builder.parent(dto.getPackageName())
                                .moduleName(finalPackageName)
                                .other("pages")
                                .pathInfo(Collections.singletonMap(OutputFile.mapperXml, dto.getUrlMapper())).build())
                // 模板配置
                .templateConfig((scanner, builder)->
                        builder .entity("/templates/entity.java")
                                .service("/templates/service.java")
                                .serviceImpl("/templates/serviceImpl.java")
                                .mapper("/templates/mapper.java")
                                .mapperXml("/templates/mapper.xml")
                                .controller("/templates/controller.java")
                                .build())
                // 注入配置
                .injectionConfig((scanner, builder)->
                        builder.beforeOutputFile((tableInfo, objectMap) -> {
                                    System.out.println("------------------------->tableInfo: " + tableInfo.getEntityName() + " objectMap: " + objectMap.size());
                                })
//                                .customMap(Collections.singletonMap("test", "z"))
//                                .customFile(Collections.singletonMap("test.vue", "/templates/test.vue.ftl"))
                                .build())
                // 策略配置
                .strategyConfig((scanner, builder) ->
                        builder.entityBuilder()
                                .superClass(BaseEntity.class)
                                .enableLombok()
                                .formatFileName("%sEntity")
                                .logicDeleteColumnName("del")
                                .addTableFills(new Property("createDate", FieldFill.INSERT_UPDATE))
                                .addTableFills(new Property("updateDate", FieldFill.INSERT_UPDATE))
                                .idType(IdType.ASSIGN_ID)
                                .controllerBuilder()
                                .enableRestStyle()
                                .serviceBuilder()
                                .superServiceClass(IBaseService.class)
                                .superServiceImplClass(BaseServiceImpl.class)
                                .formatServiceFileName("I%sService")
                                .formatServiceImplFileName("%sServiceImpl")
                                .mapperBuilder()
                                .superClass(BaseMapper.class)
                                .enableMapperAnnotation()
                                .formatMapperFileName("%sMapper")
                                .formatXmlFileName("%sMapper")
                                .build())
                .templateEngine(new VelocityTemplateEngine())
                .execute();

        return new Result().ok();
    }
}
