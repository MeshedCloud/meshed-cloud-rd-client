package cn.meshed.cloud.rd.deployment.enums;

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
public enum WarehouseRelationEnum {

    /**
     * 平台构建
     */
    BUILD(1, "build"),
    /**
     * 其他仓库导入
     */
    IMPORT(2, "import"),
    /**
     * 不具备导入条件仅为登记
     */
    REGISTER(3, "register"),
    ;

    @EnumValue
    private final int value;
    private final String ext;
}