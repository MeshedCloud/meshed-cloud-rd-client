package cn.meshed.cloud.rd.project.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * <h1></h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@AllArgsConstructor
@Getter
@ToString
public enum ServiceModelStatusEnum {
    /**
     * 信息登记状态
     */
    REGISTER(0, "register"),
    /**
     * 发行状态
     */
    RELEASE(1, "release"),
    /**
     * 研发状态
     */
    DEV(2, "dev"),
    /**
     * 测试状态
     */
    TEST(3, "test"),
    /**
     * 废弃状态
     */
    DEPRECATED(4, "deprecated"),
    /**
     * 异常状态
     */
    BUG(5, "bug"),
    /**
     * 下线状态
     */
    OFF(6, "off"),
    /**
     * 异常状态
     */
    ERROR(7, "error"),

    ;

    @EnumValue
    private final int value;
    private final String ext;
}
