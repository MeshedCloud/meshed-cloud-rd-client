package cn.meshed.cloud.rd.deployment.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * <h1>仓库类型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@AllArgsConstructor
@Getter
@ToString
public enum WarehousePurposeTypeEnum {
    /**
     * 服务
     */
    SERVICE(1, "IMAGES"),
    /**
     * 前端
     */
    PAGE(2, "PAGE"),
    /**
     * 控制台
     */
    CONSOLE(3, "PAGE"),
    /**
     * 客户端
     */
    CLIENT(4, "MAVEN"),
    /**
     * 组件
     */
    ASSEMBLY(5, "MAVEN"),

    ;

    @EnumValue
    private final int value;
    private final String ext;
}
