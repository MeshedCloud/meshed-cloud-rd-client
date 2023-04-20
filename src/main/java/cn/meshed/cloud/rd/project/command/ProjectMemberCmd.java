package cn.meshed.cloud.rd.project.command;

import cn.meshed.cloud.rd.project.enums.ProjectRoleEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * <h1>项目成员操作</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ProjectMemberCmd {

    private static final long serialVersionUID = 1L;

    /**
     * 成员ID
     */
    @Schema(description = "成员ID")
    @NotEmpty(message = "成员ID不能为空")
    private List<Integer> memberIds;

    /**
     * 服务分组标识 （className主体）
     */
    @Schema(description = "项目标识")
    @NotBlank(message = "项目标识不能为空")
    private String projectKey;


    /**
     * 项目成员的角色：管理员/开发者/浏览者
     */
    @Schema(description = "项目角色")
    @NotNull(message = "项目角色不能为空")
    private ProjectRoleEnum projectRole;


}
