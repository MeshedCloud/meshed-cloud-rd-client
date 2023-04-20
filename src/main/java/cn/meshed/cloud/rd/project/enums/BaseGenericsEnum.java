package cn.meshed.cloud.rd.project.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * <h1>支持的基本泛型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@AllArgsConstructor
@Getter
@ToString
public enum BaseGenericsEnum {

    /**
     * 无
     */
    NONE(0, "none"),
    /**
     * List<T>
     */
    LIST(1, "List"),
    /**
     * Set<T>
     */
    SET(2, "Set"),
    /**
     * 路径参数（节约成本借用选项）
     */
    PATH_VARIABLE(3, "pathVariable"),
    /**
     * 路径参数（节约成本借用选项）
     */
    JSON(4, "json");

    /**
     * 存储值
     */
    @EnumValue
    private final int value;
    /**
     * 扩展
     */
    private final String ext;


}
