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
public enum OperateEnum {

    /**
     * 创建
     */
    NEW(1, "new"),
    /**
     * 编辑
     */
    EDIT(2, "edit"),
    /**
     * 读取
     */
    READ(3, "read"),
    /**
     * 复制
     */
    COPY(4, "copy"),
    ;

    @EnumValue
    private final int value;
    private final String ext;
}
