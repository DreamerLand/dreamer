package com.zxw.dreamer.base.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
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
 * 基础菜单表
 * </p>
 *
 * @author zxw
 * @since 2021-10-19
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("base_menu")
@ApiModel(value = "基础菜单表")
public class BaseMenuEntity extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;
    @ApiModelProperty("父级ID")
    private Long pid;
    @ApiModelProperty("菜单名称")
    private String name;
    @ApiModelProperty("路由_pc")
    private String urlPc;
    @ApiModelProperty("排序")
    private Integer sort;
    @ApiModelProperty("路由_app")
    private String urlApp;
    @ApiModelProperty("类型:菜单 menu,按钮 button, 超链接 a")
    private String type;
    @ApiModelProperty("菜单图标")
    private String icon;
    @ApiModelProperty("逻辑删除")
    @TableLogic
    private Boolean del;
    @ApiModelProperty("创建时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
      private LocalDateTime createDate;
    @ApiModelProperty("更新时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
      private LocalDateTime updateDate;
}
