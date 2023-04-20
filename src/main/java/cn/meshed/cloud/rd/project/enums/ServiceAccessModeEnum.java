package cn.meshed.cloud.rd.project.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * <h1>服务授权模式枚举</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@AllArgsConstructor
@Getter
@ToString
public enum ServiceAccessModeEnum {

    /**
     * 匿名
     */
    ANONYMOUS(0, "anonymous"),
    /**
     * 登入
     */
    LOGIN(1, "login"),
    /**
     * 授权
     */
    AUTHORIZE(3, "authorize"),
    ;

    @EnumValue
    private final int value;
    private final String ext;
}
