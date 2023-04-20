package cn.meshed.cloud.rd.project.query;

import com.alibaba.cola.dto.PageQuery;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <h1>成员分页查询</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "成员分页查询")
public class MemberPageQry extends PageQuery {

    /**
     * 查询禁用
     */
    @Schema(description = "查询禁用")
    private Boolean queryDisabled;
}
