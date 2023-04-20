package cn.meshed.cloud.rd.project.command;

import cn.meshed.cloud.rd.project.enums.ProjectRoleEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * <h1>成员操作</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class MemberCmd {

    private static final long serialVersionUID = 1L;

    /**
     * 成员账号id 列表
     */
    @Schema(description = "账号id")
//    @NotEmpty(message = "账号id不能为空")
    private List<Long> userIds;


}
