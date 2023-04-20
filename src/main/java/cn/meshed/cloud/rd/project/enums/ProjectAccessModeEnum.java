package cn.meshed.cloud.rd.project.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * <h1>项目授权模式枚举</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@AllArgsConstructor
@Getter
@ToString
public enum ProjectAccessModeEnum {

    /**
     * 正常研发
     */
    NONE(1, "none"),
    /**
     * 公共库
     */
    PUBLIC(2, "public"),
    /**
     * 核心涉密
     */
    CORE(3, "core"),
    /**
     * 内部开源
     */
    INNER_SOURCE(4, "inner_source"),
    ;

    @EnumValue
    private final int value;
    private final String ext;
}
