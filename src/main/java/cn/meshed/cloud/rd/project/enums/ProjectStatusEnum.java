package cn.meshed.cloud.rd.project.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * <h1>项目状态</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@AllArgsConstructor
@Getter
@ToString
public enum ProjectStatusEnum {
    /**
     * 审批状态
     */
    APPLY(1, "apply"),
    /**
     * 研发状态
     */
    RD(2, "rd"),
    /**
     * 运行状态
     */
    RUN(3, "run"),
    /**
     * 废弃状态
     */
    DEPRECATED(4, "deprecated"),
    ;

    @EnumValue
    private final int value;
    private final String ext;
}
