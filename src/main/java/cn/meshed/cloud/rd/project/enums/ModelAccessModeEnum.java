package cn.meshed.cloud.rd.project.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * <h1>模型授权模式枚举</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@AllArgsConstructor
@Getter
@ToString
public enum ModelAccessModeEnum {

    /**
     * 私有
     */
    PRIVATE(0, "private"),
    /**
     * 公开
     */
    PUBLIC(1, "public"),
    /**
     * 保护 项目内可见
     */
    PROTECTED(2, "protected"),

    ;

    @EnumValue
    private final int value;
    private final String ext;
}
