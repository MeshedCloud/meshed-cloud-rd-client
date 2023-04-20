package cn.meshed.cloud.rd.deployment.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * <h1>仓库类型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@AllArgsConstructor
@Getter
@ToString
public enum WarehouseStatusEnum {
    /**
     * 正常
     */
    NORMAL(1, "normal"),
    /**
     * 初始化中（脚手架创建项目先登记信息）
     */
    INIT(2, "init"),
    /**
     * 构建/导入失败
     */
    FAIL(3, "fail"),
    /**
     * 导入无权限
     */
    UNAUTHORIZED(4, "unauthorized"),

    ;

    @EnumValue
    private final int value;
    private final String ext;
}
