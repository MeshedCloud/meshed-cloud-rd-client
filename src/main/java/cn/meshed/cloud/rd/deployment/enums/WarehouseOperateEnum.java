package cn.meshed.cloud.rd.deployment.enums;

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
public enum WarehouseOperateEnum {

    /**
     * 创建
     */
    NEW(1, "new"),
    /**
     * 编辑
     */
    IMPORT(2, "import"),
    ;

    private final int value;
    private final String key;
}
