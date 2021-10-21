package com.zxw.dreamer.base.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zxw.dreamer.common.base.BaseEntity;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 系统代码生成器日志表
 * </p>
 *
 * @author zxw
 * @since 2021-10-19
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("base_log_generator_table")
@ApiModel(value = "系统代码生成器日志表")
public class BaseLogGeneratorTableEntity extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;
    @ApiModelProperty("名称")
    private String name;
    @ApiModelProperty("字段个数")
    private Integer fieldSum;
    @ApiModelProperty("索引个数")
    private Integer indexSum;
    @ApiModelProperty("创建时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
      private LocalDateTime createDate;
    @ApiModelProperty("更新时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
      private LocalDateTime updateDate;
}
