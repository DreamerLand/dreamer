package com.zxw.dreamer.base.auto.generator.service;

import com.zxw.dreamer.base.auto.generator.dto.GeneratorDTO;
import com.zxw.dreamer.common.vo.Result;

/**
 * @author zxw
 * @date 2021-10-19
 */
public interface IGeneratorService {
    /**
     * ไปฃ็ ็ๆ
     * @param dto dto
     * @return Result
     */
    Result generator(GeneratorDTO dto);
}
