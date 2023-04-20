package cn.meshed.cloud.rd.project.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * <h1>模型类型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@AllArgsConstructor
@Getter
@ToString
public enum ModelTypeEnum {

    /**
     * 操作模型
     */
    COMMAND(1, "Cmd"),
    /**
     * 查询模型
     */
    QUERY(2, "Qry"),
    /**
     * 数据模型
     */
    DTO(3, "DTO"),
    /**
     * 枚举模型
     */
    ENUM(4, "Enum"),
    /**
     * 事件模型
     */
    EVENT(5, "Event"),
    /**
     * 参数模型 （前端不展示）
     */
    PARAM(6, "Param"),
    /**
     * 分页参数模型 （前端不展示）
     */
    PAGE_PARAM(7, "PageParam"),
    /**
     * 前端视图模型 （前端不展示）
     */
    VO(8, "VO"),
    /**
     * 请求模型 （前端不展示）
     */
    REQUEST(9, "Request"),
    /**
     * 请求分页模型 （前端不展示）
     */
    PAGE_REQUEST(10, "PageRequest"),
    /**
     * 响应模型 （前端不展示）
     */
    RESPONSE(11, "Response"),

    ;

    @EnumValue
    private final int value;
    private final String ext;
}
