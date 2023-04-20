package cn.meshed.cloud.rd.project.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * <h1>请求类型枚举</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@AllArgsConstructor
@Getter
@ToString
public enum RequestTypeEnum {


    /**
     * Get类型
     */
    GET(1, "get"),
    /**
     * Post类型
     */
    POST(2, "post"),
    /**
     * Put类型
     */
    PUT(3, "put"),
    /**
     * Delete类型
     */
    DELETE(4, "delete"),
    /**
     * Patch类型
     */
    PATCH(5, "patch"),
    /**
     * RPC类型 非Http请求类型
     */
    RPC(5, "patch"),
    ;

    @EnumValue
    private final int value;
    private final String ext;
}
