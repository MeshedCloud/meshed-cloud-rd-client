package cn.meshed.cloud.rd.project.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * <h1>请求参数模式</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@AllArgsConstructor
@Getter
@ToString
public enum RequestModeEnum {
    /**
     * 多参数
     */
    MULTIPLE(1, "multiple"),
    /**
     * 表单
     */
    FORM(2, "form"),
    /**
     * JSON
     */
    JSON(3, "json"),
    /**
     * 分页
     */
    PAGE(4, "page"),

    ;

    @EnumValue
    private final int value;
    private final String ext;
}
