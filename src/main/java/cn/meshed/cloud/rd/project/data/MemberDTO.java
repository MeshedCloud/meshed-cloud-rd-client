package cn.meshed.cloud.rd.project.data;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * <h1>研发成员</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class MemberDTO {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @Schema(description = "ID")
    private Integer id;

    /**
     * 账号id
     */
    @Schema(description = "用户ID")
    private Long uid;

    /**
     * 仓库用户的ID
     */
    @Schema(description = "仓库用户的ID")
    private String thirdUid;

    /**
     * 用户名称
     */
    @Schema(description = "用户名称")
    private String name;

    /**
     * 登入账号
     */
    @Schema(description = "登入账号")
    private String loginId;
    /**
     * 手机号
     */
    @Schema(description = "手机号")
    private String phone;
    /**
     * 邮箱
     */
    @Schema(description = "邮箱")
    private String email;
    /**
     * 校验手机号
     */
    @Schema(description = "校验手机号")
    private Boolean validPhone;
    /**
     * 校验邮箱
     */
    @Schema(description = "校验邮箱")
    private Boolean validEmail;
    /**
     * 是否禁用
     */
    @Schema(description = "是否禁用")
    private Boolean disabled;

}
