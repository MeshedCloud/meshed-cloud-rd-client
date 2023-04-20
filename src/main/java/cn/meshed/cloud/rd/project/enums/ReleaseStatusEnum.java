package cn.meshed.cloud.rd.project.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * <h1>Jar 发行状态</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@AllArgsConstructor
@Getter
@ToString
public enum ReleaseStatusEnum {


    /**
     * 编辑中
     */
    EDIT(1, "edit"),
    /**
     * 待发布
     */
    PROCESSING(2, "processing"),

    /**
     * 快照发布
     */
    SNAPSHOT(3, "snapshot"),

    /**
     * 正式发布
     */
    RELEASE(4, "release"),

    ;

    @EnumValue
    private final int value;
    private final String ext;

}
