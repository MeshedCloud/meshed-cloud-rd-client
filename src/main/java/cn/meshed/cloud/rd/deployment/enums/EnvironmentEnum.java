package cn.meshed.cloud.rd.deployment.enums;

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
public enum EnvironmentEnum {

    /**
     * 快照发布
     */
    SNAPSHOT(1, "snapshot"),

    /**
     * 正式发布
     */
    RELEASE(2, "release"),

    ;

    @EnumValue
    private final int value;
    private final String ext;
}
