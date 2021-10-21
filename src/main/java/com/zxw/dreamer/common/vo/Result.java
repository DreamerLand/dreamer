package com.zxw.dreamer.common.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

/**
 * @author zxw
 * @date 2021-10-19
 */
@Data
public class Result implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 消息编码
     */
    private Integer code;
    /**
     * 消息内容
     */
    private String msg;
    /**
     * 响应数据
     */
    private Object data;
    /**
     * 时间戳
     */
    private Long timestamp;

    /**
     * 成功
     *
     * @return Result
     */
    public Result ok() {
        this.code = ResultCode.SUCCESS_CODE;
        this.data = true;
        this.msg = "成功";
        this.timestamp = Instant.now().getEpochSecond();
        return this;
    }

    /**
     * 成功带有数据
     *
     * @return Result
     */
    public Result ok(Object data) {
        this.code = ResultCode.SUCCESS_CODE;
        this.data = data;
        this.msg = "成功";
        this.timestamp = Instant.now().getEpochSecond();
        return this;
    }

    /**
     * 失败带有错误消息
     *
     * @return Result
     */
    public Result error(String msg) {
        this.code = ResultCode.ERROR_CODE;
        this.msg = msg;
        this.timestamp = Instant.now().getEpochSecond();
        return this;
    }
}
