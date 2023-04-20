package cn.meshed.cloud.rd.project.query;

import com.alibaba.cola.dto.PageQuery;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;

/**
 * <h1>项目成员分页查询</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "成员分页查询")
public class ProjectMemberPageQry extends PageQuery {

    /**
     * 项目key
     */
    @Schema(description = "项目唯一标识不能为空")
    @NotBlank(message = "项目唯一标识不能为空")
    private String projectKey;
}
