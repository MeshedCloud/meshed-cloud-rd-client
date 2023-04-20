package cn.meshed.cloud.rd.project.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * <h1>项目类型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@AllArgsConstructor
@Getter
@ToString
public enum ProjectTypeEnum {
    /**
     * 应用服务
     */
    SERVICE(1, "service"),
    /**
     * 组件设施
     */
    ASSEMBLY(2, "assembly"),
    /**
     * 生态设施
     */
    INFRASTRUCTURE(3, "infrastructure"),
    ;

    @EnumValue
    private final int value;
    private final String ext;
}
