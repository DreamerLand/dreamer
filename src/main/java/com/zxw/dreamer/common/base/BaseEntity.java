package com.zxw.dreamer.common.base;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author zxw
 * @date 2021-10-19
 */
@Data
public class BaseEntity {

    @ApiModelProperty("创建人")
    private Long creator;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    @ApiModelProperty("创建时间")
    private LocalDateTime createDate;
    @ApiModelProperty("更新人")
    private Long updater;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    @ApiModelProperty("更新时间")
    private LocalDateTime updateDate;
}
