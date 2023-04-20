package cn.meshed.cloud.rd.deployment.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * <h1>仓库授权模式枚举</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@AllArgsConstructor
@Getter
@ToString
public enum WarehouseAccessModeEnum {

    /**
     * 私有
     */
    PRIVATE(0, "private"),
    /**
     * 公开
     */
    PUBLIC(1, "public"),

    ;

    @EnumValue
    private final int value;
    private final String ext;
}
