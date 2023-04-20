package cn.meshed.cloud.rd.project.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * <h1>项目访问类型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@AllArgsConstructor
@Getter
@ToString
public enum ProjectVisitTypeEnum {
    /**
     * 活跃项目
     */
    LATELY(1, "lately"),
    /**
     * 参与的项目
     */
    MEMBER(2, "member"),
    /**
     * 负责项目
     */
    OWNER(3, "owner"),
    ;

    @EnumValue
    private final int value;
    private final String ext;
}
