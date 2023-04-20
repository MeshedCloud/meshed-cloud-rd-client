package cn.meshed.cloud.rd.project.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * <h1>项目角色</h1>
 *权限类型
 *
 * 20-浏览者
 * 30-开发者
 * 40-管理员
 * @author Vincent Vic
 * @version 1.0
 */
@AllArgsConstructor
@Getter
@ToString
public enum ProjectRoleEnum {
    /**
     * 浏览者
     */
    VISITOR(20, "VISITOR"),
    /**
     * 开发者
     */
    DEVELOPER(30, "developer"),
    /**
     * 管理员
     */
    ADMIN(40, "ADMIN"),
    ;

    @EnumValue
    private final int value;
    private final String ext;
}
