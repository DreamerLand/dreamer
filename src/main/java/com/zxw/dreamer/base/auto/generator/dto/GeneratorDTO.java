package com.zxw.dreamer.base.auto.generator.dto;

import lombok.Data;

/**
 * @author zxw
 * @date 2021-10-19
 */
@Data
public class GeneratorDTO {
    /**
     * 作者姓名
     */
    private String name;
    /**
     * java生成目标路径
     */
    private String url;
    /**
     * mapper生成目标路径
     */
    private String urlMapper;
    /**
     * 拼音
     */
    private String pinyin;
    /**
     * 微信
     */
    private String vxId;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 电话
     */
    private String phone;
    /**
     * 表名逗号拼接
     */
    private String tableNames;
    /**
     * 包名
     */
    private String packageName;
    /**
     * 父模块名
     */
    private String parentModuleName;
    /**
     * 子模块名
     */
    private String childrenModuleName;
}
